package appPack;

import java.util.ArrayList;
import java.util.List;

import usingInterface.IUser;
import usingInterface.UserClass;

public class MainApp {

	public static void main(String[] args) {
		
		UserClass us = new UserClass();
		int age = us.fncUserAge();
		String path = us.fncUserPhoto(100, 100);
		String name = us.fncUserName(10);
		
		System.out.println("age : " + age);
		System.out.println("path : " + path);
		System.out.println("name : " + name);
		
		String namex = "Erkan"; 
		
		IUser usn = new UserClass();
		usn.fncUserAge();
		// usn -> yetenekler neler
		// a -> UserClass()
		// b -> IUser
		// c -> UserClass() && IUser
		
		List<String> ls = new ArrayList<>();
		
		
		IUser iuser = new IUser() {
			
			@Override
			public String fncUserName(int id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int fncUserAge() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		iuser.write();
		
		
	}

}
