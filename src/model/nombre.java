package model;

import java.util.Comparator;

public class nombre implements Comparator<Usuario>{

	@Override
	public int compare(Usuario arg0, Usuario arg1) {
		// TODO Auto-generated method stub
		return arg0.getNombre().compareTo(arg1.getNombre());
	}

	
	
	
}
