public class Produs extends Supermarket{
    public String nume;
    public int pret;
    public int numarExemplare;
    public Boolean exists;

    Produs(String nume, int pret, int numarExemplare)
    {
        this.nume = nume;
        this.pret = pret;
        this.numarExemplare = numarExemplare;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", numarExemplare=" + numarExemplare +
                ", exists=" + exists +
                '}';
    }

}
