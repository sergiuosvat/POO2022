public class Angajat extends Person{

    int nrClientiServiti;
    Angajat(int id, String name)
    {
        super(id, name);
    }

    public void addToList(Client c, Produs p)
    {
        c.addProd(p);
        nrClientiServiti++;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nrClientiServiti=" + nrClientiServiti +
                '}';
    }
}
