package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalClient {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        CalInf cal = (CalInf) Naming.lookup("rmi://localhost/call");
        System.out.println("sum: "+ cal.add(100,200));
    }
}
