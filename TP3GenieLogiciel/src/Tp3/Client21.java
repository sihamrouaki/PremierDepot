package Tp3;

public class Client21 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez entrer un numéro de programme (1, 2 ou 3).");
            return;
        }

        int type = Integer.parseInt(args[0]);

        // Le client ne connaît pas les classes concrètes
        IProgram program = ProgramFactory.createProgram(type);

        System.out.println("Lancement du programme " + type);
        program.go();
    }
}
