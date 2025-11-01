package Tp3;

public class ProgramFactory {

    public static IProgram createProgram(int type) {
        switch (type) {
            case 1:
                return new Programm1();
            case 2:
                return new Programm2();
            case 3:
                return new Programm3();
            default:
                throw new IllegalArgumentException("Type de programme invalide : " + type);
        }
    }
}
