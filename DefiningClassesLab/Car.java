package DefiningClassesLab;

public class Car {

    private String brand;
    private String model;
    private int horsepower;

    public Car(String brand, String model, int horsepower) {
        setBrand(brand);
        setModel(model);
        setHorsepower(horsepower);
    }

    public Car(String brand, int horsepower) {
        this(brand, "unknown", horsepower);

    }

    public Car(String brand, String model) {
        this(brand, model, -1);

    }

    public Car(String brand) {
        this(brand, "unknown", -1);
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
    public int getHorsepower() {
        return this.horsepower;
    }

        public String carInfo (){
            return toString();

    }

    @Override // анотация, която дефинира че ще ползвам този формат за всяка кола
    public String toString(){
        return String.format("The car is: %s %s - %d HP.", this.getBrand(), this.getModel(),
                this.getHorsepower());
    }
}
