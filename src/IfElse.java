import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
         /*
        Flow control - if else
                     - evalueaza conditii si bifurca codul in functie de rezultat
         */


        System.out.println("pornim radio");
        boolean piesa_faina = true; // invat calculatorul daca piesa e faina sau nu
        // daca piesa e frumoasa, dau mai tare
        if(piesa_faina == true);{
            System.out.println("dau mai tare");
            System.out.println("incep sa o fredonez");
        }

        System.out.println("inchidem radio");

        // if else
        int nr = 4;
        if(nr % 2 == 0 ) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        // este un nr pozitiv?
        if(nr > 0 ) {
            System.out.println("pozitiv");
        } else {
            System.out.println("nr nu este pozitiv");
        }

        // if, else if, else
        // luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu ora");
        int ora  = sc.nextInt();
        if(ora < 0) {
            System.out.println("ora invalida");
        } else if (ora <= 11) {
                System.out.println("neata");
        } else if (ora <= 18) {
            System.out.println("ziua buna");
        } else if (ora <= 21) {
            System.out.println("buna seara");
        } else if (ora <= 24) {
            System.out.println("noapte buna");
        } else {
            System.out.println("ora invalida");
        }

        // Flow control
        // switch - se foloseste cand stim valorile posibile
        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("eng");
                break;
            default:
                System.out.println("optiune invalida");
        }

        // un cd cu 5 piese cu switch
        System.out.println("alege track");
        int track = sc.nextInt();
        switch (track)  {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("track 1");
                break;
            case 2:
                System.out.println("track 2");
                break;
            case 3:
                System.out.println("track 3");
                break;
            case 4:
                System.out.println("track 4");
                break;
            case 5:
                System.out.println("track 5");
                break;
            default:
                System.out.println("optiune invalida");

        }

        // <0 viteza invalida, 0 stationeaza, <= 50 localitate, <= 90 drum judetean, autostrada
        System.out.println("Introdu km");
        int km = sc.nextInt();
        if (km < 0 ) {
            System.out.println("viteza invalida");
        } else if (km == 0) {
            System.out.println("stationeaza");
        }else if (km <= 50) {
            System.out.println("localitate");
        } else if (km <= 90) {
            System.out.println("judetean");
        } else {
            System.out.println("autostrada");
        }



    } // inchide functia main
} // inchide clasa
