package questions;

public class Replace {

	public static void main(String[] args) {
		String originalString = "Hello world";
        
        String newString = originalString.replace('H', 'i');    //HellO wOrld !!
         
        System.out.println("Original string"+originalString);
        System.out.println("Replaced string"+newString);
	}

}
