package TCP;

import java.io.*;
import java.net.Socket;

public class TcpCharacter {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("203.162.10.109", 2208);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String studentCode = "B21DCCN641;21REx03c";
            bw.write(studentCode);
            bw.newLine();
            bw.flush();
            String response = br.readLine();
            System.out.println(response);
            StringBuilder str1 = new StringBuilder();
            StringBuilder str2 = new StringBuilder();
            for (int i = 0; i < response.length(); i++) {
                if ((response.charAt(i) >= 48 && response.charAt(i) <= 57) || (response.charAt(i) >= 65 &&
                        response.charAt(i) <= 90) || (response.charAt(i) >= 97 && response.charAt(i) <= 122)) {
                    str1.append(response.charAt(i));
                } else {
                    str2.append(response.charAt(i));
                }
            }
            System.out.println(str2);
            System.out.println(str1);
            bw.write(str1.toString());
            bw.newLine();
            bw.flush();
            bw.write(str2.toString());
            bw.newLine();
            bw.flush();
            bw.close();
            br.close();
            client.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
