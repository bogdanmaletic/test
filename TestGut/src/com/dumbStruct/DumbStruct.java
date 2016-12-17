/*
 * Ovo je samo jedna od nizu glupavih struktura koju cemo
 * koristiti da testiramo razne pristupe preko kojih cemo
 * da bismo racunali propagaciju raznih radio signala.
 * */
package com.dumbStruct;

public class DumbStruct {
	
	
	
	public DumbStruct(int xPos, int yPos, int height, double signalStrength) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.height = height;
		this.signalStrength = signalStrength;
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
	public double getSignalStrength() {
		return signalStrength;
	}
	public void setSignalStrength(double signalStrength) {
		this.signalStrength = signalStrength;
	}


	public int xPos;
	public int yPos;
	public int height;
	public double signalStrength;
	//Mozda kasnije dodamo niz koji ce ih sve strpati
	// u matricu ili niz preko koje cemo racunati.
}
