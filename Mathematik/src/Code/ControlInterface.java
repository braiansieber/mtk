package Code;

public interface ControlInterface {
	
	void MazodeCarta();
	
	void Baraja();
	
	String paloCarta(int i, int j);
	
	int numeroCarta(int i, int j);
	
	int valorCarta(int i, int j);
	
	void Repartir(int nroCartas);
	
	void set_Apostar(int apuesta, int nroCartas, int i);
	
	void restart();

}
