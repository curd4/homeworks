
package cars.ans.driver.example;


public class CarsAnsDriverExample {


    public static void main(String[] args) {
        
        driver driver1 = new driver("Владимир Петров", 2017, 2);
        System.out.println(driver1);
        
        car car1= new car(driver1,345435, "BMW", "black");
        System.out.println(car1);
    }
    
}
