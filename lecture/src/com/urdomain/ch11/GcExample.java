package com.urdomain.ch11;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1); // 쓰레기 됨
		emp = null;
		emp = new Employee(2); // 쓰레기 됨
		emp = new Employee(3);
		
		System.out.println("emp가 최종적으로 참조하는 사원번호");
		System.out.println("emp.eno");
		System.gc(); //<- 쓰레기 수집기 실행 요청
	}
}

class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") 이 메모리에 생성됨" );
	}
	
	// 소멸자
	public void finalize() {
		System.out.println("Employee(" + eno + ") 이 메모리에서 제거됨");
	}
	
}
