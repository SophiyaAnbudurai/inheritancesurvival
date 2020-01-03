package inheritancesurvival;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String species;
		String locomotiontype;
		String hasHeatResistance;
		Scanner Sc =new Scanner(System.in);
		species=Sc.next();
		locomotiontype=Sc.next();
		hasHeatResistance=Sc.next();
		Dinosaur dino = new Dinosaur(species,locomotiontype,hasHeatResistance);
		dino.display();
		System.out.println("Species:"+species);
		System.out.println("Travel by :"+locomotiontype);
		
	}

}
