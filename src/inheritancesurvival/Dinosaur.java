package inheritancesurvival;

public class Dinosaur extends LavaDinosaur {
	
	private String species;
    private String locomotiontype;
    private String hasHeatResistance;
	
	public Dinosaur(String species, String locomotiontype, String hasHeatResistance) {
		super(species, locomotiontype);
		
		this.hasHeatResistance = hasHeatResistance;
	}

	
	public void display()
	{
		super.display();
		System.out.println("Is Resistance: " +hasHeatResistance);
		System.out.println("Dino Details");
		int v=hasHeatResistance.compareTo("yes");
		if(v==0)
		{
			System.out.println("Lives on underground");
			
		}
		else
		{
			System.out.println("Did not survive");
		}
	}
}
