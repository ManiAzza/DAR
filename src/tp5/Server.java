package tp5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public String sayHello() {
        return "Hello World !!";
    }

    @Override
    public String maj(String s){return s.toUpperCase(Locale.ROOT); }

    @Override
    public int index(String s, char a) throws RemoteException {
        if (s.contains("a"))
              return (s.indexOf(a));
        else
        return -1;
    }

    @Override
    public Boolean pal(String s) throws RemoteException {

        for (int i=0; i< s.length() ;i++)
        {
            if  (s.charAt(i) != s.charAt(s.length()-1-i))
                return false;

        }
             return true;

    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
