package inheritancesurvival;

public class LavaDinosaur {
	private String species;
    private String locomotiontype;
	public LavaDinosaur(String species, String locomotiontype) {
		super();
		this.species = species;
		this.locomotiontype = locomotiontype;
	}
	
	public void display()
	{
		System.out.println("Enter Species: "+species);
		System.out.println("Enter the locomotiontype: "+locomotiontype);
	}

}
