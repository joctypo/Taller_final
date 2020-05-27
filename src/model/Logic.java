package model;

import java.util.Collections;
import java.util.LinkedList;
import controlP5.*;
import exceptions.Excepcion1;
import exceptions.Excepcion2;
import exceptions.Excepcion3;
import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	
	//Declaración de Linkelist
	private LinkedList <Entidades> entidad;
	private LinkedList <Entidades> entidad2;
	private LinkedList <Usuario> user;
	private LinkedList <Usuario> registro;
	
	
	//Declaracion de variable y llenado de matriz
	private int pantalla,pox,poy;
	private int matrizMapa[][] = 
		{	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	};
	
	
	
	//Declaracion de imagenes
	private PApplet apP;
	PImage fondo,batalla;
	PImage fondoCuadricula;
	PImage inicio;
	PImage interior;
	PImage pokedexOsqui;
	PImage pokedexBermi;
	PImage pokedexJuli;
	PImage pokedexRatata;
	PImage saludo;
	PImage saludoProfesor;
	PImage ataque;
	PImage registros;
	PImage berDerecha;
	PImage berIzquierda;
	PImage charDerecha;
	PImage charIzquierda;
	PImage osqDerecha;
	PImage osqIzquierda;
	PImage ratDerecha;
	PImage ratIzquierda;
	PImage cincoIzquierda;
	PImage cuatroIzquierda;
	PImage tresIzquierda;
	PImage dosIzquierda;
	PImage unoIzquierda;
	PImage cincoDerecha;
	PImage cuatroDerecha;
	PImage tresDerecha;
	PImage dosDerecha;
	PImage unoDerecha;
	PImage tresIzq, dosIzq, unoIzq, tresDer, dosDer, unoDer;
	PImage juliPokedex, osquiPokedex, rataPokedex, bermiPokedex, pokedex,mens1,mens2,mens3,mens4;
	
	
	// Declaracion de instancias y variables 
	private nombre name;
	private ControlP5 cp5;
	private Textfield epa;
	
	private OrdenarFecha fechita;
	private String hola;
	private PoderValue pv;
	private NombreValue nv;
	float posx = 239;
	float posy = 178;
	boolean escogeOsquirtle,escogeCharmalian,escogeBermisaur,escogeRatata,entro=false,ataquemos=false,mensaje1=false, mensaje2=false, mensaje3=false,pokebol=false,mensaje4=false;
	private int pomax,pomay,pokemn=0,ordenado,enemigo, cv1,cv2,cv3,cv4,calculadoravitalidad,framer,framer2,framer3=60,framer4;
	private float posxper,posyper,podex=34,podey=113;
	private String[] info1,info2;
	private boolean entrada;
	
	
	// Iniciación de variables, el famoso Constructor
	public Logic(PApplet app) {
		pantalla =0;
		apP=app;
		cargarImagenes();
		
		escogeOsquirtle = false;
		escogeCharmalian = false;
		escogeBermisaur = false;
		escogeRatata = false;
		
		
		
		entidad = new LinkedList<Entidades>();
		entidad2 = new LinkedList<Entidades>();
		user = new LinkedList<Usuario>();
		registro = new LinkedList<Usuario>();
		
		
		
		info1 = apP.loadStrings("../insumos/datos.txt");
		info2 = apP.loadStrings("../insumos/Registro.txt");
		
		
		pv= new PoderValue();
		nv= new NombreValue();
		cargarTexto();
		name = new nombre();
		
		// Todo lo del input de texto 
		cp5 = new ControlP5(app);
		fechita = new OrdenarFecha();
		cp5.addTextfield("Nombre").setPosition(229, 200).setSize(150,20).setAutoClear(false).setColor(0).setColorBackground(apP.color(255,255,255,1))
	     .setColorActive(apP.color(255,255,255,1)) 
	     .removeBehavior() 
	     .setLabelVisible(false)
	     .setCaptionLabel("");
		cargarregistro();
		hola = cp5.get(Textfield.class, "Nombre" ).getStringValue();
	}
	
	public void cargarTexto() {
		
		
		// Cargar el texto con los datos de un texto para crear cuatro tipos de animales salvajes
		for (int i=0; i<info1.length;i++) {
			String[] ordenar= info1[i].split(",");
			String nombre = ordenar[0];
			String poder = ordenar[1];
			PImage imagen = apP.loadImage("../insumos/"+nombre+".png");
			//System.out.println(nombre);
			if(ordenar[0].contentEquals("juliPokedex")) {
				
				entidad2.add(new Pokemon1(imagen,nombre,poder,apP));
				
			}else if(ordenar[0].contentEquals("bermiPokedex")){
				
				entidad2.add(new Pokemon2(imagen,nombre,poder,apP));
			}else if (ordenar[0].contentEquals("rataPokedex")){
				
				entidad2.add(new Pokemon3(imagen,nombre,poder,apP));
			}else if(ordenar[0].contentEquals("osquiPokedex")) {
				
				entidad2.add(new Pokemon4(imagen,nombre,poder,apP));
				
			}
			
			
			
		}
		
		
	}
	
	public void cargarImagenes() {
		
		
		// Cargar las diferentes imagenes 
		fondo = apP.loadImage("../insumos/fondo.png");
		fondoCuadricula = apP.loadImage("../insumos/fondoCuadricula.png");
		inicio = apP.loadImage("../insumos/inicio.png");
		interior = apP.loadImage("../insumos/interior.png");
		pokedexOsqui = apP.loadImage("../insumos/pokedexOsqui.png");
		pokedexBermi = apP.loadImage("../insumos/pokedexBermi.png");
		pokedexJuli = apP.loadImage("../insumos/pokedexJuli.png");
		pokedexRatata = apP.loadImage("../insumos/pokedexRatata.png");
		saludo = apP.loadImage("../insumos/saludo.png");
		saludoProfesor = apP.loadImage("../insumos/saludoProfesor.png");
		
		tresIzq = apP.loadImage("../insumos/tresIzq.png");
		dosIzq = apP.loadImage("../insumos/dosIzq.png");
		unoIzq = apP.loadImage("../insumos/unoIzq.png");
		tresDer = apP.loadImage("../insumos/tresDer.png");
		dosDer = apP.loadImage("../insumos/dosDer.png");
		unoDer = apP.loadImage("../insumos/unoDer.png");
		juliPokedex = apP.loadImage("../insumos/juliPokedex.png"); 
		osquiPokedex = apP.loadImage("../insumos/osquiPokedex.png");
		rataPokedex = apP.loadImage("../insumos/rataPokedex.png");
		bermiPokedex = apP.loadImage("../insumos/bermiPokedex.png");
		pokedex = apP.loadImage("../insumos/pokedex.png");
		
		ataque = apP.loadImage("../insumos/ataque.png");
		registros = apP.loadImage("../insumos/registros.png");
		berDerecha = apP.loadImage("../insumos/berDerecha.png");
		berIzquierda = apP.loadImage("../insumos/berIzquierda.png");
		charDerecha = apP.loadImage("../insumos/charDerecha.png");
		charIzquierda = apP.loadImage("../insumos/charIzquierda.png");
		osqDerecha = apP.loadImage("../insumos/osqDerecha.png");
		osqIzquierda = apP.loadImage("../insumos/osqIzquierda.png");
		ratDerecha = apP.loadImage("../insumos/ratDerecha.png");
		ratIzquierda = apP.loadImage("../insumos/ratIzquierda.png");
		cincoIzquierda = apP.loadImage("../insumos/cincoIzquierda.png");
		cuatroIzquierda = apP.loadImage("../insumos/cuatroIzquierda.png");
		tresIzquierda = apP.loadImage("../insumos/tresIzquierda.png");
		dosIzquierda = apP.loadImage("../insumos/dosIzquierda.png");
		unoIzquierda = apP.loadImage("../insumos/unoIzquierda.png");
		cincoDerecha = apP.loadImage("../insumos/cincoDerecha.png");
		cuatroDerecha = apP.loadImage("../insumos/cuatroDerecha.png");
		tresDerecha = apP.loadImage("../insumos/tresDerecha.png");
		dosDerecha = apP.loadImage("../insumos/dosDerecha.png");
		unoDerecha = apP.loadImage("../insumos/unoDerecha.png");
		batalla = apP.loadImage("../insumos/batalla.png");
		
		mens1= apP.loadImage("../insumos/mensajePerdiste.png");
		mens2= apP.loadImage("../insumos/mensajeSD.png");
		mens3= apP.loadImage("../insumos/mensajeEnemigoFuerte.png");
		mens4= apP.loadImage("../insumos/mensajeSalvajeCapturado.png");
	}
	
	public void crearPersonajes(int pokemn2) {
		
		
		//Aquí creamos el personaje y el pokemon inicial de acuerdo a como el elija
		entidad.add(new Jugador(posx,posy,apP));
		posxper= entidad.get(0).getPosx();
		posyper =(entidad.get(0).getPosy());
		entidad.add(new Pokemon0(230,apP,pokemn2,posxper,posyper));
		
		
		
	} 
	public void draw() {
		 
		apP.background(100);

		switch (pantalla) {

		case 0:
			
			//Pantalla inicial con el logo 
			apP.image(inicio, 0, 0);
			apP.textSize(25);
			cp5.get(Textfield.class,"Nombre").setVisible(false);
			
			
			break;
		case 1:
			
			
			//Pantalla de colocar el nombre, activamos el CP5 para permitir el input
			apP.image(saludo, 0, 0);
			apP.fill(0);
			apP.textSize(10);
			cp5.get(Textfield.class,"Nombre").setVisible(true);
			hola = cp5.get(Textfield.class, "Nombre" ).getText();
			
			
			
			break;
		case 2:
			
			
			//Pantalla donde aparece el saludo del profesor y eleccion de diferentes pokemones
			apP.image(saludoProfesor, 0, 0);
			apP.textSize(10);
			cp5.get(Textfield.class,"Nombre").setVisible(false);
			
			
			
			break;
		case 3:
			
			
			// Pantalla donde esta el mapa del juego
			apP.image(fondo, 0, 0);
			cp5.get(Textfield.class,"Nombre").setVisible(false);
			setPokemn(pokemn);
			
			
			// Aqui creamos los diferentes personajes del juego (personaje principal y pokemon elegido)
			if (entro==false) {
			crearPersonajes(pokemn);
			entro=true;
			}
			
			
			//personaje inicial
			entidad.get(0).draw();
			entidad.get(1).draw(entidad.get(0).getPosx(),entidad.get(0).getPosy());
			
			
			//Aquí activamos el Hilo
			for(int i=0;i<2;i++) {
			Thread Nh;
			Nh = new Thread(entidad.get(i));
			Nh.start();
			
			}

			
			break;

		// Pantalla de la pokedex 
		case 4:
			apP.image(pokedex, 0, 0);
			cp5.get(Textfield.class,"Nombre").setVisible(false);
			
			//Aqui usamos el arreglo de entidad 2, donde tenemos los otros pokemones que consideramos salvajes y mostramos el arreglo
			for (int i=0;i<entidad2.size();i++) {
				
				
				entidad2.get(i).draw(podex,podey);
				podey=podey+60;
			
				
			}
			podey=113;

		
			break;

			
		// Registro, aqui muestra la pantalla donde pinta los diferentes registros 
		case 5:
			
			apP.image(registros, 0, 0);
			cp5.get(Textfield.class,"Nombre").setVisible(false);
			apP.textSize(10);
			int posy =140;
			
			// Este for recorre la linkenlist donde se aloja el registro
			for(int i=0;i<registro.size();i++) {
				
				apP.textSize(10);
				apP.text("Nombre: "+ registro.get(i).getNombre()+" Fecha: "+registro.get(i).getFechas(),100, posy);
				posy=posy+20;
				
			}
			
			
			
			//apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;
		
			
		//Esta es cuando entra a batalla pero puede elegir si huir o pelear
		case 6:
			
			apP.image(batalla, 0, 0);
			cp5.get(Textfield.class,"Nombre").setVisible(false);
			
			// Aqui llega la informacion y se muestra siempre nuestro pokemon
			if (getPokemn()==1) {
				
				
				apP.image(osqIzquierda, 0, 0);
				
				
			}else if(getPokemn()==2) {
				
				apP.image(charIzquierda, 0, 0);
				
				
			}else if(getPokemn()==3) {
				
				apP.image(berIzquierda, 0, 0);
				
			}
			
			
			
			// Aqui llega la imagen de nuestro contrincante el cual es aleatorio. depende del aleatorio muestra la imagen
			if(enemigo==1) {
				
				apP.image(charDerecha, 0, 0);
				apP.image(dosDer, 0, 0);
				
			}else if(enemigo==2) {
				
				apP.image(berDerecha, 0, 0);
				apP.image(dosDer, 0, 0);
				
			}else if(enemigo==3) {
				
				apP.image(ratDerecha, 0, 0);
				apP.image(unoDer, 0, 0);
				
			}else if(enemigo == 4) {
				
				
				apP.image(osqDerecha, 0, 0);
				apP.image(tresDer, 0, 0);
			}
			
			
			// El nivel de nuestro pokemon
			apP.image(dosIzq, 0, 0);
			
			
			
			
		break;
		
		
		// Zona de batalla, aqui aparecen los diferentes poderes para atacar
		case 7:
			
			
			
			cp5.get(Textfield.class,"Nombre").setVisible(false);
			apP.image(ataque, 0, 0);
			
			
			// Nuestro pokemon
			if (getPokemn()==1) {
				
				apP.image(osqIzquierda, 0, 0);
				
				
			}else if(getPokemn()==2) {
				
				apP.image(charIzquierda, 0, 0);
				
				
			}else if(getPokemn()==3) {
				
				apP.image(berIzquierda, 0, 0);
				
			}
			
			
			// Pokemon elegido de forma aleatoria previamente
			if(enemigo==1) {
				
				apP.image(charDerecha, 0, 0);
				apP.image(dosDer, 0, 0);
				
			}else if(enemigo==2) {
				
				apP.image(berDerecha, 0, 0);
				apP.image(dosDer, 0, 0);
				
			}else if(enemigo==3) {
				
				apP.image(ratDerecha, 0, 0);
				apP.image(unoDer, 0, 0);
				
			}else if(enemigo == 4) {
				
				
				apP.image(osqDerecha, 0, 0);
				apP.image(tresDer, 0, 0);
			}
			
			
			
			// Aqui es cuando nos ataca el enemigo nos resta salud, tiene un framecount para que espere un tiempo despues de nuestro ataque
			if (ataquemos==true) {
				
				if(apP.frameCount - framer == 60) {
				int vidita = entidad.get(1).getVida();
				int ataque = entidad2.get(enemigo-1).getAt1();
				entidad.get(1).setVida(vidita-ataque);
				ataquemos=false;
				
				}
			}
			
			// Primera excepcion, la cual indica si nuestro personaje se debilitó
			try {
				
				primerae();
				
				
			}catch (Excepcion1 e){
				
				
				
			}
			
			// Segunda excepcion, la cual indica si nuestro contrincante se debilitó
			try {
				
				segundae();
				
				
			}catch (Excepcion2 e){
				
				
				
			}
			
			// Cuando lance una pokebola, dice que el contrincante aun es muy fuerte
			if (pokebol==true && (cv1 > 41 || cv2 > 41 || cv3 > 41 || cv4 > 41)) {
				
				mensaje3 = true;
			//Permite captura	
			}else if (pokebol==true && (cv1 < 41 || cv2 < 41 || cv3 < 41 || cv4 < 41)){
				
				mensaje4=true;
				
			}
			
			
			// Muestra en numero la salud de nuestros personajes y su enemigo
			apP.image(dosIzq, 0, 0);
			apP.textSize(20);
			apP.text(entidad.get(1).getVida(), 186, 150);
			apP.text(entidad2.get(enemigo-1).getVida(), 457, 150);
			apP.textSize(10);
			
			
			// Metodo de vida
			vida();
			
			
			// Se lanza mensaje cuando perdemos 
			if (mensaje1==true) {
				apP.image(mens1, 0, 0);
				if(apP.frameCount - framer2 == 90) {
					
					// Aqui regeneramos la vida de todos los personajes y la posicion inicial del usuario para sacarlo de la hierva
					entidad.get(1).regenerar();
					entidad2.get(enemigo-1).regenerar();
					entidad.get(0).regenerar();
					pantalla=3;
					
					}
			}
			
			
			// Se lanza mensjae cuando perdemos 
			if (mensaje2==true) {
				apP.image(mens2, 0, 0);
				if(apP.frameCount - framer2 == 90) {
					
					// Aqui regeneramos la vida de todos los personajes y la posicion inicial del usuario para sacarlo de la hierva
					entidad.get(1).regenerar();
					entidad2.get(enemigo-1).regenerar();
					entidad.get(0).regenerar();
					pantalla=3;
					
					}
			}
			
			
			//No se captura, sigue la batalla
			if (mensaje3==true) {
				apP.image(mens3, 0, 0);
				pokebol=false;
			
			}
			
			
			// Se captura y se regenerna todos 
			if (mensaje4==true) {
				apP.image(mens4, 0, 0);
				pokebol=false;
				if(apP.frameCount - framer4 == 30) {
					entidad.get(1).regenerar();
					entidad2.get(enemigo-1).regenerar();
					entidad.get(0).regenerar();
					pantalla=3;
					
					}
			}
			
			
		break;
				
			
			
		}//llave del switch
		
		
	}

	
	public void cargarregistro() {
		
		
		
		// Excepcion Runtime, aquí cargamos los registro previos que tenemos en un TXT
		try {
		for (int j = 0; j < info2.length; j++) {
			String[] inf2 = info2[j].split(",");
			

				String nombre = inf2[0];
				String fecha = inf2[1];
				

				registro.add(new Usuario(nombre,fecha, apP));
				//System.out.println("entra");
			

		}
		}catch (NullPointerException e) {
			
			
		}
		
	}
	
	
	public int[][] getMatrizMapa() {
		return matrizMapa;
	}

	public void setMatrizMapa(int matrizMapa[][]) {
		this.matrizMapa = matrizMapa;
	}
	
	
	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

	
	// Movimientos que se llaman para que el persona se mueva, sin embargo, evalua cual es la casilla para saber si puede pasar
	public void movimientoarriba() {
		
		
		pomax= entidad.get(0).getPoxm();
		pomay= entidad.get(0).getPoym();
		
		if(matrizMapa[pomay-1][pomax]==0 || matrizMapa[pomay-1][pomax]==3 ) {
			
			entidad.get(0).setArribita(1);
			entidad.get(1).setArribita(1);
			
			
		}
		

		
	}
	public void movimientoabajo() {
		
		
		pomax= entidad.get(0).getPoxm();
		pomay= entidad.get(0).getPoym();
		
		
		if(matrizMapa[pomay+1][pomax]==0 || matrizMapa[pomay+1][pomax]==3) {
		
		entidad.get(0).setAbajito(1);
		entidad.get(1).setAbajito(1);
		}
		
		
		
	}
	public void movimientoladod() {
		
		pomax= entidad.get(0).getPoxm();
		pomay= entidad.get(0).getPoym();
		
		
		
		if(matrizMapa[pomay][pomax+1]==0 || matrizMapa[pomay][pomax+1]==3) {
		entidad.get(0).setDerechita(1);
		entidad.get(1).setDerechita(1);
		}
		
		
		
	}
	public void movimientoladoi() {
		
		
		pomax= entidad.get(0).getPoxm();
		pomay= entidad.get(0).getPoym();
		
		
		if(matrizMapa[pomay][pomax-1]==0 || matrizMapa[pomay][pomax-1]==3) {
		entidad.get(0).setIzquier(1);
		entidad.get(1).setIzquier(1);
		}
		
		
	}
	public int getPokemn() {
		return pokemn;
	}
	public void setPokemn(int pokemn) {
		this.pokemn = pokemn;
	}

	
	// Metodo de ordenar pokemones 
	public void ordenar(int i) {
		
		
		switch (i) {
		
		//Ordena por Poder
		case 0:
			Collections.sort(entidad2,pv);
			
			break;
		//Ordena por nombre
		case 1:
			Collections.sort(entidad2,nv);
			
			break;

		}
		
	}
