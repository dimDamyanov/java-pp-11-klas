package unit03;

public class Casting01 {
	public static void main(String[] args) {
		
		//Declare and initialise a short with a value of 128
		short a = 128;
        //Create a print statement that casts this short to a byte
		System.out.println((byte) a);
        
        
        //Declare and initialise a byte with a value of 127
		byte b = 127;
        //Add 1 to this variable and print it
		b += 1;
		System.out.println(b);
        //Add 1 to this variable again and print it again
		b += 1;
		System.out.println(b);
	}
}
