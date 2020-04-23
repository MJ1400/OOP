import java.util.ArrayList;
import java.util.List;

public class ComputerMain {
    public static void main(String[] args) {

    //Laptop
    List<Computer> Laptops = new ArrayList<>();
    Laptop laptop1 = new Laptop();
    laptop1.motherboard = "MSI";
    laptop1.GPU = "Nvidia GTX 970m";
    laptop1.CPU = "i7-8650U";
    laptop1.RAM = "8gb";
    Laptops.add(laptop1);

    //PC
    List<Computer> PCs = new ArrayList<>();
    PC PC1 = new PC();
    PC1.motherboard = "Asus";
    PC1.GPU = "Nvidia RTX 2070";
    PC1.CPU = "i7-9700k";
    PC1.RAM = "16gb";
    PCs.add(PC1);

    laptop1.superTest();


    }

}
