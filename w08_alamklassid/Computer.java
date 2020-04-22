class Computer {
    String motherboard;
    String GPU;
    String CPU;
    String RAM;
    public void Test() {
        System.out.println("Computer upperclass print");
    }
}

class Laptop extends Computer {
    protected String type = "Laptop";
    public void Test() {
        System.out.println("Laptop subclass print");
    }

}

class PC extends Computer {
    protected String type = "PC";

}