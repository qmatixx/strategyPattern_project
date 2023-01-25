package postacie;

import bronie.Bron;

public abstract class Postac {
    protected String imie;
    protected Bron bron;
    protected String klasa;
    protected int pancerz;

    public int getPancerz() {
        return pancerz;
    }

    public void setPancerz(int pancerz) {
        this.pancerz = pancerz;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Bron getBron() {
        return bron;
    }

    public void setBron(Bron bron) {
        this.bron = bron;
    }

    public String getKlasa() {
        return klasa;
    }

    public void idz() {
        System.out.println("*Idziesz do przodu*\n");
    }
}
