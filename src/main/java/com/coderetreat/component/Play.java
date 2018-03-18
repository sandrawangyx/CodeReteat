package com.coderetreat.component;

import java.util.PriorityQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.codereteat.pojo.GridMap;

public class Play implements ApplicationRunner{

	@Autowired
	GridMap gm;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		gm.initialize(7,7);
		
		//add live cells as starter
		createStarter(gm);
		
		//first scan add live cells to LiveQ
		for(int i =0; i< gm.getRow(); i++)
		{
			for(int j=0;j < gm.getColumn();j++)
			{
				if(gm.isALive(i, j))
				{
					//TO DO count neight live 
					
				}
					
			}
		}		
	}
	
	private boolean isUnderPopulation(int rowIndex, int columnIndex)
	{
		if(getLiveNeighbourCount(rowIndex, columnIndex) <= 2)
			return true;
		else
			return false;
	}
	
	private boolean isOverPopulation(int rowIndex, int columnIndex)
	{
		if(getLiveNeighbourCount(rowIndex, columnIndex) > 3 )
			return true;
		else
			return false;
	}
	
	private void cellReprodution(GridMap gm, int rowIndex, int columnIndex)
	{
		if(!gm.isALive(rowIndex, columnIndex) && getLiveNeighbourCount(rowIndex, columnIndex)==3)
			
			gm.transitCell(rowIndex, columnIndex);
	}
	
	private int getLiveNeighbourCount(int rowIndex, int columnIndex)
	{
		int count = 0;
		
		return count;
	}
	
	public void createStarter(GridMap gm)
	{
		gm.transitCell(1, 2);
		gm.transitCell(1, 7);
		gm.transitCell(2, 3);
		gm.transitCell(2, 5);
		gm.transitCell(3, 6);
		gm.transitCell(4, 1);
		gm.transitCell(4, 3);
		gm.transitCell(4, 4);
		gm.transitCell(4, 6);
		gm.transitCell(5, 4);
		gm.transitCell(5, 7);
		gm.transitCell(6, 2);
		gm.transitCell(6, 4);
		gm.transitCell(6, 6);
		gm.transitCell(7, 4);
	}

}
