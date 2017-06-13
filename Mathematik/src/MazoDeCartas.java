import java.util.Random;

public class MazoDeCartas
{
	private Carta carta[];
	private int cartaActual;
	private int Nro_cartas = 40;
	private Random numRam;
	
	 /////////////////////////////////////////////////////////////////
	 // CONSTRUCTOR
	 /////////////////////////////////////////////////////////////////
	
	public MazoDeCartas()
	{
		int numero[] = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
		String palo[] = { "ORO", "COPA", "ESPADA", "BASTO"}; 
		
		carta = new Carta[ Nro_cartas ];
		cartaActual = 0;
		numRam = new Random();
	
		for ( int cuenta = 0; cuenta < carta.length; cuenta++ )
		{
			//if(cuenta == 8 || cuenta == 16 || cuenta == 24 || cuenta == 32) cuenta = cuenta + 2;	
			System.out.print("cuenta: ");
			System.out.print("/10: " + cuenta/10 + " - ");
			System.out.print("%10: " + cuenta%10 + " - ");
			carta[cuenta] = new Carta( numero[cuenta % 10], palo[cuenta/10]); 
			System.out.println();
		}
	}
	
	// METODO BARAJAR
		
	public void barajar()
	{
		cartaActual = 0;
		 
		for ( int primera = 0; primera < carta.length; primera++ )
		{ 
			int segunda = numRam.nextInt(Nro_cartas);
			 
			Carta temp = carta[primera];
			
			carta[primera] = carta[segunda];
			carta[segunda] = temp;
			 
		}
	}
		
	public Carta repartirCarta()
	{
		if (cartaActual < carta.length )
		return carta[cartaActual++];
		else return null;
	}
}