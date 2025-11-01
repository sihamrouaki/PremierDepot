package EntrepriseRmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import metier.Compte;
import rmi.IBanqueRemote;

public class ClientRmi {

	public static void main(String[] args) {
		try {
			IBanqueRemote stub=(IBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
			System.out.println("Consultation d'un compte a distance");
			System.out.println(stub.conversion(9000));
			Compte cp=stub.consulteCompte(1);
			System.out.println("Code="+cp.getCode());
			System.out.println("Solde="+cp.getSolde());
			System.out.println("date="+cp.getDateCreation());
			
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
