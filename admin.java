import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class admin extends UnicastRemoteObject implements Interface{
    protected admin() throws RemoteException {
        super();
    }


    
    int p = 100;
    public int encherprix(int p) throws RemoteException {
        System.out.println("le prix de produit est" +p);
	return p;
    }

    public int demandeprix(int p1) throws RemoteException {
	return p1;
    }

    public void comparaison(int p, int p1) throws RemoteException {
        if (p1 > p){
		p = p1;
		demandeprix(p1);
	}

	else {
		System.out.println("le prix est refusé");
		demandeprix(p1);
		}
    }

    public void accepter(int p){
		System.out.println("le prix de vendre est: " +p);}



    public static void main(String[] args) {
        try {
            admin admin1 = new admin();
            java.rmi.registry.LocateRegistry.createRegistry(1099).rebind("admin", admin1);
            System.out.println("Serveur RMI prêt.");
        } catch (Exception e) {
            e.printStackTrace();
       }
    }
}
