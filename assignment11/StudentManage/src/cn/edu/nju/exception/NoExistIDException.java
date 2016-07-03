package cn.edu.nju.exception;

import java.rmi.RemoteException;

public class NoExistIDException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorMessage = "InvalidData:¸ÃID²»´æÔÚ ";   
	
	public NoExistIDException() {   
		
    }   
  
    public void printErrorMessage(){   
        System.out.println(errorMessage);   
    }   

}
