package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Pokemon3 extends Entidades  {

	private PApplet app;
	private String Nombre,Poder;
	private int at1,at2,at3,at4,vida, nivel;
	
	public Pokemon3(PImage imagen, String nombre, String poder, PApplet apP2) {
		super(imagen,  nombre,  poder,apP2);
		app=apP2;
		Nombre=nombre;
		Poder=poder;
		at1= 20;
		at2=30; 
		at3=20;
		at4=20;
		vida=220;
		nivel= 1;
	}
public void regenerar() {
		
		vida = 220;
		
	}
	
	public String getNombre() {
		return Nombre;
	}


	public int getVida() {
		return vida;
	}



	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getPoder() {
		return Poder;
	}


	public void setPoder(String poder) {
		Poder = poder;
	}

	public void draw(float posx,float posy){
		try {
			
		app.image(getImagenFinal(),posx, posy);
		
		}catch (NullPointerException e) {
			
			
			
		}
		
	}
	

	public int getAt1() {
		return at1;
	}


	public void setAt1(int at1) {
		this.at1 = at1;
	}


	public int getAt2() {
		return at2;
	}


	public void setAt2(int at2) {
		this.at2 = at2;
	}


	public int getAt3() {
		return at3;
	}


	public void setAt3(int at3) {
		this.at3 = at3;
	}


	public int getAt4() {
		return at4;
	}


	public void setAt4(int at4) {
		this.at4 = at4;
	}
	
	@Override
	public int compareTo(Entidades arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
