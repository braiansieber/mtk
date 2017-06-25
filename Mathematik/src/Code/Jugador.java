package Code;

public class Jugador extends JugadorP {
	
	public Jugador(String nombre, boolean Maq) {
		
		Maquina = Maq;
		if (Maquina == false) Nombre = nombre;
		else {
			Nombre = "Maquina" + i;
			i++;
		}
		puntosTotales = 0;
		apuesta = 0;
		carta = new Carta[10];
		puntoRonda = 0;
	}
	
	public void apuesta(int apuesta){
		this.apuesta = apuesta;
	}
	
	public boolean esMaquina(){
		return Maquina;
	}
	
	public void actualizaPuntos(int puntos){
		puntosTotales = puntos;
	}
	
	public void actualizaCartas( Carta carta, int nro ){	
		this.carta[nro] = carta;
	}
	
	public void pointRonda(){
		puntoRonda++;
	}
	
	public void restartRonda() {
		puntoRonda = 0;
	}
	
	public void restartTotal() {
		puntosTotales = 0;
	}
	
	public int valorRonda(int i) {
		return carta[i].valor;
	}
	
	public int apuestaRonda() {
		return apuesta;
	}
	
	public int puntosRonda() {
		return puntoRonda;
	}
}