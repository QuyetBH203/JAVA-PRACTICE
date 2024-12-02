package TCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TcpObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            Socket client = new Socket("203.162.10.109",2209);
            String request ="B21DCCN641;YdlIgwnB";
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());

            out.writeObject(request);
            out.flush();
            Customer customer918 = (Customer) in.readObject();
            customer918.normalizeName();
            customer918.normalizeDate();
            System.out.println(customer918);
            out.writeObject(customer918);
            out.flush();
            out.close();
            in.close();
            client.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
