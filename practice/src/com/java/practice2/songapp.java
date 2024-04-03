package com.java.practice2;

public class songapp {

	public static void main(String[] args) {

		song s = new song();
		

		s.settitle(null);
		s.setyear(0);
		s.setcomposer(null);
		s.setartist(null);
		s.setalbum(null);
		s.settrack(0);

		s.showinfo();
	}

}
