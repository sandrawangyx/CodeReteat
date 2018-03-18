package com.codereteat.pojo;

public class Cell {

	//public int row;
	//public int column;
	public int numOfLiveNeighbours;
	//public boolean state; //live-true, dead-false
	/*public Cell(int row, int column, int numOfLiveNeighbours) {
		super();
		this.row = row;
		this.column = column;
		this.numOfLiveNeighbours = numOfLiveNeighbours;
		//this.state = state;
	}*/
	
	public Cell()
	{
		
	}
	/*public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}*/
	public int getNumOfLiveNeighbours() {
		return numOfLiveNeighbours;
	}
	public void setNumOfLiveNeighbours(int numOfLiveNeighbours) {
		this.numOfLiveNeighbours = numOfLiveNeighbours;
	}
	

	
}
