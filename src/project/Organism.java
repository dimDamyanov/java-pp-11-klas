package project;


public class Organism 
{
	String species;
	Allele[] genotype;
	
	public Organism(String species, Allele[] genotype) {
		this.species = species;
		this.genotype = genotype;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public String toString() {
		return String.format("%s, %s", this.species, this.genotype.toString());
	}
}
