package com.urdomain.test;

public class SearchText {

	String [][] title = {
			{"제목", "작성자", "작성일", "조회"}, 
			{"띵글 스톡 체험판 이렇게 사용하세요~ [1]","라온 정달","2020.09.02.", "262"},
			{"[공지] 일요일 오후 9시 방송 시작합니다.","프로그","2020.12.27.","34"},
			{"[필독]​2020년 12월 신규 탐험대를 모집합니다. [3]","라온 정달","2020.12.03.","54"},
			{"[공지] 프로그 지분 15구좌 양도합니다. [6]","프로그","2020.10.27.","248"},
			{"[공지] 프로그 차트 특허 등록이 결정되었습니다. [29]","프로그","2020.09.30.","262"},
			{"[필독] 신입 회원 필독사항입니다. [123]","라온 정달","2020.03.03.","1,731"},
			{"[공지] 주식 양도 절차 [3]","프로그","2020.07.26.","198"},
			{"[공지] 이 카페를 찾아 오신 분들께 [75]","프로그","2020.03.25.","591"},
			{"[이벤트] 띵글 구매하면 선물이 팡팡!! [38]","라온 정달","2019.10.31.","805"}
	};

	public static void main(String[] args) {
		//타이틀 리스트에서 텍스트 검색
		SearchText st = new SearchText();
		String[] arrayText = new String[10];
		arrayText = st.searchTextinTitle("2020");
		for (String text: arrayText) {
			if (text == null) {
				continue;
			} else {				
				System.out.println("검색된 단어: " + text);
			}
		}
	}
	
	public String[] searchTextinTitle (String str) {
		String[] result = new String[10];
		int idx = 0;
		for (int i = 0; i < title.length ; i++) {
			for(int j =0;j < title[i].length; j++) {
				if(title[i][j].contains(str)) {
//					System.out.println("검색되었습니다.");
					result[idx++] = title[i][j]; 
				} else {
					//
				}
			}
		}
		return result;
	}

}
