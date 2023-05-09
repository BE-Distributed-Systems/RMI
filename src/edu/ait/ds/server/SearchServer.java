package edu.ait.ds.server;

import java.rmi.*;
import java.rmi.registry.*;

import edu.ait.ds.remotes.Search;
import edu.ait.ds.remotes.SearchQuery;



public class SearchServer {
	public static void main(String args[]) {
		try {
			
			Search search = new SearchQuery();
			LocateRegistry.createRegistry(1900);
			Naming.rebind("rmi://localhost:1900"+ "/REMOTE_SEARCH", search);
			System.out.println("Server Started");
		} catch (Exception ae) {
			System.out.println(ae);
		}
	}
}