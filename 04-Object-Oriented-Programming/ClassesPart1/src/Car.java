public class Car {
    // State (Attribute)
    // private String make;
    // private String model;
    // private String color;
    // private int doors;
    // private boolean convertible;

    // // Behavior (method)
    // public void descripbeCar() {
    // System.out.println(doors + "-Doors" + " " + color + " " + make + " " + make +
    // " " + model
    // + (convertible ? "Convertible" : ""));
    // }

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    // Behavior (method)
    public void descripbeCar() {
        System.out.println(
                doors + "-Doors" + " " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }

    // getter method
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // setter method
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

}
