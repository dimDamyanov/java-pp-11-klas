package tests;

public class PeriodicTable {
		
		static String element;
		
		/*PeriodicTable() {
		}

		PeriodicTable( String element ) {
			this.element = element;
		}*/
		//static?
		static String[][] PTable = {{"H", "Li","Na","K","Rb","Cs","Fr",}, 
							 {"", "Be","Mg","Ca","Sr","Ba","Ra","He"},
							 {"", "B","Al","Ga","In","Tl","Nh",},
							 {"", "C","Si","Ge","Sn","Pb","Fl",}, 
							 {"", "N","P","As","Sb","Bi","Mc",}, 
							 {"", "O","S","Se","Te","Po","Lv",},
							 {"", "F","Cl","Br","I","At","Ts",},
							 { "Ne","Ar","Kr","Xe","Rn","Og",}};
	  
		public static int getValenceElectrons ( String element ) {
		   for (int i = 0; i < PTable.length; i++) {
			   for (int j = 0; j < PTable[i].length; j++) {
				   if (element.equals(PTable[i][j]))
					   return i+1;
			   }
		   }
		   
		   return 0;
	   }
}
