import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class MainClass {

    public static void main(String[] args) throws IOException {
        ArrayList<Fridge> WarehouseEU = new ArrayList<Fridge>();
        ArrayList<Fridge> WarehouseUS = new ArrayList<Fridge>();
        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta millisesse lattu: ");
        String region = input.nextLine();
        System.out.println("Sisesta kylmiku v2rv: ");
        String color = input.nextLine();
        System.out.println("Sisesta kylmiku kaal: ");
        String weight = input.nextLine();

        if(region == "EU" || region == "eu"){
            WarehouseEU.add(new Fridge(color, weight));
        } else if (region == "US" || region == "us") {
            WarehouseUS.add(new Fridge(color, weight));
        } else {
            System.out.println("Sellist regiooni ei eksisteeri!");
            System.out.println(WarehouseEU.toString());
        }



    }
}