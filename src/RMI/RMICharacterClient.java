package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Base64;

public class RMICharacterClient {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        String studentCode ="B21DCCN641";
        String qCode ="bCgkuSHF";
        CharacterService characterService = (CharacterService) Naming.lookup("//203.162.10.109/RMICharacterService");
        Object response = characterService.requestCharacter(studentCode,qCode);
        System.out.println(response);
        String encoded = Base64.getEncoder().encodeToString(response.toString().getBytes());
        System.out.println(encoded);
        characterService.submitCharacter(studentCode,qCode,encoded);

    }
}
