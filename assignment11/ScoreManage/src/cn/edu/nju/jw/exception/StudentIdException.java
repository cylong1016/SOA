package cn.edu.nju.jw.exception;

public class StudentIdException extends Exception{
	private String faultInfo; 
    private static final long serialVersionUID = 1L;   
  
    public StudentIdException(String message, String faultInfo) {   
    	  super(message);
          this.faultInfo = faultInfo;
    }   
}
