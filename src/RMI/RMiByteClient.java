package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMiByteClient {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        String studentCode ="B21DCCN641";
        String qCode ="Vr24c6jJ";
        ByteService byteService = (ByteService) Naming.lookup("//203.162.10.109/RMIByteService");
        Object response = byteService.requestData(studentCode,qCode);
        System.out.println(response);

    }
}
