package cn.edu.nju.jw.exception;

import java.rmi.RemoteException;

public class CourseNotExistException extends Exception{
	 private String faultInfo; 
	    private static final long serialVersionUID = 1L;   
	  
	    public CourseNotExistException(String message, String faultInfo) {   
	    	  super(message);
	          this.faultInfo = faultInfo;
	    }   
}
