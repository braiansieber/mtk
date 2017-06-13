
public class Carta
{
	private int numero;
	private String palo;
	private int valor;
	
	public Carta( int numeroCarta, String paloCarta) {
		numero = numeroCarta;
		palo = paloCarta;
		System.out.print(" nC: " + numeroCarta);
		valor = getValor(numero, palo);
	}

	public String toString()
	{   
		return numero + " de " + palo;
	}   
	
	public int getValor(int numero, String palo)
	{
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
}