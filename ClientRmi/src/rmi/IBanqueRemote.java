package rmi;
import java.rmi.*;
import java.util.List;

import metier.Compte;
public interface IBanqueRemote extends Remote{
   public double conversion(double mt)throws RemoteException;
   public Compte consulteCompte(int code) throws RemoteException;
   public List<Compte> listeComptes() throws RemoteException;
}
