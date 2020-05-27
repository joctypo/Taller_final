package model;

import java.util.Comparator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class OrdenarFecha implements Comparator<Usuario>{

	
	
	
	
	@Override
	public int compare(Usuario o1, Usuario o2) {
		DateFormat df= new SimpleDateFormat("dd-MM-yyyy");
		Date usuario1 = null;
		Date usuario2= null;
		try {
			usuario1 = df.parse(o1.getFechas());
			usuario2 =  df.parse(o2.getFechas());			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return usuario1.compareTo(usuario2);
	}
	
 
}
