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
