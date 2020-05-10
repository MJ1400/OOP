package ee.mj1400.kt;

import java.util.Scanner;

public class Main {
    static int option;
    static String word;
    static char t2ht;
    static String sentence;
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Sõna | 2 - Lause ");
        option = Integer.parseInt(scanner.nextLine());

        if(option == 1){
        System.out.println("Sisesta sõna: ");
        word = scanner.nextLine().toLowerCase();
        System.out.println("Sisesta täht, mille esinemise arvu soovid teada: ");
        t2ht = scanner.nextLine().toLowerCase().charAt(0);
        
        Word wordobj = new Word(word);
        wordobj.charCount(t2ht);
        
        } else if(option == 2) {
        System.out.println("Sisesta lause: ");
        sentence = scanner.nextLine().toLowerCase();

        Sentence sentenceobj = new Sentence(sentence);
        sentenceobj.wordCount();


        } else {
            System.out.println("Palun sisestage kas 1 või 2!");
        }
        // Word wordobj = new Word();
        // SentenceClass sentenceobj = new SentenceClass("Vanamees vanamees viiskend kuus");
        // System.out.println(sentenceobj.wordCount());

        scanner.close();
        
    }

    
}