package Code;


public class Control implements ControlInterface {
	
	private Modelo modelo;
	
	public Control(Modelo modelo){
		this.modelo = modelo;
	}
	
	public void MazodeCarta() {
		modelo.HacerMazo();
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
	
	public void restart(){
		modelo.RestartTotal();	
	}

}
