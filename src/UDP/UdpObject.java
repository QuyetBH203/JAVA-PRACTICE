package UDP;

import java.io.*;
import java.net.*;

public class UdpObject {
    public static void main(String[] args) {
        try {
            DatagramSocket client = new DatagramSocket();
            String request =";B21DCCN641;SQU8xcXA";
            DatagramPacket dp = new DatagramPacket(request.getBytes(),request.getBytes().length,
                    InetAddress.getByName("203.162.10.109"),2209);
            client.send(dp);
            byte[] buf = new byte[1024];
            DatagramPacket du = new DatagramPacket(buf,buf.length);
            client.receive(du);
            String requestId = new String(du.getData(),0,8);
            System.out.println(requestId);
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(du.getData(),
                    8,du.getLength()-8));
            Customer customer =(Customer) in.readObject();
            System.out.println(customer);
            customer.normalizeDate();
            customer.normalizeName();
            System.out.println(customer);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            out.write(requestId.getBytes(),0,8);
            ObjectOutputStream os = new ObjectOutputStream(out);
            os.writeObject(customer);
            os.flush();
            byte[] data = out.toByteArray();
            DatagramPacket rs = new DatagramPacket(data,data.length,
                    InetAddress.getByName("203.162.10.109"),2209);
            client.send(rs);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
