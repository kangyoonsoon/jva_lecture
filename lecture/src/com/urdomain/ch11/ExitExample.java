package com.urdomain.ch11;

public class ExitExample {
	// ????? 잘 이해가 안감..써먹을 일이 있을까?
	public static void main(String[] args) {
		// 보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for(int i = 0; i < 10; i++) {
			
			// i값 출력
			
			System.out.println("i: " + i);
			try {
				// JVM 종료 요청
				System.exit(i);
			} catch(SecurityException e) {
				//
			}
		}
	}

}
