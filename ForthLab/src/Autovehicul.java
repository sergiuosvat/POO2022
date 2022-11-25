import java.awt.*;

public class Autovehicul {
    private static String marca;
    private static Color culoare;
    private static int currentSpeed;
    private static int maxSpeed;
    private static int maxGears;
    private static boolean state;

    private static int currentGear;

    public void setMarca(String marca)
    {
        Autovehicul.marca = marca;
    }
    public void setColor(Color culoare)
    {
        Autovehicul.culoare = culoare;
    }
    public void setCurrentSpeed(int speed)
    {
        Autovehicul.currentSpeed = speed;
    }
    public void setMaxSpeed(int speed)
    {
        Autovehicul.maxSpeed = speed;
    }
    public void setMaxGears(int gears)
    {
        Autovehicul.maxGears = gears;
    }
    public void accelerate(int speed)
    {
        Autovehicul.currentSpeed += speed;
    }
    public void decelerate(int speed)
    {
        Autovehicul.currentSpeed -= speed;
    }
    public void changeGear(int gear)
    {
        Autovehicul.currentGear = gear;
    }

    @Override
    public String toString() {
        return "Stare curenta" + state;
    }

    public Autovehicul()
    {
        this.setMarca("opel");
        this.setColor(Color.PINK);
        this.setCurrentSpeed(50);
        this.setMaxGears(6);
        this.setMaxSpeed(300);
    }


}
