class Computer {
    String motherboard;
    String GPU;
    String CPU;
    String RAM;
    String type = "Computer";
}

class Laptop extends Computer {
    String type = "Laptop";
    void superTest() {
        System.out.println("This is subclass' type: " + type);
        System.out.println("This is upperclass' type: " + super.type);
    }
}

class PC extends Computer {

}

class PCmain {

}