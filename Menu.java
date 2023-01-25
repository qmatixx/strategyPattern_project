import postacie.Postac;

import java.util.Scanner;

public class Menu {
    boolean koniec;

    public Menu() {
        this.koniec = false;
    }

    public void akcjeUzytkownika(Postac postac, MenuPostaci menuPostaci) {
        while (!koniec) {
            System.out.println("Co chcesz dalej zrobic? Wybierz za pomoca numerka");
            Wyswietlanie.wyswietlAkcje();
            Scanner scan = new Scanner(System.in);
            int liczba = scan.nextInt();
            System.out.println();
            switch (liczba) {
                case 1 -> postac = menuPostaci.wybierzPostacWczytanie();
                case 2 -> postac = menuPostaci.zmienPostac();
                case 3 -> menuPostaci.zmienBron(postac);
                case 4 -> postac.idz();
                case 5 -> postac.getBron().prezentujBron();
                case 6 -> menuPostaci.dodajImie(postac);
                case 7 -> {
                    this.koniec = true;
                    System.out.println("GAME OVER");
                }
                default -> System.out.println("Sprobuj jeszcze raz");
            }
        }
    }
}
