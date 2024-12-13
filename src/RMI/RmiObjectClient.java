package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiObjectClient {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        String studentCode = "B21DCCN641";
        String qAlias ="5VwL8lM7";
        ObjectService objectService = (ObjectService)  Naming.lookup("//203.162.10.109/RMIObjectService");
        Object response = objectService.requestObject(studentCode,qAlias);
        System.out.println(response);


    }
}
