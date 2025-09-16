import java.util.Scanner;

public class XorCipher {
	
	public static String xorEncryptDecrypt(String text, char key) {
		char[] chars = text.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char) (chars[i] ^ key); // XOR com a chave
		}
		return new String(chars);
	}

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a mensagem secreta: ");
		String message = scanner.nextLine();
		char key = 'K'; // chave simples (poderia ser um número, byte, etc.)
		
		// Cifrar
		String encrypted = xorEncryptDecrypt(message, key);
		System.out.println("Crifrado: " + encrypted);
		
		// Decifrar
		String decrypted = xorEncryptDecrypt(encrypted, key);
		System.out.println("Decifrado: " + decrypted);
		
		scanner.close();
	}
}
