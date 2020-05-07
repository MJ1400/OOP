package ee.mj1400.kt;

import java.util.HashMap;
import java.util.Scanner;


class CountCharsClass implements Liides1 {
    public HashMap<Character, Integer> charCount(String word){
            HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
            char[] charArray = word.toCharArray();

            for (char c : charArray) {
                if(charMap.containsKey(c)) {
                    charMap.put(c, charMap.get(c)+1);
            } else {
                charMap.put(c, 1);
            }
        }   
            System.out.println("Tähtede arvud sõnas: " + word);
            charMap.forEach((k,v) -> { 
            System.out.println(k +  ": " + v); });
            return charMap;
        }
        
    }

class Main {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        CountCharsClass countchars = new CountCharsClass();

        System.out.println("Sisesta sõna: ");
        String word = scanner.nextLine().toLowerCase();
        countchars.charCount(word);
        scanner.close();

    }  
}

