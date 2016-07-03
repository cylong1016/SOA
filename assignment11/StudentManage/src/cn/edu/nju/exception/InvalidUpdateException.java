package cn.edu.nju.exception;

import java.rmi.RemoteException;

public class InvalidUpdateException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorMessage = "InvalidData:ÐÞ¸ÄÐÅÏ¢´íÎó";
	
	public InvalidUpdateException() {   
		
    }   
  
    public void printErrorMessage(){   
        System.out.println(errorMessage);   
    }   
 

}
