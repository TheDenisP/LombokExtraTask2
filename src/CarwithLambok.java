import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString(exclude = {"quantity"})
@EqualsAndHashCode(exclude = {"model","year", "price", "color", "quantity"})
class CarDemoWithLombok {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;
}


public class CarwithLambok {
    public static void main(String[] args) {

        CarDemoWithLombok CarWithLombok1 = new CarDemoWithLombok("GLE", "Mercedes", 2020, 350_000, "white", 5);
        CarDemoWithLombok CarWithLombok2 = new CarDemoWithLombok("GLC","Mercedes",2023,200_000,"silver", 3);
        System.out.println(CarWithLombok1);
        System.out.println(CarWithLombok2);
        System.out.println(CarWithLombok1.getColor());
        int year = CarWithLombok1.getYear();
        CarWithLombok1.setColor("black");
        System.out.println("Are these objects equal? " + CarWithLombok1.equals(CarWithLombok2));
        System.out.println("The HashCode of this object is: " + CarWithLombok2.hashCode());
        System.out.println("The HashCode of this object is: " + CarWithLombok1.hashCode());
    }
}
