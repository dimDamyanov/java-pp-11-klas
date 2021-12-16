package tests;

public class DraftTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LewisStructure CO2 = new LewisStructure("C", "O", 2);
		System.out.println("Valence electrons: " + CO2.valenceElectrons);
		System.out.println(CO2.positionOfCentralAtom());
		System.out.println(CO2.getPositionRadicals("C", 1));
		System.out.println(CO2.getPositionRadicals("O", 1));
		System.out.println(CO2.getPositionElectrons("O", 1));
		System.out.println(CO2.getPositionRadicals("O", 2));
		System.out.println(CO2.getPositionElectrons("O", 2));
		System.out.println("Bonds of C: " + CO2.countBonds("C", 1));
		System.out.println("Bonds of O: " + CO2.countBonds("O", 1));
		System.out.println("Bonds of O: " + CO2.countBonds("O", 1));
		System.out.println("Formal charge of C: " + CO2.getFormalCharge("C", 1));
		System.out.println("Formal charge of O: " + CO2.getFormalCharge("O", 1));
		System.out.println("Formal charge of O: " + CO2.getFormalCharge("O", 2));
		int j=0;
		for(int i=0; i<CO2.electrons.length; i++) { 
			if(i!=((CO2.electrons.length)-1)) {
				System.out.println("Electrons of " + CO2.radicals[j] + " : " + CO2.electrons[i]);
			}
			else System.out.println("Electrons of central atom: " + CO2.electrons[i]);
			j+=2;
			if(j==CO2.positionOfCentralAtom()) j+=2;
		}
		for(int i=0; i<CO2.radicals.length; i++) {
			System.out.print(CO2.radicals[i]);
		}
		System.out.println();
		CO2.setBonds();
		/*for(int i=0; i<CO2.radicals.length; i++) {
			System.out.print(CO2.radicals[i]);
		}
		int k=0;
		for(int i=0; i<CO2.electrons.length; i++) { 
			if(i!=((CO2.electrons.length)-1)) {
				System.out.println("Electrons of " + CO2.radicals[k] + " : " + CO2.electrons[i]);
			}
			else System.out.println("Electrons of central atom: " + CO2.electrons[i]);
			k+=2;
			if(k==CO2.positionOfCentralAtom()) k+=2;
		}
		System.out.println("Bonds of C: " + CO2.countBonds("C", 1));
		System.out.println("Bonds of O: " + CO2.countBonds("O", 1));
		System.out.println("Formal charge of C: " + CO2.getFormalCharge("C", 1));
		System.out.println("Formal charge of O: " + CO2.getFormalCharge("O", 1));*/
	}

}
