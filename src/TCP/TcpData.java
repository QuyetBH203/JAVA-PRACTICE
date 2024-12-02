package TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpData {
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static int lcm (int a, int b){
        return a/gcd(a,b)*b;
    }
    public static void main(String[] args) throws IOException {
        String studentCode = "B21DCCN641;jPd4iR1s";
        Socket socket = new Socket("203.162.10.109",2207);
        socket.setSoTimeout(3000);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF(studentCode);
        out.flush();
        int a = in.readInt();
        int b = in.readInt();
        System.out.println(a+" "+b);

        int ucln = gcd(a,b);
        System.out.println(ucln);
        int bcnn = lcm(a,b);
        int tong =a+b;
        int tich = a*b;
        out.writeInt(ucln);
        out.flush();
        out.writeInt(bcnn);
        out.flush();
        out.writeInt(tong);
        out.flush();
        out.writeInt(tich);
        out.flush();
        socket.close();


    }
}
