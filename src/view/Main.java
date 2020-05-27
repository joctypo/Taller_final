package view;

import controller.Main_Controller;
import exceptions.Excepcion1;
import processing.core.PApplet;
import processing.core.PImage;





public class Main extends PApplet {

	// Instancia del controller
	private Main_Controller mc;
	

	

	public static void main(String[] args) {
		PApplet.main("view.Main");
	}

	public void settings() {
		size(500, 375);
	}

	public void setup() {
		
		
		
		
		mc = new Main_Controller(this);
		

		
		
		
	}

	
	
	
	public void draw() {
		mc.draw();

		
		//Aquí llamamos el método para saber si el usuario esta en la zona de combate
		zonaCombate();
			


	}

	

	public void mouseClicked() {

		mc.mouseClicked();
	}
	
	

	public void mousePressed() {
		mc.mousePressed();
	}
	
	

	public void keyPressed() {
		mc.keyPressed(key);
	}
	
	
	// Aqui llamamos la instancia del Main Controller de la zona de combate

	public void zonaCombate() {

		mc.zonaCombate();

	}
}
