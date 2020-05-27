package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Pokemon0 extends Entidades {

	private int pokemon,vida,tipo;
	private PApplet app;
	private float posXper,posYper,posyreal;
	private int at1,at2,at3,at4;
	PImage derJuli, derOsqui, frenteBermi, derBermi, frenteOsqui, atrasBermi, frenteJuli, izqBermi, izqJuli, izqOsqui;
	
	public Pokemon0(int i, PApplet apP, int pokemn, float posxper, float posyper) {
	
		app=apP;
		pokemon= pokemn;
		//System.out.println(pokemon);
		vida= i;
		posXper = posxper;
		posYper = (float) (posyper-(19.737)); 
		posyreal = posyper;
		tipo=0;
		derJuli = apP.loadImage("../insumos/derJuli.png");
		derOsqui = apP.loadImage("../insumos/derOsqui.png");
		frenteBermi = apP.loadImage("../insumos/frenteBermi.png");
		derBermi = apP.loadImage("../insumos/derBermi.png");
		frenteOsqui = apP.loadImage("../insumos/frenteOsqui.png");
		atrasBermi = apP.loadImage("../insumos/atrasBermi.png");
		frenteJuli = apP.loadImage("../insumos/frenteJuli.png");
		izqBermi = apP.loadImage("../insumos/izqBermi.png");
		izqJuli = apP.loadImage("../insumos/izqJuli.png");
		izqOsqui = apP.loadImage("../insumos/izqOsqui.png");
		
		at1= 20;
		at2=30; 
		at3=20;
		at4=20;
		
		
		
		
	}
	
	
	public void draw(float posx,float posy){
		
		if(pokemon==1) {
			
			switch (tipo) {
			
			case 0: 
				
				app.image(frenteOsqui, posx,(float) (posy-(19.737)) );
			
			break;
			
			case 1: 
				//System.out.println("entro");
				app.image(izqOsqui,posx,(float) (posy+(19.737) ));
				
			break;
			
			case 2:
				app.image(izqOsqui, (float) (posx+(21.739)),posy);
				
			break;
			
			case 3:
				app.image(derOsqui, (float) (posx-(21.739)), posy);
			break;
			
			
			}
			
		}else if(pokemon==2) {
			
			switch (tipo) {
			
			case 0: 
				app.image(frenteJuli, posx,(float) (posy-(19.737)) );
			
			break;
			
			case 1: 
				
				app.image(izqJuli,posx,(float) (posy+(19.737) ));
				
			break;
			
			case 2:
				app.image(izqJuli, (float) (posx+(21.739)),posy);
				
			break;
			
			case 3:
				app.image(derJuli, (float) (posx-(21.739)), posy);
			break;
			
			
			}
			
			
		}else if (pokemon==3) {
			
			switch (tipo) {
			
			case 0: 
				app.image(frenteBermi, posx,(float) (posy-(19.737)) );
			
			break;
			
			case 1: 
				
				app.image(atrasBermi,posx,(float) (posy+(19.737) ));
				
			break;
			
			case 2:
				app.image(izqBermi, (float) (posx+(21.739)),posy);
				
			break;
			
			case 3:
				app.image(derBermi, (float) (posx-(21.739)), posy);
			break;
			
			
			}
			
		}
		
		
	}	
public void regenerar() {
		
		vida = 230;
		
	}
public void movimientoarriba() {
		
		
		//System.out.println("entra");
		posYper=  (float) (posYper - (19.737));
		setPosYper(posYper);
		setTipo(1);
		
	}

	

	public void movimientoabajo() {
		posYper= (float)(posYper + (19.737));
		
		
		setPosYper(posYper);
		
		setTipo(0);
		
		
	}

	public void movimientoladod() {
		posXper=(float) (posXper + (21.739));	
		
		setPosXper(posXper);
		setTipo(3);
		
	}

	public void movimientoladoi() {

		posXper= (float)(posXper - (21.739));
		
		
		setPosXper(posXper);
		setTipo(2);
		
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public float getPosXper() {
		return posXper;
	}


	public void setPosXper(float posXper) {
		this.posXper = posXper;
	}


	public float getPosYper() {
		return posYper;
	}


	public void setPosYper(float posYper) {
		this.posYper = posYper;
	}


	@Override
	public int compareTo(Entidades o) {
		// TODO Auto-generated method stub
		return 0;
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


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}
	
}
