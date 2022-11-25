public class ClientFidel extends Client{
    int points;

    ClientFidel(int id, String name, Angajat ang)
    {
        super(id, name);
        this.points = 0;
    }

    private void sum()
    {
        sum = 0;
        for (Produs value : listaProd) {
            sum = sum + value.pret;
        }
        sum = sum - (0.5*points*sum/100);
    }

    @Override
    public String toString() {
        return "ClientFidel{" +
                "points=" + points + "suma: " + sum +
                '}';
    }
}
