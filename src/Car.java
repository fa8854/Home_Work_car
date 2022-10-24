public class Car {
    String barnd;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String barnd,String model,String color, String country, double engineVolume, int year){
        this.barnd = barnd;
        this.model = model;
        this.color= color;
        this.country = country;
        this.engineVolume = engineVolume;
        this.year = year;
    }
       public String getBarnd() {
        return barnd;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return barnd + " " + model + ", " + year + " год выпуска, сборка в " + country + " ," + color + "  цвета, объем двигателя — " + engineVolume + " л.";
    }
}
