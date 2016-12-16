package com.testStruct;

public class AdvancedCell extends BasicCell {

	public AdvancedCell(int xPos, int yPos, int height) {
		super(xPos, yPos, height);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public BasicCell getNextCell() {
		return nextCell;
	}



	public void setNextCell(BasicCell nextCell) {
		this.nextCell = nextCell;
	}



	BasicCell nextCell = null;

}
