import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class user {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: user <nbr>");
            System.exit(1);
        }

        try {
            String serverAddress = args[0];
            int nbr = Integer.parseInt(args[1]);
     

            Registry registry = LocateRegistry.getRegistry(serverAddress, 1099);
            Interface user1 = (Interface) registry.lookup("admin1");

            int prix = user1.demandeprix(150);
            System.out.println("le prix est" +prix);
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
