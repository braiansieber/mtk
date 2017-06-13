public class Paquete
{
	public static void main(String args[])
	{     
		MazoDeCartas miPaqueteDeCartas = new MazoDeCartas();
		miPaqueteDeCartas.barajar();
		  
		// IMPRIME
		
		System.out.println("\n");
		
		for (int i = 0;i < 14;i++)
		{
			System.out.print(miPaqueteDeCartas.repartirCarta() + " ");
			System.out.print(miPaqueteDeCartas.repartirCarta() + " ");
			System.out.println(miPaqueteDeCartas.repartirCarta());
		}
	}
}    