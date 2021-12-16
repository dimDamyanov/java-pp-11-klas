package tests;

public class LewisStructure {
	String centralAtom;
	String radical1;
	int numberOfRadical1;
	String radical2;
	String[] radicals;
	int[] electrons;
	int valenceElectrons;
	int centralAtomElectrons;

	LewisStructure() {
	}

	LewisStructure(String centralAtom, String radical1, int numberOfRadical1) {
		this.centralAtom = centralAtom;
		this.radical1 = radical1;
		this.numberOfRadical1 = numberOfRadical1;
		electrons = new int[numberOfRadical1 + 1];

		for (int i = 0; i < electrons.length - 1; i++)
			electrons[i] = 6;
		
		int sum = 0;
		for (int i = 0; i < electrons.length - 1; i++)
			sum += electrons[i];

		if (numberOfRadical1 == 1) {
			radicals = new String[3];
			radicals[0] = radical1;
			radicals[1] = "-";
			radicals[2] = centralAtom;
			valenceElectrons = PeriodicTable.getValenceElectrons(radical1)+PeriodicTable.getValenceElectrons(centralAtom);
			electrons[electrons.length - 1] = valenceElectrons - sum - 2;
		} else if (numberOfRadical1 == 2) {
			radicals = new String[5];
			radicals[0] = radical1;
			radicals[1] = "-";
			radicals[2] = centralAtom;
			radicals[3] = "-";
			radicals[4] = radical1;
			valenceElectrons = 2*PeriodicTable.getValenceElectrons(radical1)+PeriodicTable.getValenceElectrons(centralAtom);
			electrons[electrons.length - 1] = valenceElectrons - sum - 4;
		}
	}

	LewisStructure(String centralAtom, String radical1, String radical2) {
		this.centralAtom = centralAtom;
		this.radical1 = radical1;
		this.radical2 = radical2;
		electrons = new int[3];
		for (int i = 0; i < electrons.length - 1; i++)
			electrons[i] = 6;

		radicals = new String[5];
		radicals[0] = radical1;
		radicals[1] = "-";
		radicals[2] = centralAtom;
		radicals[3] = "-";
		radicals[4] = radical2;
		int sum = 0;
		for (int i = 0; i < electrons.length - 1; i++)
			sum += electrons[i];
		valenceElectrons=PeriodicTable.getValenceElectrons(radical1)+PeriodicTable.getValenceElectrons(radical2)+PeriodicTable.getValenceElectrons(centralAtom);
		electrons[electrons.length - 1] = valenceElectrons - sum - 4;
	}

	int positionOfCentralAtom() {
		for (int i = 0; i < radicals.length; i++) {
			if (centralAtom.equals(radicals[i]))
				return i;
		}
		return 0;
	}

	int getPositionRadicals(String element1, int number) {
		if(number-1>0) {
			for (int i=2; i < radicals.length; i+=2) {
				if (element1.equals(radicals[i])) return i;
			}
		}
		else {
			for(int i=0; i< radicals.length; i+=2) {
				if(element1.equals(radicals[i])) 
					return i;
			}
		}
		
		return 0;
	}

	int getPositionElectrons(String element1, int number) {
		if (getPositionRadicals(element1, number) == positionOfCentralAtom())
			return (electrons.length - 1);
		else if (getPositionRadicals(element1, number) == 0)
			return 0;
		else
			return 1;
	}

	int nextBond(String element1, int number) {
		int count=0;
		if (radicals[getPositionRadicals(element1, number) + 1].equals("-"))
			count++;
		else if (radicals[getPositionRadicals(element1, number) + 1].equals("="))
			count += 2;
		else
			count += 3;
		return count;
	}
	
	int previousBond(String element1, int number) {
		int count=0;
		if (radicals[getPositionRadicals(element1, number) - 1].equals("-"))
			count++;
		else if (radicals[getPositionRadicals(element1, number) - 1].equals("="))
			count += 2;
		else
			count += 3;
		return count;
	}
	
	int countBonds(String element1, int number) {
		if (getPositionRadicals(element1, number) == 0) 
			return nextBond(element1, number);
		else if (getPositionRadicals(element1, number) == (radicals.length-1))
			return previousBond(element1, number);
		else 
			return nextBond(element1, number) + previousBond(element1, number);
	}

	int getFormalCharge(String element1, int number) {
		return PeriodicTable.getValenceElectrons(element1) - getDiff(number);
	}
	int getDiff(int number) {
		int n = 0;
		if (number != 0) {
			if (radicals[number - 1] == "-") {
				n++;
			}
			else if (radicals[number - 1] == "=") {
				n+=2;
			}
		}
	if (number !=4)
			if (radicals[number + 1] == "-") {
				n++;
			}
			else if (radicals[number + 1] == "=") {
				n+=2;
			}
		return n;
	}
	
	void setBonds() {
		//String firstBond;
		//String secondBond;
		
		int max=electrons[0];
		int position=0;
		//System.out.print(radicals.toString());
		for(int i=0; i<electrons.length; i++) {
			if(max<electrons[i]) {
				max=electrons[i];
				position=i;
			}
		}
		System.out.println("Maxe: " + position);
		System.out.println(chargeDifference());
		radicals[1]="=";
		System.out.println(chargeDifference());
		System.out.println(radicals[0] + getFormalCharge(radicals[0], 1));
		System.out.println(radicals[2] + getFormalCharge(radicals[2], 1));
		System.out.println(radicals[4] + getFormalCharge(radicals[4], 1));
//		while(chargeDifference()!=0) {
//			if(position==0) 
//				radicals[1]="=";
//			else
//				radicals[3]="=";
//			electrons[position] -= 2;
//		}
		
		for(int i=0; i<radicals.length; i++)
			System.out.print(radicals[i]);
	}
	
	int chargeDifference() {
		int delta1=0, delta2=0, delta3=0;
		//int k=2;
		//int[] chargeDifference = new int[100];
		delta1=Math.abs(Math.abs(getFormalCharge(radicals[0], 0)) - Math.abs(getFormalCharge(radicals[0], 0)));
		//chargeDifference[0]=delta1;
		delta2=Math.abs(Math.abs(getFormalCharge(radicals[2], 2)) - Math.abs(getFormalCharge(radicals[4], 4)));
			//chargeDifference[1]=delta2;
		delta3=Math.abs(Math.abs(getFormalCharge(radicals[0], 0)) - Math.abs(getFormalCharge(radicals[4], 4)));
			//chargeDifference[2]=delta3;
		return delta1+delta2+delta3;		
		
	
		
	}
	
	
}
