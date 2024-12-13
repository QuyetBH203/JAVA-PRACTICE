package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Caculator extends UnicastRemoteObject implements  CalInf{
     Caculator() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        System.out.println("client request");
        return a+b;
    }
}
