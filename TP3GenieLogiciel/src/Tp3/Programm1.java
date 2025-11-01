package Tp3;

public class Programm1 implements IProgram {
    @Override
    public void go() {
        System.out.println("Exécution du Program1");
    }
}

class Programm2 implements IProgram {
    @Override
    public void go() {
        System.out.println("Exécution du Program2");
    }
}
class Programm3 implements IProgram {
    @Override
    public void go() {
        System.out.println("Exécution du Program3");
    }
}
