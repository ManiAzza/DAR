package tp5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    String maj(String s) throws RemoteException;
    int index(String s, char a) throws RemoteException;
    Boolean pal(String s) throws RemoteException;
}
