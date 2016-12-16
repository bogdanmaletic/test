package com.testStruct;

public class BasicCell {

	
	public BasicCell(int xPos, int yPos, int height) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
	}
	
	
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	public int xPos;
	public int yPos;
	public int height;
}
