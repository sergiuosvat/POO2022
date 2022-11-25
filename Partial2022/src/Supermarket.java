import java.util.ArrayList;

public class Supermarket extends SimulareSupermarket{
    ArrayList <Produs> listaProd;
    ArrayList <Angajat> listaAng;
    ArrayList <ClientFidel> listaClientFidel;

    Supermarket()
    {
        listaAng = new ArrayList<>();
        listaProd = new ArrayList<>();
        listaClientFidel = new ArrayList<>();
    }
    public void addList(Produs produs, Angajat angajat, ClientFidel clientFidel)
    {
        listaProd.add(produs);
        listaClientFidel.add(clientFidel);
        listaAng.add(angajat);
    }

}
