package project;

public class Allele extends Gene {
	boolean isRecesive;
	Gene parentGene;
	String traitExpression;
	public Allele(String locus, String trait, boolean isRecesive, Gene parentGene, String traitExpression) {
		super(locus, trait);
		this.isRecesive = isRecesive;
		this.parentGene = parentGene;
		this.traitExpression = traitExpression;
	}
	
	public boolean isRecesive() {
		return isRecesive;
	}
	public String getTraitExpression() {
		return traitExpression;
	}
	
	public String toString() {
		return super.toString() + String.format(" recesive %b allele of %s with trait expression", this.isRecesive, parentGene.toString(), this.traitExpression);
	}
}