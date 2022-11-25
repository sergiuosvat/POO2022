import java.util.ArrayList;

public class Client extends Person{
    public int nr;
    public Angajat ang;
    public double sum = 0;
    ArrayList <Produs> list = new ArrayList<>();

    Client(int id, String name)
    {
        super(id, name);
        this.nr = 0;
    }

    public void addProd(Produs produs)
    {
        list.add(produs);
        nr = list.size();
    }

    private void sum()
    {
        for (Produs value : listaProd) {
            sum = value.pret + sum;
        }
        sum = sum - (0.5*sum)/100;
    }

    public double getSum()
    {
        return sum;
    }

}
