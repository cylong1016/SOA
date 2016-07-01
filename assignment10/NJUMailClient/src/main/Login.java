package main;

import java.rmi.RemoteException;

import service.MailLoginPortProxy;

public class Login {

	public static void main(String[] args) {
		MailLoginPortProxy mail = new MailLoginPortProxy();
		try {
			String msg = mail.login("131250181@smail.nju.edu.cn", "Cyl941016");
			System.out.println(msg);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
