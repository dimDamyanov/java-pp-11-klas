package project;
import java.util.*;
public class Mendel {
	private Mendel() {}
	
	public static String[][] monohybridCrossPunnettLattice(String genotype1, String genotype2) {
		Set<Character> gametes1Set = new HashSet<>();
		for (char c: genotype1.toCharArray()) {
			gametes1Set.add(c);
		}
		List<Character> gametes1 = new ArrayList<>(gametes1Set);
		
		Set<Character> gametes2Set = new HashSet<Character>();
		for (char c: genotype2.toCharArray()) {
			gametes2Set.add(c);
		}
		List<Character> gametes2 = new ArrayList<Character>(gametes2Set);
		
		String[][] punnettsLattice = new String[gametes1.size()+1][gametes2.size()+1];
		punnettsLattice[0][0] = "";
		for (int i = 0; i < gametes1.size(); i++) {
			punnettsLattice[i+1][0] = gametes1.get(i).toString();
		}
		for (int i = 0; i < gametes2.size(); i++) {
			punnettsLattice[0][i+1] = gametes2.get(i).toString();
		}
		
		for (int i = 1; i < punnettsLattice.length; i++) {
			for (int j = 1; j < punnettsLattice[i].length; j++) {
				String currentGenotype = punnettsLattice[i][0] + punnettsLattice[0][j];
				char[] tempArray = currentGenotype.toCharArray();
				Arrays.sort(tempArray);
				punnettsLattice[i][j] = new String(tempArray);
			}
		}
		
		return punnettsLattice;
	}
	public static String[][] dihybridCrossPunnettLattice(String genotype1, String genotype2) {
		String genotype1FirstTrait = genotype1.substring(0, 2);
		String genotype1SecondTrait = genotype1.substring(2);
		String genotype2FirstTrait = genotype2.substring(0, 2);
		String genotype2SecondTrait = genotype2.substring(2);
		
		Set<Character> gametes1FirstTraitSet = new HashSet<Character>();
		for (char c: genotype1FirstTrait.toCharArray()) {
			gametes1FirstTraitSet.add(c);
		}
		List<Character> gametes1FristTrait = new ArrayList<>(gametes1FirstTraitSet);
		
		Set<Character> gametes1SecondTraitSet = new HashSet<Character>();
		for (char c: genotype1SecondTrait.toCharArray()) {
			gametes1SecondTraitSet.add(c);
		}
		List<Character> gametes1SecondTrait = new ArrayList<>(gametes1SecondTraitSet);
		
		List<String> gametes1 = new ArrayList<String>();
		for (Character g1: gametes1FristTrait) {
			for (Character g2: gametes1SecondTrait) {
				gametes1.add(g1.toString() + g2.toString());
			}
		}
		
		Set<Character> gametes2FirstTraitSet = new HashSet<Character>();
		for (char c: genotype2FirstTrait.toCharArray()) {
			gametes2FirstTraitSet.add(c);
		}
		List<Character> gametes2FristTrait = new ArrayList<>(gametes2FirstTraitSet);
		
		Set<Character> gametes2SecondTraitSet = new HashSet<Character>();
		for (char c: genotype2SecondTrait.toCharArray()) {
			gametes2SecondTraitSet.add(c);
		}
		List<Character> gametes2SecondTrait = new ArrayList<>(gametes2SecondTraitSet);
		
		List<String> gametes2 = new ArrayList<String>();
		for (Character g1: gametes2FristTrait) {
			for (Character g2: gametes2SecondTrait) {
				gametes2.add(g1.toString() + g2.toString());
			}
		}
		
		String[][] punnettsLattice = new String[gametes1.size() + 1][gametes2.size() + 1];
		punnettsLattice[0][0] = "";
		for (int i = 0; i < gametes1.size(); i++) {
			punnettsLattice[i+1][0] = gametes1.get(i);
		}
		for (int i = 0; i < gametes2.size(); i++) {
			punnettsLattice[0][i+1] = gametes2.get(i);
		}
		
		for (int i = 1; i < punnettsLattice.length; i++) {
			for (int j = 1; j < punnettsLattice[i].length; j++) {
				String currentGenotype = punnettsLattice[i][0] + punnettsLattice[0][j];
				char[] tempArray = currentGenotype.toCharArray();
				Arrays.sort(tempArray);
				Character firstTraitDesignation = genotype1.charAt(0);
				Character secondTraitDesignation = genotype1.charAt(2);
				Hashtable<Character, Integer> traitDesignationsPriority = new Hashtable<Character, Integer>();
				traitDesignationsPriority.put(Character.toUpperCase(firstTraitDesignation), 1);
				traitDesignationsPriority.put(Character.toLowerCase(firstTraitDesignation), 2);
				traitDesignationsPriority.put(Character.toUpperCase(secondTraitDesignation), 3);
				traitDesignationsPriority.put(Character.toLowerCase(secondTraitDesignation), 4);
				for (int k = 0; k < tempArray.length - 1; k++) {
					for (int l = 0; l < tempArray.length - k - 1; l++) {
						if (traitDesignationsPriority.get(tempArray[l]) > traitDesignationsPriority.get(tempArray[l + 1])) {
							char temp = tempArray[l];
							tempArray[l] = tempArray[l + 1];
							tempArray[l + 1] = temp;
						}
					}
				}
				punnettsLattice[i][j] = new String(tempArray);
			}
		}
		
		return punnettsLattice;
	}
	
	public static SortedMap<String, Integer> calculateGenotypicRatio(String[][] punnettsLattice) {
		SortedMap<String, Integer> genotypeRatios = new TreeMap<String, Integer>();
		for (int i = 1; i < punnettsLattice.length; i++) {
			for (int j = 1; j < punnettsLattice[i].length; j++) {
				if (!genotypeRatios.containsKey(punnettsLattice[i][j])) {
					genotypeRatios.put(punnettsLattice[i][j], 0);
				}
				genotypeRatios.put(punnettsLattice[i][j], genotypeRatios.get(punnettsLattice[i][j]) + 1);
			}
		}
		return genotypeRatios;
	}
	
	public static SortedMap<String, Integer> calculatePhenotypicRatio(String[][] punnettsLattice) {
		SortedMap<String, Integer> phenotypeRatios = new TreeMap<String, Integer>();
		for (int i = 1; i < punnettsLattice.length; i++) {
			for (int j = 1; j < punnettsLattice[i].length; j++) {
				if (punnettsLattice[i][j].length() == 2) {
					String currentPhenotype = Character.toString(punnettsLattice[i][j].charAt(0));
					if (!phenotypeRatios.containsKey(currentPhenotype)) {
						phenotypeRatios.put(currentPhenotype, 0);
					}
					phenotypeRatios.put(currentPhenotype, phenotypeRatios.get(currentPhenotype) + 1);
				}
				else {
					String currentPhenotype = Character.toString(punnettsLattice[i][j].charAt(0)) + Character.toString(punnettsLattice[i][j].charAt(2));
					if (!phenotypeRatios.containsKey(currentPhenotype)) {
						phenotypeRatios.put(currentPhenotype, 0);
					}
					phenotypeRatios.put(currentPhenotype, phenotypeRatios.get(currentPhenotype) + 1);
				}
			}
		}
		return phenotypeRatios;
	}
}
