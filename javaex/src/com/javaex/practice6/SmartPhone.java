package com.javaex.practice6;

public class SmartPhone extends MusicPhone{
	
	public void execute(String str) {
		if("앱".equals(str)) {
			runApp();
		}else{
			super.execute(str);
		}
	}
	
	
	protected void runApp() {
		System.out.println("앱실행");
	}

}
