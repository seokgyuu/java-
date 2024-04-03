package com.java.practice2;

public class song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void settitle(String title) {
		this.title = title;
	}
	public String gettitle() {
		return title;
	}
	public void setartist(String artist) {
		this.artist = artist;
	}
	public String getartist() {
		return artist;
	}
	public void setalbum(String album) {
		this.album = album;
	}
	public String getalbum() {
		return album;
	}
	public void setcomposer(String composer) {
		this.composer = composer;
	}
	public String getcomposer() {
		return composer;
	}
	public void setyear(int year) {
		this.year = year;
	}
	public int getyear() {
		return year;
	}
	public void settrack(int track) {
		this.track  = track;
	}
	public int gettrack() {
		return track;
	}
	public void showinfo() {
		System.out.println(artist + title + album + composer + year + track );
	}
	
}
