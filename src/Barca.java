/*Petrachi
Test di classe: OK
Decidere come dichiarare gli attributi: private o protected ??? !!!!!!!!!!!!!!!!!
*/

public class Barca {
	private String nome;
	private String nazio;
	private double lung;
	private double stazza;
	private String tipo;
	
	
	public Barca(String nome, String nazio, double lung, double stazza, String tipo) {
		this.nome = nome;
		this.nazio = nazio;
		this.lung = lung;
		this.stazza = stazza;
		this.tipo = tipo;
	}
	

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNazio() {
		return nazio;
	}

	public void setNazio(String nazio) {
		this.nazio = nazio;
	}

	public double getLung() {
		return lung;
	}

	public void setLung(double lung) {
		this.lung = lung;
	}

	public double getStazza() {
		return stazza;
	}

	public void setStazza(double stazza) {
		this.stazza = stazza;
	}
	
	public String toString() {
		String s="";
		s+="nome: "+nome + "  nazione:  "+ nazio +"  lunghezza:  ";
		s+= lung+ "  stazza:  "+ stazza + "  tipo: "+tipo + " " ;
		return  s;
	}
	
	//test di classe
	/*
	public static void main(String[] args) 
	{
		Barca b1 = new Barca("Il corsaro", "Italiana", 12.5, 10.50, "Vela");
		System.out.println("\n  Nome  "+"     Nazionalità"+"    lunghezza "+"\t stazza"+ "\t tipo"+"\n");
		System.out.println(b1.toString());
	}//fine test
	*/
}//Barca