package UDP;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class UdpString {
    public static void main(String[] args) throws IOException {
        DatagramSocket client = new DatagramSocket();
        String request=";B21DCCN641;QRfswg0W";
        DatagramPacket ds = new DatagramPacket(request.getBytes(), request.getBytes().length,
                InetAddress.getByName("203.162.10.109"),2208);
        client.send(ds);
        byte[] buf= new byte[1024];
        DatagramPacket du = new DatagramPacket(buf, buf.length);
        client.receive(du);
        String response = new String(du.getData()).trim();
        System.out.println(response);
        String[] arr = response.split(";");
        System.out.println(arr[1]);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(int i=0;i< arr[1].length();i++){
            if(!map.containsKey(String.valueOf(arr[1].charAt(i)))){
                map.put(String.valueOf(arr[1].charAt(i)),1);
            }else{
                map.compute(String.valueOf(arr[1].charAt(i)), (k, count) -> count + 1);
            }
        }
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
        for(Map.Entry<String, Integer> x: sortedMap.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
        List<String> tmp = new ArrayList<>(sortedMap.keySet());
        String target = tmp.getFirst();
        System.out.println(target);
        StringBuilder ans = new StringBuilder(arr[0] + ";" + tmp.getFirst() + ":");
        for(int i=0;i<arr[1].length();i++){
            if(String.valueOf(arr[1].charAt(i)).equals(tmp.getFirst())){
                ans.append(i+1).append(",");
            }
        }
        System.out.println(ans);
        DatagramPacket da = new DatagramPacket(ans.toString().getBytes(),ans.toString().getBytes().length,
        InetAddress.getByName("203.162.10.109"),2208);
        client.send(da);

    }
}
