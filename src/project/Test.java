package project;

import java.util.SortedMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[][] punnettsLattice = Mendel.monohybridCrossPunnettLattice("Aa", "Aa");
//		Mendel.calculateGenotypicRatio(punnettsLattice);
//		for (int i = 0; i < punnettsLattice.length; i++) {
//		for (int j = 0; j < punnettsLattice[i].length; j++) {
//			if (punnettsLattice[i][j] == null) {
//				System.out.print("\t0");
//			}
//			else {
//				System.out.print('\t' + punnettsLattice[i][j]);
//			}				
//		}
//		System.out.println();
//	}
//	
//	System.out.print(gametes1.toString());
//	System.out.print(gametes2.toString());
		
//		String[][] punnettsLattice = Mendel.dihybridCrossPunnettLattice("YyRr", "YyRr");
		String[][] punnettsLattice = Mendel.monohybridCrossPunnettLattice("Aa", "Aa");
		for (int i = 0; i < punnettsLattice.length; i++) {
			for (int j = 0; j < punnettsLattice[i].length; j++) {
				if (punnettsLattice[i][j] == null) {
					System.out.print("\t0");
				}
				else {
					System.out.print('\t' + punnettsLattice[i][j]);
				}				
			}
			System.out.println();
		}
		
		SortedMap<String, Integer> genotypeRatios = Mendel.calculateGenotypicRatio(punnettsLattice);
		System.out.println("Genotypic ratio: " + genotypeRatios.toString());
		
		SortedMap<String, Integer> phenotypeRatios = Mendel.calculatePhenotypicRatio(punnettsLattice);
		System.out.println("Phenotypic ratio: " + phenotypeRatios.toString());
	}
}
