
package cars.ans.driver.example;


public class car {



    public car(driver driver, int number, String company, String colour)
    {this.driver = driver;
    this.number = number;
    this.company = company;
    this.colour = colour;
    }
        
    
        @Override
    public String toString() {
        return "car{" + "driver=" + driver + ", number=" + number + ", company=" + company + ", colour=" + colour + '}';
    }

    
    public int getNumber() {
        return number;
    }

    public String getCompany() {
        return company;
    }

    public String getColour() {
        return colour;
    }
    

    public driver getDriver() {
        return driver;
    }

    public void setDriver(driver driver) {
        this.driver = driver;
    }



    
    driver driver;
    private int number;
    private String company;
    private String colour;
    
}
