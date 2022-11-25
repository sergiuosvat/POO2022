public class Main {
    public static void main(String[] args)
    {
        Complex z1 = new Complex(1,2);
        Complex z2 = new Complex(5,6);
        z1 = new Complex().addNumbers(z1,z2);
        System.out.println(z1);

        Matrice ionut = new Matrice(2,2);
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++) {
                ionut.m[i][j] = new Complex( (int)(Math.random() * 100000),  (int)(Math.random() * 100000));
                System.out.println(ionut.m[i][j]);
            }
            System.out.println();
        }
    }



}
