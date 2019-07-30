package Dekorator;

import Dekorator.KlasyPostaci.Czarodziej;
import Dekorator.KlasyPostaci.Kaplan;
import Dekorator.KlasyPostaci.Tropiciel;
import Dekorator.KlasyPostaci.Wojownik;
import Dekorator.Plecak.PlecakNike;
import Dekorator.Plecak.PlecakParostatek;


import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę wybrać rodzaj Postaci : ");
        System.out.println("Czarodziej, Kapłan, Tropiciel, Wojownik");

        Czarodziej czarodziej = new Czarodziej();
        Kaplan kaplan = new Kaplan();
        Tropiciel tropiciel = new Tropiciel();
        Wojownik wojownik = new Wojownik();


        String userInput = scanner.nextLine();
        System.out.println("Proszę podać kategorię : ");
        System.out.println("Plecak, Tarcza, Miecz");
        String userInput2 = scanner.nextLine();

        if (userInput2.equalsIgnoreCase("plecak")) {
            System.out.println("Masz do Wyboru dwa Plecaki : ");
            System.out.println("1 = Placak Nike, 2 = Plecak Parostatek");
            String userInput3 = scanner.nextLine();
            if (userInput3.equalsIgnoreCase("1") || userInput3.equalsIgnoreCase("plecak nike") && userInput.equalsIgnoreCase("czarodziej")) {
                PlecakNike plecakNike = new PlecakNike(czarodziej);
                System.out.println(plecakNike.stworzOpis());
                System.out.println(plecakNike.pojemnoscPlecaka());
            } else if (userInput3.equalsIgnoreCase("2") || userInput3.equalsIgnoreCase("plecak parostatek") && userInput.equalsIgnoreCase("czarodziej")) {
                PlecakParostatek plecakParostatek = new PlecakParostatek(czarodziej);
                System.out.println(plecakParostatek.stworzOpis());
                System.out.println(plecakParostatek.pojemnoscPlecaka());
            } else if (userInput3.equalsIgnoreCase("1") || userInput3.equalsIgnoreCase("plecak nike") && userInput.equalsIgnoreCase("kaplan")) {
                PlecakNike plecakNike = new PlecakNike(kaplan);
                System.out.println(plecakNike.stworzOpis());
                System.out.println(plecakNike.pojemnoscPlecaka());
            } else if (userInput3.equalsIgnoreCase("2") || userInput3.equalsIgnoreCase("plecak parostatek") && userInput.equalsIgnoreCase("kaplan")) {
                PlecakParostatek plecakParostatek = new PlecakParostatek(czarodziej);
                System.out.println(plecakParostatek.stworzOpis());
                System.out.println(plecakParostatek.pojemnoscPlecaka());
            } else if (userInput3.equalsIgnoreCase("1") || userInput3.equalsIgnoreCase("plecak nike") && userInput.equalsIgnoreCase("tropiciel")) {
                PlecakNike plecakNike = new PlecakNike(kaplan);
                System.out.println(plecakNike.stworzOpis());
                System.out.println(plecakNike.pojemnoscPlecaka());
            } else if (userInput3.equalsIgnoreCase("2") || userInput3.equalsIgnoreCase("plecak parostatek") && userInput.equalsIgnoreCase("tropiciel")) {
                PlecakParostatek plecakParostatek = new PlecakParostatek(czarodziej);
                System.out.println(plecakParostatek.stworzOpis());
                System.out.println(plecakParostatek.pojemnoscPlecaka());
            } else if (userInput3.equalsIgnoreCase("1") || userInput3.equalsIgnoreCase("plecak nike") && userInput.equalsIgnoreCase("wojownik")) {
                PlecakNike plecakNike = new PlecakNike(kaplan);
                System.out.println(plecakNike.stworzOpis());
                System.out.println(plecakNike.pojemnoscPlecaka());
            } else if (userInput3.equalsIgnoreCase("2") || userInput3.equalsIgnoreCase("plecak parostatek") && userInput.equalsIgnoreCase("wojownik")) {
                PlecakParostatek plecakParostatek = new PlecakParostatek(czarodziej);
                System.out.println(plecakParostatek.stworzOpis());
                System.out.println(plecakParostatek.pojemnoscPlecaka());
            }

        }
    }
}
