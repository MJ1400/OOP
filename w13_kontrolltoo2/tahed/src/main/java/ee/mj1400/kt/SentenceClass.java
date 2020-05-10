package ee.mj1400.kt;

import java.util.Scanner;

class Sentence {
    Scanner scanner = new Scanner(System.in);
    String sentence;
    String[] sentenceArray;
    int wordcount;
    
    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public int wordCount() {
        sentenceArray = sentence.split("\\s+");
        for(String w : sentenceArray){
            wordcount++;
        }
        System.out.println("Lauses oli " + Integer.toString(wordcount) + " sõna");
        return wordcount;
    }
}