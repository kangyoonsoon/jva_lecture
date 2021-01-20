package com.urdomain.ch11;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// 매개값이 Member 타입인지 확인
		if(obj instanceof Member) {			
			Member member =(Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;  // 매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴
	}
	
	@Override
	public int hashCode() {
		return id.hashCode(); // id가 동일한 문자열인 경우 같은 해시코드를 리턴
	}
}
