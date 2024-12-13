package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIByteService extends UnicastRemoteObject implements ByteService{

    protected RMIByteService() throws RemoteException {
        super();
    }

    @Override
    public byte[] requestData(String studentCode, String qCode) throws RemoteException {
        return new byte[0];
    }

    @Override
    public void submitData(String studentCode, String qCode, byte[] data) throws RemoteException {

    }
}
