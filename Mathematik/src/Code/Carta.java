package Code;

public class Carta
{
	private int numero;
	private String palo;
	Modelo modelo;
	public int valor;
	
	public Carta( int numeroCarta, String paloCarta) {
		numero = numeroCarta;
		palo = paloCarta;
//		System.out.print(" nC: " + numeroCarta);
		valor = modelo.get_Valor(numero, palo);
	}
}