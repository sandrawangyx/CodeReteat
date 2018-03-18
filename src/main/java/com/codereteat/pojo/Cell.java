package com.codereteat.pojo;

public class Cell {

	public int rowIndex;
	public int columnIndex;
	public int numOfLiveNeighbours;
	
	public Cell()
	{
		this.rowIndex=0;
		this.columnIndex = 0;
	}
	
	public Cell(int rowIndex, int columnIndex)
	{
		super();
		setRowIndex(rowIndex);
		setColumnIndex(columnIndex);
	}
	
	public int getNumOfLiveNeighbours() {
		return numOfLiveNeighbours;
	}
	public void setNumOfLiveNeighbours(int numOfLiveNeighbours) {
		this.numOfLiveNeighbours = numOfLiveNeighbours;
	}
	public int getRowIndex() {
		return rowIndex;
	}
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}
	public int getColumnIndex() {
		return columnIndex;
	}
	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}
	

	
}
