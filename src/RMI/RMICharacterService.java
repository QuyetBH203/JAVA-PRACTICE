package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMICharacterService extends UnicastRemoteObject implements CharacterService{
    protected RMICharacterService() throws RemoteException {
        super();
    }

    @Override
    public String requestCharacter(String studentCode, String qCode) throws RemoteException {
        return "";
    }

    @Override
    public void submitCharacter(String studentCode, String qCode, String strSubmit) throws RemoteException {

    }
}
