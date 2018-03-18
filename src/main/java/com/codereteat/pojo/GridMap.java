package com.codereteat.pojo;

public class GridMap {

	public int row;
	public int column;
	public int size;
	private Cell[][] map ;

	public GridMap(int row, int column) {
		//super();
		this.row = row;
		this.column = column;
		this.size = row*column;
	}

	public int getRow() {
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
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public Class<? extends Cell> getCellClass(int row, int column)
	{
		return this.map[row][column].getClass();
	}

	public void initialize()
	{
		this.map= new Cell[this.row][this.column];
		for(int i=0;i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				this.map[i][j] = new DeadCell();
			}
		}
	}

	public void transitCell(int row, int column)
	{
		if(getCellClass(row, column) == LiveCell.class)
			this.map[row][column] = new DeadCell();

		if(getCellClass(row,column) == DeadCell.class)
			this.map[row][column] = new LiveCell();
	}
}
