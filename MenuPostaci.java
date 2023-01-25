import bronie.*;
import postacie.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPostaci {
    public List<Postac> postacie = new ArrayList<>();

    public Postac wybierzPostacWczytanie() {
        Wyswietlanie.wybierzPostacWypisanie();
        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        System.out.println();
        Postac postac;
        switch (liczba) {
            case 1 -> {
                postac = new Krol();
                System.out.println("Wybrales klase " + postac.getKlasa());
                dodajImie(postac);
                dodajPostac(postac);
                System.out.println("Posiadasz bron: " + postac.getBron().getClass().getName() + "\n");
                return postac;
            }
            case 2 -> {
                postac = new Rycerz();
                System.out.println("Wybrales klase " + postac.getKlasa());
                dodajImie(postac);
                dodajPostac(postac);
                System.out.println("Posiadasz bron: " + postac.getBron().getClass().getName() + "\n");
                return postac;
            }
            case 3 -> {
                postac = new Chlop();
                System.out.println("Wybrales klase " + postac.getKlasa());
                dodajImie(postac);
                dodajPostac(postac);
                System.out.println("Posiadasz bron: " + postac.getBron().getClass().getName() + "\n");
                return postac;
            }
            case 4 -> {
                postac = new Kucharka();
                System.out.println("Wybrales klase " + postac.getKlasa());
                dodajImie(postac);
                dodajPostac(postac);
                System.out.println("Posiadasz bron: " + postac.getBron().getClass().getName() + "\n");
                return postac;
            }
            case 5 -> {
                postac = new Marines();
                System.out.println("Wybrales klase " + postac.getKlasa());
                dodajImie(postac);
                dodajPostac(postac);
                System.out.println("Posiadasz bron: " + postac.getBron().getClass().getName() + "\n");
                return postac;
            }
            case 6 -> {
                postac = new Elf();
                System.out.println("Wybrales klase " + postac.getKlasa());
                dodajImie(postac);
                dodajPostac(postac);
                System.out.println("Posiadasz bron: " + postac.getBron().getClass().getName() + "\n");
                return postac;
            }
            case 7 -> {
                postac = new Smok();
                System.out.println("Wybrales klase " + postac.getKlasa());
                dodajImie(postac);
                dodajPostac(postac);
                System.out.println("Posiadasz bron: " + postac.getBron().getClass().getName() + "\n");
                return postac;
            }
            default -> {
                System.out.println("Nie wybrales zadnej postaci\n");
                return null;
            }
        }
    }

    public void dodajPostac(Postac postac) {
        postacie.add(postac);
    }

    public void dodajImie(Postac postac) {
        System.out.println("Nadaj swojej postaci imie\n");
        Scanner scan = new Scanner(System.in);
        String imie = scan.nextLine();
        System.out.println();
        postac.setImie(imie);
        System.out.println("Nadales imie: " + "\""+imie+"\"" + "\n");
    }

    public void wyswietlPostacie() {
        System.out.println("Twoje postacie:");
        for (int i = 0; i < postacie.size(); i++) {
            Postac postac = postacie.get(i);
            System.out.println(i + 1 + "." + " " + postac.getKlasa() + " " + "\"" + postac.getImie() + "\"" + " z bronia: " + postac.getBron().getClass().getName());
        }
        System.out.println();
    }

    public Postac zmienPostac() {
        System.out.println("Wybierz za pomoca numeru, ktora postacia chcesz zagrac");
        wyswietlPostacie();
        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        System.out.println();
        for (int i = 0; i < postacie.size(); i++) {
            if (liczba - 1 == i) {
                Postac postac = postacie.get(i);
                System.out.println("Wybrales postac: " + postac.getKlasa() + " " + postac.getImie() + "\n");
                return postac;
            }
        }
        System.out.println("Nie wybrales zadnej postaci\n");
        return null;
    }

    public void zmienBron(Postac postac) {
        System.out.println("Twoja postac ma bron: " + postac.getBron().getClass().getName());
        System.out.println("Mozesz zmienic orez za pomoca numeru na bronie:");
        Wyswietlanie.wyswietlBronie();
        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        System.out.println();
        switch (liczba) {
            case 1 -> {
                postac.setBron(new Miecz());
                System.out.println("Wybrales miecz\n");
            }
            case 2 -> {
                postac.setBron(new Widly());
                System.out.println("Wybrales widly\n");
            }
            case 3 -> {
                postac.setBron(new Walek());
                System.out.println("Wybrales walek\n");
            }
            case 4 -> {
                postac.setBron(new Karabin());
                System.out.println("Wybrales karabin\n");
            }
            case 5 -> {
                postac.setBron(new Luk());
                System.out.println("Wybrales luk\n");
            }
            case 6 -> {
                postac.setBron(new StrumienOgnia());
                System.out.println("Wybrales strumien ognia\n");
            }
            default -> System.out.println("Nie wybrales zadnej broni\n");
        }
    }
}
