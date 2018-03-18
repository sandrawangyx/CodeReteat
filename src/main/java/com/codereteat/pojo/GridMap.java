package com.codereteat.pojo;

public class GridMap {

	public int row;
	public int column;
	public int size;
	private Cell[][] map ;

	public GridMap() {
		//super();
		this.row = 0;
		this.column = 0;
		this.size = 0;
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
		this.size = this.row * this.column;
		return size;
	}

	public Class<? extends Cell> getCellClass(int row, int column)
	{
		return this.map[row][column].getClass();
	}
	
	public boolean isALive(int row, int column)
	{
		return this.map[row][column].getClass() == LiveCell.class;
	}

	public void initialize(int row, int column)
	{
		this.row = row;
		this.column = column;
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
