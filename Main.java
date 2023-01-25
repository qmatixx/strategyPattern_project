import postacie.Postac;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWitaj! Zacznijmy od stworzenia postaci\n");
        MenuPostaci menuPostaci = new MenuPostaci();
        Postac postac = menuPostaci.wybierzPostacWczytanie();
        Menu menu = new Menu();
        menu.akcjeUzytkownika(postac, menuPostaci);
    }
}
