package model;

import processing.core.PApplet;

public class Usuario {

	int dia, mes, anio, hora, minuto;
	String nombre,fechas;
	PApplet app;
	
	
	
	public Usuario(String textico, PApplet apP) {
		
		
		app=apP;
		nombre=textico;
		dia = app.day();
		mes = app.month();
		anio = app.year();
		hora = app.hour();
		minuto = app.minute();
		
		
	}



	public Usuario(String nombre2, String fecha, PApplet apP2) {
		nombre=nombre2;
		fechas=fecha;
		app=apP2;
		
		
		
		
	}



	public String getFechas() {
		return fechas;
	}



	public void setFechas(String fechas) {
		this.fechas = fechas;
	}



	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		this.dia = dia;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getAnio() {
		return anio;
	}



	public void setAnio(int anio) {
		this.anio = anio;
	}



	public int getHora() {
		return hora;
	}



	public void setHora(int hora) {
		this.hora = hora;
	}



	public int getMinuto() {
		return minuto;
	}



	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
