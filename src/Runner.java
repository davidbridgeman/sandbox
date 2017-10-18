
public class Runner {
	
	public static void main(String[] args) {
		
		int numberBits = 10;
		int bite = 8;
		int nibble = 4;
		int byteAnswer = 0, byteRemainder = 0;
		
		byteAnswer = numberBits / bite;
		byteRemainder = numberBits % 8;
	
		System.out.println("Bits = " + numberBits + " bytes = " + byteAnswer + " remainder = " + byteRemainder);
	
	}
	
}
