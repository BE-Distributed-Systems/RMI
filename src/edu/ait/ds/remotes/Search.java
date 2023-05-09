/**
 * 
 */
package edu.ait.ds.remotes;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author prabh
 *
 */
public interface Search extends Remote {
	
	// Declaring the method prototype 
	public String query(String search) throws RemoteException; 

	
}
