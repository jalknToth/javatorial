package classOnes;

public class Vehicle {
    //ATTRIBUTES
    public String plate;
    public String color;
    public int model;
    public String chassis;
    public String capacity;
    public String type;
    public String brand;
    public double weight;

    //CONSTRUCTOR
    public Vehicle() {

    }//GETTERS
    public String getPlate() {
        return plate;
    }
    public String getColor() {
        return color;
    }
    public int getModel() {
        return model;
    }
    public String getChassis() {
        return chassis;
    }
    public String getCapacity() {
        return capacity;
    }
    public String getType() {
        return type;
    }
    public String getBrand() {
        return brand;
    }
    public double getWeight() {
        return weight;
    }

    //SETTERS
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // (plate,color,model) WITHOUT RETURN
    public void validatePCM() {
        System.out.println(this.plate + " was made in "
                + this.model + " and it's " + this.color.toLowerCase());
    }// How old is the car? WITHOUT RETURN
    public void validateTimeUsage(int currentAge) {
        int usageTime = currentAge - this.model;
        System.out.println(this.plate + " is " + usageTime + " old");
    }// Kms per year /WITH RETURN
    public double validateKs(double kilometers, double currentYear) {
        double average = kilometers / (currentYear - this.model);
        return average;
    }
}
