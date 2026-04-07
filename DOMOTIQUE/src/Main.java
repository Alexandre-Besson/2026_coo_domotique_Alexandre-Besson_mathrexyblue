import thermos.Thermostat;

public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);
		
		/****** A COMPLETER ******/
		Hifi h1=new Hifi();
		Cheminee c1=new Cheminee();
		AdapterCheminee c=new AdapterCheminee(c1);
		Thermostat th1=new Thermostat();
		AdapterThermostat th2=new AdapterThermostat(th1);

		t.ajouterAppareil(h1);
		t.ajouterAppareil(c);
		t.ajouterAppareil(th2);


		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
