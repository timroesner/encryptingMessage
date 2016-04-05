/**
 * Tim Roesner
 * Version 0.9
 */

import java.util.*;
import java.math.*;

public class encryptString {
    public static void main(String[]args){
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        String encryptedMessage = "";
        String key = "";
        
        System.out.print("Enter message to encrypt here: ");
        String phrase = in.nextLine();
        
        for(int i=0;i<phrase.length();i++)
        {
            int random = 1 + gen.nextInt(26);
            key = key + String.format("%02d", random) + " ";
            char character = phrase.charAt(i);
            int ascii = (int) character;
            int newCharacter = 0;
            
            if((ascii+random)>90 && (ascii+random)<97 || (ascii+random)>122)
            {
                newCharacter = ascii-random;
            }
            
            else
            {
                newCharacter = ascii+random;
            }
            
            encryptedMessage = encryptedMessage + (char) newCharacter;
        }
        
        System.out.println(encryptedMessage);
        
    }
    
}