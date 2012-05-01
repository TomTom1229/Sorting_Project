package sorting.gui;

import java.util.Collections;
import java.util.LinkedList;

import sorting.Sorter;
import sorting.Swap;

public class SortSlowDisplay extends SortDisplay {



	public SortSlowDisplay(int numRect, Sorter[] sorter) {
		super(numRect, sorter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(){
		for(Sorter s : allTheSorters){
			s.nextStep();
		}
		repaint();
	}
}
