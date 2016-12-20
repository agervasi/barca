//ver 2

/*Prova   !!!!!!!!!!!!!!

 * GESTIONE PORTO TURISTICO
   PETRACHI
   il num di posto è quello in cui si trova la barca +1
   immaginiamo che il vettore sia il porto !!!!!!!!!!!!!!
   
   Ultima versione!!!!
*/

import java.util.Scanner;

public class TestPortoTuristico1 {

	private static Scanner sc;

	public static void main(String[] args) 
	{
		Porto p = new Porto();
		
		int scelta = 0;
		sc = new Scanner(System.in);
		do {
			Menu();
			System.out.print("Inserisci la scelta ");
			scelta = sc.nextInt();
			sc.nextLine();
			int pos;
			switch (scelta) {
			case 0:

				break;
			case 1:
				//creo un oggetto della classe veliero
			/*
				Veliero v1 = new Veliero("Estate", "Spagnola", 12.5, 10.50, "Vela", 5);
				pos= p.aggiungiBarca(v1);
				System.out.println("Il posto assegnato alla barca è "+ pos);
				//creo un oggetto della classe motore
				Motore m1 = new Motore("Primavera", "Greca", 12.5, 10.50, "Motore", 4);
				pos= p.aggiungiBarca(m1);
				System.out.println("La posizione della barca è: "+pos);
				
				*/
				//
				//int nvele=5;
				
				
				//
				System.out.println("Inserisci nome barca");
				String nome = sc.nextLine();
				System.out.println("Inserisci nazionalità");
				String nazio = sc.nextLine();
				System.out.println("Inserisci lunghezza");
				double lung = sc.nextDouble();

				System.out.println("Inserisci stazza");
				double stazza = sc.nextDouble();
				sc.nextLine();//svuoto il buffer
				System.out.println("Inserisci tipo: vela/motore (v/m)");
				String tipo = sc.nextLine();
			
				//ATTENZIONE: ci vuole un controllo dell'input per inserire solo v o m 
				if (tipo.compareToIgnoreCase("v")==0)
				{
					System.out.println("Inserisci numero vele");
					int nVele = sc.nextInt();
							
					Veliero v = new Veliero(nome, nazio, lung, stazza, "Vela", nVele);
					/*System.out.println("numero vele "+v.getNumVele());
					 * istruzione utilizzata  per conoscere il numero delle vele. Funziona
					 * Il problema sta nel come fare per ritornare dall'array
					 * un oggetto Veliero e non un oggetto barca.
					 */
					
					//
					
					//v.setNumVele(n);
					
					//
					pos = p.aggiungiBarca(v);
				}
				else
					{
						System.out.println("Inserisci potenza motore");
						int potMotore = sc.nextInt();
						
						Motore m = new Motore(nome, nazio, lung, stazza, "motore", potMotore);
						pos= p.aggiungiBarca(m);
					}
					
					System.out.println("Il posto assegnato alla barca è: "+pos);
			break;
			case 2:
				System.out.println("Elenco barche nel porto");
				System.out.println(p.toString());
				break;
			case 3:
				System.out.println("Partenza barca ");
				System.out.println("Inserisci il nome della barca ");
				String nome1 = sc.nextLine();
				System.out.println("Inserisci il numero di giorni di sosta ");
				int ng = sc.nextInt();
				sc.nextLine();
				double affitto= p.partenzaBarca(nome1, ng);
				System.out.println("L'affitto ammonta a € "+ affitto);
				break;
			case 4:
					System.out.println("Inserisci il numero del posto occupato dalla barca ");
					int posto = sc.nextInt();
					System.out.println("Inserisci il numero di giorni di sosta ");
					int ng1 = sc.nextInt();
					sc.nextLine();
					double affitto1= p.partenzaBarca(posto, ng1);
					if (affitto1 !=0)
						System.out.println("L'affitto ammonta a € "+ affitto1);
					else
						System.out.println("Nel posto indicato non è stata trovata alcuna barca ");
				break;
			case 5:
				System.out.println("Info Barche a vela");
				System.out.println(p.toString("Vela"));
				break;
			case 6:
				System.out.println("Info Barche a motore");
				System.out.println(p.toString("Motore"));
				break;
			case 7:
				/*Idea risolutiva punti 7 e 8 
				 * Si inserisce in input il posto occupato dalla barca
				 * Si chiama il metodo getBarca che ritorna un oggetto di tipo Barca
				 * Si utilizza l’operatore instanceof per verificare se l'oggetto che ritorna è 
				 * una barca a vela. Se il risultato è true Allora si effettua un casting
				 * (l'oggetto b della classe Barca punta a un oggetto v della classe Veliero). 
				 * Avendo a disposizione un oggetto della classe Veliero possiamo utilizzare 
				 * il metodo getNumVele della classe Veliero.
				 * 
				 * lo stesso discorso per conoscere la potenza del motore di una barca.
				 * */
				
				System.out.println("Inserisci il numero del posto occupato dalla barca ");
				int posto1 = sc.nextInt();
				sc.nextLine();
				Barca b = p.getBarca(posto1);
				
				
				if(b instanceof Veliero)  //verifica se b è un oggetto di tipo Veliero
					{ 
						Veliero v = (Veliero) b;  //casting eslicito tra le classi; b ora punta a un oggetto di Veliero
						System.out.println("num vele "+ v.getNumVele());  //chiamata al metodo getNumVele presente nella classe Veliero.
					}
				else 
				System.out.println("Nel posto indicato non è presente una barca a vela");
			
			break;					
			case 8:
				System.out.println("Inserisci il numero del posto occupato dalla barca ");
				int posto2 = sc.nextInt();
				sc.nextLine();
				Barca b1 = p.getBarca(posto2);
				if(b1 instanceof Motore)
					{ 
						Motore m = (Motore) b1;
						System.out.println("num vele "+ m.getPotenza());
					}
				else 
				System.out.println("Nel posto indicato non è presente una barca a motore");
			
			break;		
			default:
				System.out.println("CODICE NON RICONOSCIUTO");

			}
		}while (scelta != 0);

	}//main
	public static void Menu() {
		System.out
				.println("Seleziona una funzione \n"
					
						+ "1 - INSERISCI BARCA A VELA \n"
						+ "2 - INFO BARCHE \n"
						+ "3 - PARTENZA BARCA (nome) \n"
						+ "4 - PARTENZA BARCA (posto) \n"  
						+ "5 - INFO BARCHE A VELA \n"
						+ "6 - INFO BARCHE A MOTORE \n"
						+ "7 - NUMERO VELE DI UNA BARCA  \n"
						+ "8 - POTENZA DEL MOTORE DI UNA BARCA  \n"
						+ "0 - ESCI \n");
	}
}//class
