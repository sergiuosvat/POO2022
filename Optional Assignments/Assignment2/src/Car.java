public class Car {
    String name;
    Integer yearOfFabrication;
    String colour;
    Double price;

    public Car(String name, Integer yearOfFabrication, String colour, Double price)
    {
        this.name = name;
        this.yearOfFabrication = yearOfFabrication;
        this.colour = colour;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", yearOfFabrication=" + yearOfFabrication +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
