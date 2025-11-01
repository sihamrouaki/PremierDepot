package Tp3;

/*public class Client {

    public static void main1() {
        Program1 p = new Program1();
        System.out.println("Je suis le main1");
        p.go();
    }

    public static void main2() {
    	Program1 p = new Program1();
        System.out.println("Je suis le main2");
        p.go();
    }

    public static void main3() {
    	Program1 p = new Program1();
        System.out.println("Je suis le main3");
        p.go();
    }

    public static void main(String[] args) {
        int choix = Integer.parseInt(args[0]);

        switch (choix) {
            case 1 -> main1();
            case 2 -> main2();
            case 3 -> main3();
            default -> System.out.println("Choix invalide !");
        }
    }
}*/

public class Client {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez entrer un numéro de programme (1, 2 ou 3).");
            return;
        }

        int choix = Integer.parseInt(args[0]);

        if (choix == 1) {
            Program1 p1 = new Program1();
            p1.go();
        } 
        else if (choix == 2) {
            Program2 p2 = new Program2();
            p2.go();
        } 
        else if (choix == 3) {
            Program3 p3 = new Program3();
            p3.go();
        } 
        else {
            System.out.println("Choix invalide ! Veuillez entrer 1, 2 ou 3.");
        }
    }
}

