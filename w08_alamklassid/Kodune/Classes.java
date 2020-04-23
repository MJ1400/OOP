
abstract class Computer {
abstract void tellType();
abstract void tellCPU();
abstract void tellGPU();
}

class Laptop extends Computer {
    void tellType() {
        System.out.println("Laptop");
    }
    void tellCPU(){
        System.out.println("i5-4690u");
    }
    void tellGPU(){
        System.out.println("Nvidia GTX 970M");
    }
}