package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Jugador extends Entidades {
	
	private PApplet app;
	private int tipo=0,poxm=11,poym=9,poxma,poyma;
	PImage eric1,eric2,eric3,eric4;
	private float posx,posy;
	

	public Jugador(float posx2, float posy2, PApplet apP) {
		
		posx=posx2;
		posy=posy2;
		app=apP;
		eric2 = app.loadImage("../insumos/arriba.png");
		eric1 = app.loadImage("../insumos/abajo.png");
		eric3 = app.loadImage("../insumos/izquierda.png");
		eric4 = app.loadImage("../insumos/derecha.png");
		
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

	public void setPosy(float posy2) {
		this.posy = posy2;
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
	
	

	public int getPoxma() {
		return poxma;
	}

	public void setPoxma(int poxma) {
		this.poxma = poxma;
	}

	public int getPoyma() {
		return poyma;
	}

	public void setPoyma(int poyma) {
		this.poyma = poyma;
	}

	public void draw() {
		
		switch(getTipo()) {
		
		case 0:
			
			app.image(eric1,posx,posy);
		
		break;
			
		case 1:
			
			app.image(eric2, posx, posy);
			
		break;	
		
		case 2:
			app.image(eric3, posx, posy);
			
		break;
		
		case 3:
			app.image(eric4, posx, posy);
			
		break;
		
		
		
		}
		
		
		
	}

	
	public void regenerar() {
		
		posx= 239;
		posy= 178;
		setPoym(9);
		setPoxm(11);
		
		
		
		
		
	}
	public void movimientoarriba() {
		
		
		
		
		posy=  (float) (posy - (19.737));
		poyma = getPoym() - 1 ;
		setPoym(poyma);
		setPosy(posy);
		setTipo(1);
		
	}

	

	public void movimientoabajo() {
		posy= (float)(posy + (19.737));
		poyma = getPoym() + 1 ;
		setPoym(poyma);
		setPosy(posy);
		
		setTipo(0);
		
		
	}

	public void movimientoladod() {
		posx=(float) (posx + (21.739));
		poxma = getPoxm() + 1;
		setPoxm(poxma);
		setPosx(posx);
		setTipo(3);
		
	}

	public void movimientoladoi() {

		posx= (float)(posx - (21.739));
		poxma = getPoxm() - 1;
		setPoxm(poxma);
		setPosx(posx);
		setTipo(2);
		
	}
	
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public int compareTo(Entidades o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
