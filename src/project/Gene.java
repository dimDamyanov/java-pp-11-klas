package project;

public class Gene {
	public String locus;
	public String trait;
	
	public Gene(String locus, String trait) {
		this.locus = locus;
		this.trait = trait;
	}
	
	public String getLocus() {
		return locus;
	}
	public String getTrait() {
		return trait;
	}
	
	public String toString() {
		return String.format("%s %s", locus, trait);
	}
}
