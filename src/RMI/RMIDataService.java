package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIDataService extends UnicastRemoteObject implements DataService {
    protected RMIDataService() throws RemoteException {
        super();
    }

    @Override
    public Object requestData(String studentCode, String qCode) throws RemoteException {
        return null;
    }

    @Override
    public void submitData(String studentCode, String qCode, Object data) throws RemoteException {

    }
}
