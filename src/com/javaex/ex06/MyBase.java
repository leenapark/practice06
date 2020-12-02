package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성
    //필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	
	public void service(String state) {//부모 상속자와 같으면 덮어씌울 수 있다 = 오버라이딩
		if(state.equals("낮")) {
			day();
		}else if(state.equals("밤")) {
			super.night();
		}else if(state.equals("오후")) {
			afternoon();
		}
	}
	
	public void day() {
		System.out.println("낮에는 열심히 수업 듣자");
	}
	
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
	
}
