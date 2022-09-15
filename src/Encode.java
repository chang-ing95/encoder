
public class Encode {
	
	static String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";
	
		
	
	public static void encode (String message, String code) {
		
		StringBuilder encodedMessage = new StringBuilder() ;
		
		message = message.toUpperCase();
		char offsetChar = message.charAt(0);
		char[] codeArray = code.toCharArray();
		StringBuilder newCode = new StringBuilder();
		
		if (code.indexOf(offsetChar) == -1){
			System.out.println(message);
		}else {
			for (char c : codeArray) {
				int j = code.indexOf(c) - code.indexOf(offsetChar);
				if (j < 0) {
					j += 44;
				}
				c = code.charAt(j);
				newCode.append(c);
			}
			
		for (int i = 1; i < message.length(); i++) {
			char charReplaced = message.charAt(i); 
		
			int indexRequired = code.indexOf(charReplaced); 
			
			if (message.charAt(i) == ' ') {
				encodedMessage.append(' ');
			} else {
				char newLetter = newCode.charAt(indexRequired);
				encodedMessage.append(newLetter);
			}			
		}
		System.out.println(encodedMessage);
	}
};
	
	public static void decode (String message, String code) {
		
		StringBuilder decodedMessage = new StringBuilder() ;
		
		message = message.toUpperCase();
		char offsetChar = message.charAt(0);
		char[] codeArray = code.toCharArray();
		StringBuilder newCode = new StringBuilder();
		
		if (code.indexOf(offsetChar) == -1){
			System.out.println(message);
		}else {
			for (char c : codeArray) {
				int j = code.indexOf(c) - code.indexOf(offsetChar);
				if (j < 0) {
					j += 44;
				}
				c = code.charAt(j);
				newCode.append(c);
				
			}
		}
			
		String newCodeToStr = newCode.toString();
		
		for (int i = 1; i < message.length(); i++) {
			char charReplaced = message.charAt(i); 
			
			int indexRequired = newCodeToStr.indexOf(charReplaced);
			
			if (message.charAt(i) == ' ') {
				decodedMessage.append(' ');
			} else {
				char newLetter = code.charAt(indexRequired);
				decodedMessage.append(newLetter);
			}			
		
		}

		System.out.println(decodedMessage);	
	
		};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message1 = "BHELLO WORLD";
		String message2 = "BGDKKN VNQKC";
		String message3 = "fHELLO WORLD";
		String message4 = "Fc/GGJ RJMG.";
		
		encode(message1, code);
		decode(message2, code);
		encode(message3, code);
		decode(message4, code);
	}

}
