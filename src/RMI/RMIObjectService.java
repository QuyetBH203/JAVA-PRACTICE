package RMI;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIObjectService extends UnicastRemoteObject implements ObjectService{
    protected RMIObjectService() throws RemoteException {
        super();
    }

    @Override
    public Serializable requestObject(String studentCode, String qAlias) throws RemoteException {
        return null;
    }

    @Override
    public void submitObject(String studentCode, String qAlias, Serializable object) throws RemoteException {

    }
}
