package con.tnsif.inheritance;
class India{
	protected String lang="Hindi";
	void displayNational() {
		System.out.println("National Lang"+lang);
		}
}
class Kerala extends India{
	public String lang="Malyalam";
	void displayLocalKerala() {
		System.out.println("Local lang"+lang);
	}
}
public class Karnataka extends India {
	public String lang="Kannada";
	void displayLocalKarnataka() {
		System.out.println("Local Lang"+lang);
	}

}
