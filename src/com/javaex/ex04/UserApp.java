package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		//메인
		User[] info = new User[3];
		User userInfo1 = new Customer("jws", "j1234", "정우성", 1000);
		User userInfo2 = new Customer("yjs", "y2345", "이효리", 2000);
		User staff = new Employee("master", "m7788", "운영자", 5000000);
		
		info[0] = userInfo1;
		info[1] = userInfo2;
		info[2] = staff;
		
		for(int i=0; i<info.length; i++) {
			info[i].showInfo();
		}
	}

}
