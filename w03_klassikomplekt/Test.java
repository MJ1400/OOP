import java.util.ArrayList;

public class Test {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("Hello");
    list.add("world");
    list.add(String.valueOf(5));
    list.add(10 + "");

  for(String name : list) {
    System.out.println(name);
  }

  for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
  }


  }
}
