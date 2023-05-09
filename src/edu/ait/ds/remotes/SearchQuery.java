package edu.ait.ds.remotes;

import java.rmi.*;
import java.rmi.server.*;

public class SearchQuery extends UnicastRemoteObject implements Search { 
	
	
	// Implementation of the query interface
	public SearchQuery() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String query(String search) throws RemoteException {
		String result;
		if (search.equals("Reflection in Java"))
			result = "Found";
		else
			result = "Not Found";
		return result;
	}
}
