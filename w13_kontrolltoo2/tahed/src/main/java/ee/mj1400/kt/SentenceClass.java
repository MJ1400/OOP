package ee.mj1400.kt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sentence {
    Scanner scanner = new Scanner(System.in);
    String sentence;
    String[] sentenceArray;
    int wordcount;
    List<Word> wordObjList = new ArrayList<Word>();
    int sentenceCharCount = 0;
    
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

    public List<Word> getWordObjList() {
        for(String w : sentenceArray){
            wordObjList.add(new Word(w)); }
    
        return wordObjList;
    }

    public void getSentenceCharCount() {
        for (Word obj : wordObjList) {
            int count += obj.charCount('a').get('a');
             
            
        }
    }
    
    
}