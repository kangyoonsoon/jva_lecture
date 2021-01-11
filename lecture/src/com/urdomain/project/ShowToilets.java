package com.urdomain.project;

public class ShowToilets {
	
	// 화장실 위치
	String toiletName;
	String toiletIcon;
	double toiletLatitude = 0.0; 
	double toiletLongitude = 0.0;
	
	// 지도 이미지
	String GPSimage = "";
	
	// 지명
	String locationName;
	double locationLatitude = 0.0;
	double locationLongitude = 0.0;
	
	// 사용자의 현위치 가져오기(x좌표)
	public double getMyCurrentX() {
		return 0.0;
	}
	
	// 사용자의 현위치 가져오기(y좌표)
	public double getMyCurrentY() {
		return 0.0;
	}
	
	// 사용자의 현위치 보여주기
	public void showCurrentLocation(double x, double y) {
		
	}
	
	// 특정 화장실 클릭 하면 자세한 정보를 보여준다.
	public void shwoToiletInformatoin(double x, double y) {
		
	}
	
}
