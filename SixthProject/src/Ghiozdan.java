import java.util.Arrays;

public class Ghiozdan {

    private Rechizita[] lista;
    int poz;

    public Ghiozdan(int n)
    {
        lista = new Rechizita[n];
        poz = 0;
    }
    public void add(Caiet c)
    {
        lista[poz] = c;
        poz++;
    }
    public void add(Manual m)
    {
        lista[poz] = m;
        poz++;
    }

    @Override
    public String toString() {
        for (int i = 0; i < lista.length; i++) {
            return lista(i);
        }
        return null;
    }
}
