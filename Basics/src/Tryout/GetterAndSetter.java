package Tryout;

class Car {
    public int getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private int model;
    private String brand;

}

public class GetterAndSetter {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Honda");
        c1.setModel(2);
        System.out.println(c1.getBrand() + c1.getModel());
    }
}
