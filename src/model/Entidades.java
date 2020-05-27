package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Entidades implements Runnable,Comparable<Entidades> {

	private int poxm,poym;
	private int at1,at2,at3,at4,vida;
	private float posx,posy;
	private String Nombre,Poder;
	private PImage imagenFinal;
	
	
	private int arribita, abajito, derechita, izquier;

	public Entidades() {

		arribita = 0;
		abajito = 0;
		derechita = 0;
		izquier = 0;

	}

	
	public Entidades(PImage imagen, String nombre, String poder, PApplet apP2) {
		imagenFinal=imagen;
		Nombre = nombre;
		Poder = poder;
		
	}
	public void draw() {

	}

	
	
	
	public PImage getImagenFinal() {
		return imagenFinal;
	}

	public void setImagenFinal(PImage imagenFinal) {
		this.imagenFinal = imagenFinal;
	}

	public float getPosx() {
		return posx;
	}

	public void setPosx(float posx) {
		this.posx = posx;
	}

	public float getPosy() {
		return posy;
	}

	public void setPosy(float posy) {
		this.posy = posy;
	}

	public void movimientoarriba() {

	}

	public void movimientoabajo() {

	}

	public void movimientoladod() {

	}

	public void movimientoladoi() {

	}

	public int getPoxm() {
		return poxm;
	}

	public void setPoxm(int poxm) {
		this.poxm = poxm;
	}

	public int getPoym() {
		return poym;
	}

	public void setPoym(int poym) {
		this.poym = poym;
	}
	
	
	public int getArribita() {
		return arribita;
	}

	public void setArribita(int arribita) {
		this.arribita = arribita;
	}

	public int getAbajito() {
		return abajito;
	}

	public void setAbajito(int abajito) {
		this.abajito = abajito;
	}

	public int getDerechita() {
		return derechita;
	}

	public void setDerechita(int derechita) {
		this.derechita = derechita;
	}

	public int getIzquier() {
		return izquier;
	}

	public void setIzquier(int izquier) {
		this.izquier = izquier;
	}

	@Override
	public void run() {

		
		
		if (arribita == 1) {
			movimientoarriba();
			arribita=0;
		}
		if (abajito == 1) {
			movimientoabajo();
			abajito=0;
		}
		if (derechita == 1) {
			movimientoladod();
			derechita=0;
		}
		if (izquier == 1) {
			movimientoladoi();
			izquier=0;
		}
		
		
		
	}


	public int getVida() {
		return vida;
	}



	public void setVida(int vida) {
		this.vida = vida;
	}

	

	public String getNombre() {
		return Nombre;
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

	public void draw(float posx2, float posy2) {
		
		
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
	
	public void regenerar() {
		
		
		
	}

}
