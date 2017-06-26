package Code;

import Code.View;

public class Control implements ControlInterface {
	
	private Modelo modelo;
	private View view;
	
	public Control(Modelo modelo){
		this.modelo = modelo;
		view = new View(this,this.modelo);
		view.setVisible(true);
	}
	
	public void MazodeCarta() {
		modelo.HacerMazo();
	}
	
	public String paloCarta(int i, int j){
		return modelo.jugador[i].carta[j].getPalo();
	}
	
	public int numeroCarta(int i, int j){
		return modelo.jugador[i].carta[j].getNumero();
	}
	
	public int valorCarta(int i, int j){
		return modelo.jugador[i].carta[j].valor;
	}

	public void Baraja(){
		modelo.Barajar();
	}

	public void Repartir(int nroCartas) {
		modelo.Repartir(nroCartas);
	}
	
	public void set_Apostar(int apuesta, int nroCartas, int i){
		modelo.apostar(i, nroCartas, apuesta); 
	}
	
	public void terminaRonda(int i){
		modelo.ganaRonda(i);
		modelo.terminaRonda();
	}
	
	public int valorApuesta(int i){
		return modelo.jugador[i].apuesta;
	}
	
	public int puntosJugador(int i){
		return modelo.jugador[i].puntosTotales;
	}
	
	public void restart(){
		modelo.RestartTotal();	
	}

}
