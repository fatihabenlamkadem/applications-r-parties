import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
    int encherprix(int p) throws RemoteException;
    int demandeprix(int p1) throws RemoteException;
    void comparaison(int p, int p1) throws RemoteException;
    void accepter(int p) throws RemoteException;
 
}
