//ver 4
public class Motore extends Barca {
private int potenza;
	
	//costruttore
	public Motore (String nome, String nazio, double lung, double stazza, String tipo, int potenza)
	{
		super (nome, nazio, lung, stazza, tipo);  //provare a dichiarare questi attributi protected e vedere cosa cambia 
		this.potenza=potenza;
	}
	
	
	public int getPotenza()
	
	{
		return potenza;
	}
		
	public String toString() {
		String s = "";
		s=s+ super.toString()+ " potenza:  "+ potenza;	//aggiunge il nuovo attributo
		return s;
	}
	
//test di classe
	
	/*
	public static void main(String[] args) 
	{
		Motore m1 = new Motore("Il mare", "Italiana", 12.5, 10.50, "Motore", 4);
		System.out.println("Nome  "+"     Nazionalità"+"    lunghezza "+"\t stazza"+ "\t tipo"+ "\t potenza"+"\n");
		System.out.println(m1.toString());
	}//fine test	
	
	*/
}
