package Code;

import java.util.Random;

public class Modelo{
	
	private Carta carta[];
	private int Nro_cartas=40;
	private int CantJugadores, cartaActual;
	public Random numRam;
	public Jugador jugador[];
	
	public Modelo(int cantidad, String nombre) {
		
		CantJugadores = cantidad;
		boolean maq = false;
		jugador = new Jugador[cantidad];
		for (int i = 0; i < CantJugadores; i++){
				jugador[i] = new Jugador(nombre, maq);
				maq = true;
		}
		HacerMazo();
	}
	
	public void HacerMazo() {
		int numero1[] = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
		String palo1[] = { "ORO", "COPA", "ESPADA", "BASTO"}; 
		
		carta = new Carta[ Nro_cartas ];
	
		for ( int cuenta = 0; cuenta < carta.length; cuenta++ ){
			
			int valor;
			int numero = numero1[cuenta % 10];
			int palo = cuenta/10;
			if (numero == 1 && palo == 2) valor = 1;
			else if (numero == 1 && palo == 3) valor = 2;
			else if (numero == 7 && palo == 2) valor = 3;
			else if (numero == 7 && palo == 0) valor = 4;
			else if (numero == 3) valor = 5;
			else if (numero == 2) valor = 6;
			else if (numero == 1) valor = 7;
			else if (numero == 12) valor = 8;
			else if (numero == 11) valor = 9;
			else if (numero == 10) valor = 10;
			else if (numero == 7) valor = 11;
			else if (numero == 6) valor = 12;
			else if (numero == 5) valor = 13;
			else valor = 14;
			
			carta[cuenta] = new Carta( numero, palo1[cuenta/10], valor); 
		}
	}
	
	public int valorCarta(int i){
		return carta[i].valor;
	}
	
	public void Barajar(){
		cartaActual = 0;
		numRam = new Random();
		
		 
		for ( int primera = 0; primera < carta.length; primera++ ){ 
			int segunda = numRam.nextInt(Nro_cartas);
			 
			Carta temp = carta[primera];
			
			carta[primera] = carta[segunda];
			carta[segunda] = temp;
		}
	}
		
	public Carta repartirCarta()
	{
		if (cartaActual < carta.length )
		return carta[cartaActual++];
		else return null;
	}
	
	public void Repartir(int nroCartas)
	{
		for (int i = 0; i < CantJugadores; i++) {
			for (int j = 0; j < nroCartas; j++) {
				jugador[i].actualizaCartas(repartirCarta(), j);
			}
		}
	}
	
	public void apostar(int i, int nroCartas, int apuesta) 
	{
		if (jugador[i].esMaquina()){
			numRam = new Random();
			int apuestin = numRam.nextInt(nroCartas);
			jugador[i].apuesta(apuestin);
		}
		else jugador[i].apuesta(apuesta);
	}
	
	public void RestartTotal() {
		for (int i = 0; i < CantJugadores; i++) {
			jugador[i].restartTotal();	
		}
	}
	
	public void RestartRonda() {
		for (int i = 0; i < CantJugadores; i++) {
			jugador[i].restartRonda();	
		}
	}
	
	public void ganaRonda (int ronda){
		int j=0;
		for (int i = 1; i < CantJugadores; i++) {
			if (jugador[j].valorRonda(ronda) < jugador[i].valorRonda(ronda)){
				j = i;
			}
		}
		jugador[j].pointRonda();
	}
	
	public void terminaRonda (){
		for (int i = 0; i < CantJugadores; i++) {
			if (jugador[i].puntosRonda() == jugador[i].apuestaRonda()) {
				jugador[i].actualizaPuntos(10+jugador[i].puntoRonda);
			}
			else jugador[i].actualizaPuntos(jugador[i].puntoRonda);
		}
	}
	
	
}