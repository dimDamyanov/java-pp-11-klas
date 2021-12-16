package project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String parent1Genotype, parent2Genotype;
		
		System.out.print("Enter P1 genotype: ");
		parent1Genotype = sc.next();
		System.out.print("Enter P2 genotype: ");
		parent2Genotype = sc.next();
		
		Set <Character> allelesSet = new HashSet<>();
		for (int i = 0; i < parent1Genotype.length(); i++)
			allelesSet.add(parent1Genotype.charAt(i));
		for (int i = 0; i < parent1Genotype.length(); i++)
			allelesSet.add(parent2Genotype.charAt(i));
		
		List<Character> alleles = new ArrayList<Character>(allelesSet);
		SortedMap<Character, String> alleleExpression = new TreeMap<Character, String>();
		System.out.println("Enter allele expresions!");
		for (int i = 0; i < alleles.size(); i++) {
			System.out.printf("%s: ", alleles.get(i));
			alleleExpression.put(alleles.get(i), sc.next());
		}

		String[][] punnettsLattice = null;
		if (parent1Genotype.length() == 2 && parent2Genotype.length() == 2) {
			punnettsLattice = Mendel.monohybridCrossPunnettLattice(parent1Genotype, parent2Genotype);
		} 
		else if (parent1Genotype.length() == 4 && parent2Genotype.length() == 4) {
			punnettsLattice = Mendel.dihybridCrossPunnettLattice(parent1Genotype, parent2Genotype);
		}
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
		SortedMap genotypicRatio = Mendel.calculateGenotypicRatio(punnettsLattice);
		SortedMap phenotypicRatio = Mendel.calculatePhenotypicRatio(punnettsLattice);
		
		System.out.print("Genotypic ratio: ");
		List<String> genotypeKeys = new ArrayList<String>(genotypicRatio.keySet());
		for (int i = 0; i < genotypeKeys.size(); i++) {
			if (i != genotypeKeys.size() - 1) {
				System.out.printf("%s : ", genotypeKeys.get(i));
			}
			else {
				System.out.printf("%s => ", genotypeKeys.get(i));
			}
		}
		for (int i = 0; i < genotypeKeys.size(); i++) {
			if (i != genotypeKeys.size() - 1) {
				System.out.printf("%d : ", genotypicRatio.get(genotypeKeys.get(i)));
			}
			else {
				System.out.printf("%d\n", genotypicRatio.get(genotypeKeys.get(i)));
			}
		}
		
		System.out.println("Phenotypic ratio: ");
		List<String> phenotypeKeys = new ArrayList<String>(phenotypicRatio.keySet());
		for (int i = 0; i < phenotypeKeys.size(); i++) {
			if (phenotypeKeys.get(i).length() == 1) {
				System.out.printf("\t%s: %d\n", alleleExpression.get(phenotypeKeys.get(i).charAt(0)), phenotypicRatio.get(phenotypeKeys.get(i)));
			}
			else if (phenotypeKeys.get(i).length() == 2) {
				System.out.printf("\t%s, %s: %d\n", alleleExpression.get(phenotypeKeys.get(i).charAt(0)), alleleExpression.get(phenotypeKeys.get(i).charAt(1)), phenotypicRatio.get(phenotypeKeys.get(i)));
			}
		}
		List<Integer> phenotypicValues = new ArrayList<Integer>(phenotypicRatio.values());
		for (int i = 0; i < phenotypicValues.size(); i++) {
			if (i != phenotypicValues.size() - 1) {
				System.out.printf("%d : ", phenotypicValues.get(i));
			}
			else {
				System.out.printf("%d\n", phenotypicValues.get(i));
			}
		}
	}

}
