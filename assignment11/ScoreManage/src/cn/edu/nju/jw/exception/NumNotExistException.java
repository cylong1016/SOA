package cn.edu.nju.jw.exception;

public class NumNotExistException extends Exception{
	  private String faultInfo; 
	    private static final long serialVersionUID = 1L;   
	  
	    public NumNotExistException(String message, String faultInfo) {   
	    	  super(message);
	          this.faultInfo = faultInfo;
	    }   
}
