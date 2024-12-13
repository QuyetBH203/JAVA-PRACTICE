package UDP;

import java.io.IOException;
import java.net.*;
import java.util.*;
import java.util.stream.Collectors;

public class UdpData {
    public static void main(String[] args) {
        try {
            DatagramSocket client = new DatagramSocket();
            String request =";B21DCCN641;YakUYvvj";
            DatagramPacket dp = new DatagramPacket(request.getBytes(),request.getBytes().length,
                    InetAddress.getByName("203.162.10.109"),2207);
            client.send(dp);
            byte[] buf = new byte[1024];
            DatagramPacket du = new DatagramPacket(buf, buf.length);
            client.receive(du);
            System.out.println(new String(du.getData()).trim());
            String response = new String((du.getData())).trim();
            String[] arr =response.split(";");
            System.out.println(arr[0]+" "+arr[1]);
            String[] numbers = arr[2].trim().split(",");
            List<Integer> intList = Arrays.stream(numbers)
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .toList();
            List<Integer> ans = new ArrayList<>();
            for(int i=1;i<=Integer.parseInt(arr[1]);i++){
                if(!intList.contains(i)){
                    ans.add(i);
                }
            }
            System.out.println(ans);
            List<String> result = ans.stream()
                    .map(String::valueOf)
                    .toList();
            String reSend =arr[0]+";"+String.join(",",result);
            System.out.println(reSend);
            DatagramPacket ds= new DatagramPacket(reSend.getBytes(),
                    reSend.getBytes().length,InetAddress.getByName("203.162.10.109"),2207);
            client.send(ds);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
