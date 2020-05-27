package controller;

import exceptions.Excepcion1;
import model.Logic;
import processing.core.PApplet;
import view.Main;

public class Main_Controller {

	// Declaracion de instancias de logia y de variables
	private Logic lo;
	private PApplet app;
	private int pantallas=0;
	
	
	public Main_Controller(Main main) {
		app = main;
		
		pantallas=2;
		lo = new Logic(app);
		}

	public void draw() {

		lo.draw();
		
	}

	
	
	public void mousePressed() {

		// Boton Start
		if (lo.getPantalla()==0 && app.mouseX > 205 && app.mouseX < 301 && app.mouseY > 217 && app.mouseY < 244) {
			lo.setPantalla(1);
			
		}

		// Boton escoger nombre y continuar
		if (lo.getPantalla()==1 &&app.mouseX > 378 && app.mouseX < 450 && app.mouseY > 200 && app.mouseY < 223) {
			lo.guardado();
			lo.setPantalla(2);
			
		}

		// Boton escoger osquirtle
		if (lo.getPantalla()==2 &&  app.mouseY > 245 && app.mouseY < 264 && app.mouseX > 194 && app.mouseX < 259) {

			lo.setPantalla(3);
			lo.setPokemn(1);
			
		}

		// Boton escoger charmalian
		if (lo.getPantalla()==2 && app.mouseY > 245 && app.mouseY < 264 && app.mouseX > 284 && app.mouseX < 346) {
			lo.setPantalla(3);
			lo.setPokemn(2);
			
		}

		// Boton escoger bermisaur
		if (lo.getPantalla()==2 && app.mouseY > 245 && app.mouseY < 264 && app.mouseX > 373 && app.mouseX < 435) {
			lo.setPantalla(3);
			lo.setPokemn(3);
			
			
		}
		
		
		//Boton huir
		if (lo.getPantalla()==6 && app.mouseY > 334 && app.mouseY < 351 && app.mouseX > 289 && app.mouseX < 349) {
			lo.setPantalla(3);
			lo.huir();
			
			
		}
		
		
		// Boton de batalla
		if (lo.getPantalla()==6 && app.mouseY > 310 && app.mouseY < 327 && app.mouseX > 289 && app.mouseX < 349) {
			lo.setPantalla(7);
			
			
			
		}
		
		//Ataques
		
		//Primer ataque
		if (lo.getPantalla()==7 && app.mouseY > 310 && app.mouseY < 327 && app.mouseX > 196 && app.mouseX < 253 && lo.isAtaquemos()==false) {
			
			lo.ataque1();
			lo.setAtaquemos(true);
		}
		
		// segundo ataque
		if (lo.getPantalla()==7 && app.mouseY > 310 && app.mouseY < 327 && app.mouseX > 263 && app.mouseX < 348 && lo.isAtaquemos()==false) {
			
			lo.ataque2();
			lo.setAtaquemos(true);
		}
		// Tercer ataque
		if (lo.getPantalla()==7 && app.mouseY > 336 && app.mouseY < 352 && app.mouseX > 196 && app.mouseX < 253 && lo.isAtaquemos()==false) {
			
			
			lo.ataque3();
			lo.setAtaquemos(true);
			
		}
		//Cuarto ataque
		if (lo.getPantalla()==7 && app.mouseY > 336 && app.mouseY < 352 && app.mouseX > 263 && app.mouseX < 348 && lo.isAtaquemos()==false) {
			
			lo.ataque4();
			lo.setAtaquemos(true);
		}
		
		
		
		
		
	}

	public void keyPressed(char key) {

		// personaje Caminando

		if (lo.getPantalla()==3 && app.keyCode == app.UP) {
			
			lo.movimientoarriba();
			
			
		}
		
		if (lo.getPantalla()==3 && app.keyCode == app.DOWN) {
			
			lo.movimientoabajo();
			
		}
		
		if (lo.getPantalla()==3 && app.keyCode == app.LEFT) {
			
			
			lo.movimientoladoi();
			
		}
		
		if (lo.getPantalla()==3 && app.keyCode == app.RIGHT) {
			
			
			lo.movimientoladod();
			
		}
		
		
		
		
		
		
		// En menu para pasar a pokedex
		
		if (lo.getPantalla()==3 && (key == 'p' || key == 'P')) {
			lo.setPantalla(4);
		} else {
			if ((lo.getPantalla()==4 ) && (key == 'p' || key == 'P')) {
				lo.setPantalla(3);
				
			}
		}

		// Desplazarse desde pokedex a registros y devolverse
		if (lo.getPantalla()==4 && (key == 'r' || key == 'R')) {
			lo.setPantalla(5);
		} else if(lo.getPantalla()==5 && (key == 'p' || key == 'P')) {
			lo.setPantalla(4);
		}
				
		if (lo.getPantalla()==4 && (key == 'n' || key == 'N')) {
			lo.ordenar(1);
		} 
		
		if (lo.getPantalla()==4 && (key == 'o' || key == 'O')) {
			lo.ordenar(0);
		} 
		if (lo.getPantalla()==5 && (key == 'n' || key == 'N')) {
			lo.organizarnombre();
		} 
		
		if (lo.getPantalla()==5 && (key == 'f' || key == 'F')) {
			lo.organizarfecha();
		} 
		

	} // llave del keyPressed

	public void zonaCombate() {
		
		if(lo.getPantalla()==3) {
			
			lo.zonaCombate();
		}
		
	}
	
	
	public void excepcionprimera() throws Excepcion1 {
		
		
		lo.primerae();
	}

	public void mouseClicked() {
		
		
		
		// llamar a la pokebola
		lo.mouseClicked();
		
if (lo.getPantalla()==7 && app.mouseY > 321 && app.mouseY < 346 && app.mouseX > 392 && app.mouseX < 470) {
			
			lo.pokebol();
			
		}
	}

}
