package com.javaex.practice6;

public class ex3 {
	protected String fillcolor;
	protected String linecolor;
	
	public ex3(String fillcolor, String linecolor) {
		this.fillcolor =fillcolor;
		this.linecolor =linecolor;
		
	}
	public String getFillcolor() {
		return fillcolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}

}
