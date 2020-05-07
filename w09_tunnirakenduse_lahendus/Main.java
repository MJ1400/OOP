import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        int test2[] = new int[2];
        List<String> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        try{
            int test1 = 14/0;
            
        }
        catch(Exception e1) {
            System.out.println("Error!");
            logger.warning(e1.getMessage());
        }
        try{
            int var = test2[3];
        }
        catch(Exception e2) {
            System.out.println("Error!");
            logger.warning(e2.getMessage());
            
        }

        listA.add("TEST1");
        listA.add("TEST2");
        listA.add("TEST3");
        listA.add("TEST4");

        listB.add(1);
        listB.add(2);
        listB.add(3);
        listB.add(4);
        listB.add(5);

        for(String s : listA) {
            System.out.println(s);
        }

        for(int i : listB) {
            System.out.println(i);
        }
        System.out.println("---------------------------------------");
        listB.stream().filter(i -> i > 2).forEach(System.out::println);
        System.out.println("---------------------------------------");
        List<String> lowercases = listA.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowercases);


        
    }
}

    // public static void LogError(Exception e) throws IOException {
            
            
	// 		// FileWriter fw = new FileWriter("log.txt", true);
    //         fw.write(e.toString());
    //         fw.write(System.getProperty("line.separator"));
	// 		fw.close();
    //     }
        
    // }
