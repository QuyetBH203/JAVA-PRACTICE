package RMI;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CalServer {
    public static void main(String[] args) throws MalformedURLException, AlreadyBoundException, RemoteException {
        LocateRegistry.createRegistry(1099);
        Caculator cal = new Caculator();
        Naming.bind("rmi://localhost/call",cal);
        System.out.println("success");
    }
}

