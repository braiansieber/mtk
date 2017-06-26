package Principal;

import Code.Control;
import Code.Modelo;

public class main {
	
	public static void main(String[] args) {
		Modelo modelo = new Modelo(4, "Jugador");
		Control control = new Control(modelo);
		//View vista = new View(control, modelo);
	}

}
