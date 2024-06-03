package HeadFirstJava.chapter4howobjectsbehave.electricguitar;

public class ElectricGuitarTestDrive {
    public static void main(String[] args) {
        ElectricGuitar electricGuitar1 = new ElectricGuitar();
        System.out.println(electricGuitar1.brand);
        electricGuitar1.setBrand("Neel Brand");
        System.out.println(electricGuitar1.brand);

    }
}
