package cn.edu.nju.exception;

import java.rmi.RemoteException;

public class NoDataException extends RemoteException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorMessage = "NoData:«Î ‰»Î ˝æ›";
	
	public NoDataException() {
		
	}
	
	public void printErrorMessage(){   
        System.out.println(errorMessage);   
    }  

}
