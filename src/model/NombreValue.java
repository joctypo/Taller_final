package model;

import java.util.Comparator;

public class NombreValue implements Comparator<Entidades>{

	@Override
	public int compare(Entidades o1, Entidades o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
