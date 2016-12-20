/*Petrachi  * Test di classe: ok  *   
 *   */


public class Veliero extends Barca{
	private int numVele;
	
	//costruttore
	public Veliero (String nome, String nazio, double lung, double stazza, String tipo, int numVele)
	{
		super (nome, nazio, lung,stazza, tipo);  //provare a dichiarare questi attributi protected e vedere cosa cambia 
		this.numVele=numVele;
	}
	
	
	
	public String toString() {
		String s = "";
		s=s+ super.toString()+ "  num. vele  "+ numVele; //aggiunge il nuovo attributo
		return s;
	}
	
	public int getNumVele()
	{
		return numVele;
	}
	
	public void setNumVele(int n)
	{
		numVele=n;
		return;
	}
//test di classe
	
	/*
	public static void main(String[] args) 
	{
		Veliero v1 = new Veliero("Il mare", "Italiana", 12.5, 10.50, "Vela", 5);
		System.out.println("Nome  "+"     Nazionalità"+"    lunghezza "+"\t stazza"+ "\t tipo"+ "\t n. vele"+"\n");
		System.out.println(v1.toString());
	}//fine test	
	
	*/
}//class veliero
