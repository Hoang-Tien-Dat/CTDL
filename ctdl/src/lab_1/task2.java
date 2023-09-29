package lab_1;

public class task2 {
	public class MyCaesar {
	    public static final char[] ALPHABET = {
	        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
	        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
	    };
	    private int n; // shift steps (right shift)

	    public MyCaesar(int shiftSteps) {
	        this.n = shiftSteps;
	    }

	    public char encryptChar(char c) {
	        c = Character.toUpperCase(c);
	        int index = findIndex(c);
	        if (index == -1) {
	            return c; // Character not found in the ALPHABET array, return the character as is
	        }
	        int encryptedIndex = (index + n) % 26;
	        return ALPHABET[encryptedIndex];
	    }

	    public String encrypt(String input) {
	        StringBuilder encryptedText = new StringBuilder();
	        for (char c : input.toCharArray()) {
	            encryptedText.append(encryptChar(c));
	        }
	        return encryptedText.toString();
	    }

	    public char decryptChar(char c) {
	        c = Character.toUpperCase(c);
	        int index = findIndex(c);
	        if (index == -1) {
	            return c; // Character not found in the ALPHABET array, return the character as is
	        }
	        int decryptedIndex = (index - n + 26) % 26;
	        return ALPHABET[decryptedIndex];
	    }

	    public String decrypt(String input) {
	        StringBuilder decryptedText = new StringBuilder();
	        for (char c : input.toCharArray()) {
	            decryptedText.append(decryptChar(c));
	        }
	        return decryptedText.toString();
	    }

	    private int findIndex(char c) {
	        for (int i = 0; i < ALPHABET.length; i++) {
	            if (ALPHABET[i] == c) {
	                return i;
	            }
	        }
	        return -1; // Character not found in the ALPHABET array
	    }
	}
}
