package Code;

import java.util.Random;

public class Modelo{
	
	private Carta carta[];
	private int Nro_cartas=40;
	private int CantJugadores, cartaActual;
	private Random numRam;
	private Jugador jugador[];
	
	public Modelo(int cantidad, String nombre) {
		
		CantJugadores = cantidad;
		boolean maq = false;
		for (int i = 0; i < CantJugadores; i++){
			jugador[i] = new Jugador(nombre, maq);
			maq = true;
		}
		
	}
	
	public void HacerMazo() {
		int numero[] = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
		String palo[] = { "ORO", "COPA", "ESPADA", "BASTO"}; 
		
		carta = new Carta[ Nro_cartas ];
	
		for ( int cuenta = 0; cuenta < carta.length; cuenta++ ){
			carta[cuenta] = new Carta( numero[cuenta % 10], palo[cuenta/10]); 
		}
	}

	public int get_Valor(int numero, String palo){
		int valor;
		if (numero == 1 && palo == "ESPADA") valor = 1;
		else if (numero == 1 && palo == "BASTO") valor = 2;
		else if (numero == 7 && palo == "ESPADA") valor = 3;
		else if (numero == 7 && palo == "ORO") valor = 4;
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
		
		return valor;
	}
	
	public void Barajar(){
		cartaActual = 0;
		 
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
	
	public void Ronda(int ronda) {
		
		if (ronda == CantJugadores){
			ronda = 1;
		}
		else ronda++;
	}
	
}