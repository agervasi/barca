/*porto mio
 * 
 * Test di classe:  funziona. 
 *  
 * Idea risolutiva:  i posti all'interno del porto sono numerati 
   a partire da 1. Il primo elemento del vettore rimane inutilizzato 
   quindi il numero di posto assegnato a una barca corrisponde
   alla posizione occupata dalla barca all'interno del vettore. 
 *  */

public class Porto {
	static final int MAXPOSTI = 5+1; // devono essere 100+1;
	private Barca[] porto;
	private static final double PREZZOVELA = 10.00;
	private static final double PREZZOMOTORE = 20.00;

	public Porto() {
		porto = new Barca [MAXPOSTI];	//creo il vettore
	}
	
	//1 
	public int aggiungiBarca(Barca b )
	{
		int i=1;
		boolean sw = false; 
		while( (i <porto.length)&&(!sw))
		{
			if (porto[i] == null)
			{
				porto[i]=b;
				sw=true;
			}
			else
				i++;
		}//while
		return i;
		
	}//aggiungiBarca
	
	
	//2
	public String toString()
	{	String s = "";
		for (int i=1; i<porto.length; i++)
		{
			if (porto[i] != null)
				//funziona anche se non c'è il toStrng()
				s+="\n" +"Posizione: " +i+"\t"+  porto[i].toString();//crea una stringa con gli oggetti del vettore
				}
		return s;
	}
	
		
	//3
	public double  partenzaBarca(String nome, int ng)	{
		double importo= 0.0;
		int i=1;
		boolean sw = false; 
		while( (i <porto.length)&&(!sw))
		{
			if ((porto[i] != null) &&(porto[i].getNome().compareToIgnoreCase(nome)==0))
			
			{	
				if (porto[i].getTipo().compareToIgnoreCase("Vela")==0)
					importo =Porto.getPrezzovela()*ng;
				else
					importo = Porto.getPrezzomotore()*ng;
				
				//end if
			
				porto[i]=null;
				sw = true;
				
			}//then	
			else
				i++;
		}//while
		
		return importo;
		
	}//partenzabarca
	
	//4 Esempio di overloading dei metodi. Punto 3 e punto 4
	public double  partenzaBarca(int posto, int ng)	{
		double importo= 0.0;
		
			if ((porto[posto] != null) )
			
			{
				if (porto[posto].getTipo().compareToIgnoreCase("Vela")==0)
			
					importo =Porto.getPrezzovela()*ng;
				else
					importo  = Porto.getPrezzomotore()*ng;
				
				//end if
				porto[posto]=null;
				return importo;
			}
			else
				return 0;
	}//partenzabarca
	
	//5 //6  overloading dei metodi con il punto 2
	
	public String toString(String tipo)
	/*viene passato il tipo della barca: se è vela visualizza le barche a vela
	 * se è motore visualizza le barche a motore */
	{	String s = "";
		for (int i=1; i<porto.length; i++)
		{
			if (porto[i] != null)
				if (porto[i].getTipo().compareToIgnoreCase(tipo)==0)
					s+="\n" +"Posizione: " +i+"\t"+  porto[i];//si può anche aggiungere .toString()
		}
		return s;
	}
	
	//7 
	 public Barca getBarca(int posto)	{
		Barca b = null;
			
		if ((porto[posto] != null) )
			if (porto[posto].getTipo().compareToIgnoreCase("Vela")==0)
		
				b= porto[posto];
							
		return b;  //nel caso non ci sia una barca 
	
	}//getBarca
	 
	 
	 	 
	public static int getMaxposti() {
		return MAXPOSTI;
	}
	
	public static double getPrezzovela() {
		return PREZZOVELA;
	}

	public static double getPrezzomotore() {
		return PREZZOMOTORE;
	}
	
	// Test di classe
	/*
	public static void main(String[] args) 
	{
		// creo tre oggetti della classe Barca
		Barca b1 = new Barca("Il mare", "Italiana", 8.5, 5.50, "Vela");
		Barca b2 = new Barca("Il sole", "Tedesca", 20.5, 7.50, "Motore");
		Barca b3 = new Barca("Il cielo", "Inglese", 10.5, 20.50, "Vela");
		
		//creo un oggetto della classe Porto
		Porto p= new Porto();
		
		int pos1, pos2, pos3;
		pos1 = p.aggiungiBarca(b1);
		pos2 = p.aggiungiBarca(b2);
		pos3 = p.aggiungiBarca(b3);
		
		System.out.println(" Posizione   Nome  "+"     Nazionalità"+"    lunghezza "+"\t stazza"+ "\t tipo");
		System.out.println(p.toString());
	}//fine test
	*/
}// class Porto