// Este es el metodo para evaluar la probabilidad de combate y su aleatoreidad
	public void zonaCombate() {
		
		
		
		pomax= entidad.get(0).getPoxm();
		pomay= entidad.get(0).getPoym();
		
		
		// Tiene que estar en la hierba alta que es 3 
		if(matrizMapa[pomay][pomax]==3 ) {
			
			
			// Randomico del 1 al 10 
			int posi= (int) apP.random(1,11);
			
			// Si esta dentro del 20 porciento aparece un pokemon salvaje 
			if(posi>1 && posi<=2) {
				
				 
			// Aleatorio del enemigo
				enemigo= (int) apP.random(1,5);
				
				setPantalla(6);
			
				
			}
			
		}
		
		
		
	}

	// Ataques que van restando la vida del enemigo
	public void ataque1() {
		framer=apP.frameCount;
		int ataquecito = entidad.get(1).getAt1();
		int vidita= entidad2.get(enemigo-1).getVida();
		entidad2.get(enemigo-1).setVida(vidita- ataquecito);
		framer2 = apP.frameCount;
	}
	
	public void ataque2() {
		framer=apP.frameCount;
		int ataquecito = entidad.get(1).getAt2();
		int vidita= entidad2.get(enemigo-1).getVida();
		entidad2.get(enemigo-1).setVida(vidita- ataquecito);
		framer2 = apP.frameCount;
		
	}
	
	public void ataque3() {
		framer=apP.frameCount;
		int ataquecito = entidad.get(1).getAt3();
		int vidita= entidad2.get(enemigo-1).getVida();
		entidad2.get(enemigo-1).setVida(vidita- ataquecito);
		framer2 = apP.frameCount;
	}
	
	public void ataque4() {
		
		int ataquecito = entidad.get(1).getAt4();
		int vidita= entidad2.get(enemigo-1).getVida();
		entidad2.get(enemigo-1).setVida(vidita- ataquecito);
		framer=apP.frameCount;
		framer2 = apP.frameCount;
	}

	
	
	
	// Indica cuando estamos atacando 
	public boolean isAtaquemos() {
		return ataquemos;
	}

	public void setAtaquemos(boolean ataquemos) {
		this.ataquemos = ataquemos;
	}
	
	
	// Calcula la vida de los personajes implicados para saber cuando lanzar la excepcion, ademas de restar los corazones 
	public void vida()
	{
		
	 calculadoravitalidad = 100 * entidad.get(1).getVida()/230;
		
	 if(calculadoravitalidad > 0) {
		 apP.image(unoIzquierda, 0, 0);
		 if(calculadoravitalidad > 21) {
			 apP.image(dosIzquierda, 0, 0);
			 if(calculadoravitalidad > 41) {
				 apP.image(tresIzquierda, 0, 0);
				 if(calculadoravitalidad > 61) {
					 apP.image(cuatroIzquierda, 0, 0);
					 if(calculadoravitalidad > 81) {
						 apP.image(cincoIzquierda, 0, 0);
						 
					 }
				 }
			 }
		 }
		 
	 }
	 
	 
	 
	 
		if (enemigo-1==0) {
			 cv1 = 100 * entidad2.get(0).getVida()/230;
			
		}else if(enemigo-1==1) {
			
			 cv2 = 100 * entidad2.get(1).getVida()/230;
			
		}else if(enemigo-1 == 2) {
			
			 cv3 = 100 * entidad2.get(2).getVida()/220;
			
		}else if (enemigo-1==3) {
			
			 cv4 = 100 * entidad2.get(3).getVida()/250;
		}
	 
		if(cv1 > 0 || cv2 > 0 || cv3 > 0 || cv4 > 0) {
			apP.image(unoDerecha, 0, 0);
			if(cv1 > 21 || cv2 >21 || cv3> 21 || cv4 >21) {
				apP.image(dosDerecha, 0, 0);
				if(cv1 > 41 || cv2 >41 || cv3 > 41 || cv4 > 41) {
					apP.image(tresDerecha, 0, 0);
					if(cv1 > 61 || cv2 >61 || cv3 > 61 || cv4 > 61) {
						apP.image(cuatroDerecha, 0, 0);
						if(cv1 > 81 || cv2 > 81 || cv3 > 81 || cv4 > 81) {
							
							apP.image(cincoDerecha, 0, 0);
							
						}
						
					}
					
				}
				
			}
			
		}
	 
	}
	
	public void primerae() throws Excepcion1 {
		
		
		
		if (entidad.get(1).getVida()<=0) {
			
		
			
			mensaje1 = true;
			throw new Excepcion1("El personaje principal se debilitó");
			
		}
		
	}
	
	public void segundae() throws Excepcion2 {
		
		
		
		if(entidad2.get(enemigo-1).getVida()<=0) {
			
			mensaje2 = true;
			throw new Excepcion2("El pokemon salvaje se debilitó");
			
			
		}
		
	}

	public void mouseClicked() {
	
		mensaje1=false; 
		mensaje2=false;
		mensaje3=false;
		mensaje4=false; 
	}

	public void huir() {
		
		// Reinicia la posicion
		entidad.get(0).regenerar();
		
	}

	public void pokebol() {
		framer4=apP.frameCount;
		pokebol=true;
		
	}

	
	// Guarda el resgitro en la linkeList
	public void guardado() {
		int dia, mes, anio, hora, minuto;
		
		
		dia = apP.day();
		mes = apP.month();
		anio = apP.year();
String fechota = dia+"-"+"0"+mes+"-"+anio;
		registro.add(new Usuario(hola,fechota,apP));
		
	}

	
// Organiza registor por nombre
	public void organizarnombre() {
		
		Collections.sort(registro,name);
		
		
	}
	
	
	
	// Organiza Registro por fecha
	public void organizarfecha() {
		
		Collections.sort(registro,fechita);
		
	}
	
	
}
