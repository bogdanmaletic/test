package com.testStruct;

import java.util.Collection;
import java.util.LinkedList;

public class TerrainVerOne extends LinkedList<BasicCell> {

	public TerrainVerOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TerrainVerOne(Collection<? extends BasicCell> arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	
	void printStatus() {
		System.out.println("Size is " + this.size());
	}
}
