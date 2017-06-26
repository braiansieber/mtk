package Code;

public class Carta
{
	Modelo modelo;
	@SuppressWarnings("unused")
	private int numero;
	public int valor;
	@SuppressWarnings("unused")
	private String palo;
	
	public Carta( int numero, String palo, int valor) {
		this.numero = numero;
		this.palo = palo;
		this.valor = valor;
	}
}