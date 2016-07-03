package cn.edu.nju.jw.exception;

import java.rmi.RemoteException;

public class ScoreFormatException extends Exception{
	 private String faultInfo; 
	    private static final long serialVersionUID = 1L;   
	  
	    public ScoreFormatException(String message, String faultInfo) {   
	    	  super(message);
	          this.faultInfo = faultInfo;
	    }   
}
