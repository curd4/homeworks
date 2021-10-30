
package cars.ans.driver.example;


public class driver {

    public driver(String name, int license, int cars) {
        this.name = name;
        this.license = license;
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "driver{" + "name=" + name + ", license=" + license + ", cars=" + cars + '}';
    }

    public String getName() {
        return name;
    }

    public int getLicense() {
        return license;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }



    private String name;
    private int license;
    private int cars;
    
    
}
