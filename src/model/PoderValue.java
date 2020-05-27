package model;

import java.util.Comparator;

public class PoderValue implements Comparator<Entidades>{

	@Override
	public int compare(Entidades arg0, Entidades arg1) {
		// TODO Auto-generated method stub
		return arg0.getPoder().compareTo(arg1.getPoder());
	}

	
	
	
	
	
}
