package com.urdomain.project;

public class AddNewToilet {
	// 화장실 위치
	double toiletLatitude = 0.0;
	double toiletLongitude = 0.0;
	
	// 화장실 정보 (Yes or No)
	boolean isForDisabledPerson = true;
	boolean isOpenForPublic = true;
	boolean isDiaperDck = true;
	boolean isUnisexToilet = true;
	boolean isSink = true;
	
	String id;
	int levelOfSafety = 0;
	
	//  화장실 정보를 서버에 저장한다.
	public void saveToiletInformation(double toiletLatitude, double toiletLongitude, boolean isForDisabledPerson, boolean isOpenForPublic, boolean isDiaperDck, boolean isUnisexToilet, boolean isSink, String id, int levelOfSafety) {
		//
	}
	
	// 사진을 찍을 시 카메라를 활성화 한다.
	public void turnOnCamera() {
		// turn on the camera
	}
	
}
