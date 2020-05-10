package ee.mj1400.kt;

import java.util.HashMap;

class Word implements WordInterface {
    private final String word;
    

    public Word(String word) {
        
        this.word = word;
    }

    public int charCount(Character t2ht) {
        int charactercount = 0;
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] charArray = word.toCharArray();

        for (char c : charArray) {
            if (c == t2ht) {
                if (charMap.containsKey(c)) {
                    charMap.put(c, charMap.get(c) + 1);
                } else {
                    charMap.put(c, 1);
                }
               charactercount = charMap.get(c);
            }
        }
       
        //charMap.forEach((k, v) -> {
            //System.out.println(k + ": " + v);
            return charactercount;
        }
        

    public String toString(){
        return word;
    }

}
