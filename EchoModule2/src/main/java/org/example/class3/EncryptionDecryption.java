package org.example.class3;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class EncryptionDecryption {
    private static int EncryptionKey = 12;
    private static Map<Character, Character> encryptedText = new TreeMap<>();
    private static Map<Character, Character> decryptedText = new TreeMap<>();

    public static String encrypton(String messageToEncode) {

        for (int i = 0; i < messageToEncode.length(); i++) {
            encryptedText.put(messageToEncode.charAt(i), (char) (messageToEncode.charAt(i) + EncryptionKey));
            decryptedText.put((char) (messageToEncode.charAt(i) + EncryptionKey), messageToEncode.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < messageToEncode.length(); j++) {
            sb.append(encryptedText.get(messageToEncode.charAt(j)));
        }

        String encryptedMessage = sb.toString();
        return encryptedMessage;
    }

    public static String decryption(String messageToDecode) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < messageToDecode.length(); i++) {
            sb.append(decryptedText.get(messageToDecode.charAt(i)));
        }

        String decryptedMessage = sb.toString();
        return decryptedMessage;
    }

    // this method need to correctly coded in order to fix the descryption issue
    public static int bruteForceKeyDecoding(String messageToDecode, String message) {

        StringBuilder sb = new StringBuilder();


        int realKey = 0;
        //this loop is not corrrect as it can infinitly
        while(messageToDecode != message) { // this is not correct code
            int randomKey = generateNewKey();
            for(int i = 0; i < message.length(); i++) {
                encryptedText.put((char) EncryptionKey, (char) (encryptedText.get(EncryptionKey)-randomKey));
                sb.append(encryptedText.get(EncryptionKey)); // this is not correct code
            }
            messageToDecode = sb.toString();
            realKey = randomKey;
        }
        return realKey;
    }

    public static int generateNewKey() {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(30);
        return rand_int1;

    }
}
/*
    Comparison of Strings:
     In your bruteForceKeyDecoding method, you're comparing two strings using the != operator.
      This is not the correct way to compare strings in Java. You should use the .equals() method to compare the contents of the strings.

        Infinite Loop: Your while loop doesn't have a condition to exit when the key is found.
         It keeps looping indefinitely. You need to add a condition to break out of the loop when the decrypted message matches the original message.

        Message Rebuilding: When decrypting with different keys, you should reset the sb StringBuilder to an empty state before rebuilding the decrypted message. Otherwise, it will keep appending to the existing decrypted text.

        Here's a corrected version of the bruteForceKeyDecoding method:



public static int bruteForceKeyDecoding(String messageToDecode, String message) {
        StringBuilder sb = new StringBuilder();
        int realKey = -1;  // Initialize realKey to an invalid value.

        while (!messageToDecode.equals(message)) {
        int randomKey = generateNewKey();

        // Clear the StringBuilder before building the decrypted message.
        sb.setLength(0);

        for (int i = 0; i < message.length(); i++) {
        char encryptedChar = messageToDecode.charAt(i);
        char decryptedChar = (char) (encryptedChar - randomKey);
        sb.append(decryptedChar);
        }

        messageToDecode = sb.toString();
        realKey = randomKey;
        }
        return realKey;
        }
*/


