package RMI;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class RmiDataClient {
    public  static List<Integer> primeFactorial(int n){
        List<Integer> arr = new ArrayList<>();
        for(int i=2;i<Math.sqrt(n);i++){
            while (n%i==0){
                arr.add(i);
                n /=i;
            }

        }
        if(n >1){
            arr.add(n);
        }
        return arr;
    }
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        DataService dataService = (DataService) Naming.lookup("//203.162.10.109/RMIDataService");
        String studentCode ="B21DCCN641";
        String qCode ="TgFo6VTy";
        Object response = dataService.requestData(studentCode, qCode);
        System.out.println(response);
        int n = (Integer) response;
        System.out.println(n);
        List<Integer> ans= primeFactorial(n);
        System.out.println(ans);
        List<String> tmpAns = new ArrayList<>();
        for(Integer x: ans){
            tmpAns.add(String.valueOf(x));
        }
        String request = String.join(", ",tmpAns);
        System.out.println("["+request+"]");
        dataService.submitData(studentCode,qCode,ans);

    }
}
