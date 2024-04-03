package com.javaex.basic.reftypes;

public class week {
	
	private final static int MONDAY = 1;
    private final static int TUESDAY = 2;
    private final static int WEDNESDAY = 3;
    private final static int THURSDAY = 4;
    private final static int FRIDAY = 5;
    private final static int SATURDAY = 6;
    private final static int SUNDAY = 7;
			
	public static void main(String[] args) {

		int day = week.MONDAY;
		
		switch (day) {
		case week.MONDAY:
			System.out.println("월요일입니다.");
			break;
		
		}
	}

}
