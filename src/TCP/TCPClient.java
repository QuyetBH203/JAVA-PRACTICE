package TCP;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        String host = "203.162.10.109"; // Thay bằng địa chỉ IP của server
        int port = 2206;

        try (Socket client = new Socket(host, port)) {
            // Thiết lập thời gian chờ 5 giây
            client.setSoTimeout(5000);

            // Gửi mã sinh viên và mã câu hỏi
            OutputStream os = client.getOutputStream();
            String request = "B16DCCN641;xJI9xse8"; // Mã sinh viên và mã câu hỏi
            os.write(request.getBytes());
            os.flush();

            // Nhận chuỗi số nguyên từ server
            InputStream is = client.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String response = reader.readLine();
            System.out.println("Received from server: " + response);

            // Tìm chuỗi con tăng dần dài nhất
            int maxLength = findLongestIncreasingSubsequence(response);
            System.out.println("Length of longest increasing subsequence: " + maxLength);

            // Gửi kết quả lên server
            String result = String.valueOf(maxLength);
            os.write(result.getBytes());
            os.flush();

            System.out.println("Result sent to server. Closing connection...");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Hàm tìm độ dài chuỗi con tăng dần dài nhất
    private static int findLongestIncreasingSubsequence(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String[] parts = numbers.split(",");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }

        // Sử dụng thuật toán động (Dynamic Programming) để tìm LIS
        int[] dp = new int[nums.length];
        int maxLength = 1;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1; // Tất cả phần tử ban đầu có LIS là 1
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }
}

