package Code;

public class Carta
{
	Modelo modelo;
	private int numero;
	public int valor;
	private String palo;
	
	public Carta( int numero, String palo, int valor) {
		this.numero = numero;
		this.palo = palo;
		this.valor = valor;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public String getPalo(){
		return palo;
	}
	
	
}