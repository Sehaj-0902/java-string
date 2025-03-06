// Program to demonstrate NullPointerException

public class GenerateNullPointerException {
    	// generateException() method to generate NullPointerException
    	public static void generateException() {
        	String text = null;
        	int length = text.length(); 
        	System.out.println("The length of text is: " + length); 
    	}

    	// handleException() method to demonstrate and handle NullPointerException
    	public static void handleException() {
        	String text = null;
        	try {
            		int length = text.length();
            		System.out.println("The length of text is: " + length);
        	}
		catch (NullPointerException e) {
            		System.out.println("NullPointerException caught: " + e.getMessage());
        	}
    	}

    	public static void main(String[] args) {
        	generateException();
        	handleException();
    	}
}
