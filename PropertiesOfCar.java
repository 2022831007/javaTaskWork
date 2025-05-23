class PropertiesOfCar{
    String owner;
    String brand;
    int fuel;
    boolean isRunning = false;
    PropertiesOfCar(String owner, String brand){
        this.owner = owner;
        this.brand = brand;
        this.fuel = 200;
        this.isRunning = false;
    }
    void display(){
        System.out.println(owner+" have the car of brand "+brand);
    }

    public void start(){
        if(isRunning){
            System.out.println("car is  Running");
        }
        else{
            if(this.fuel <= 0){
                System.out.println("there is no sufficient Fuel");
            }
            else {
                isRunning = true;
                this.fuel -= 70;
                System.out.println("Car started");
            }
        }
    }
    public void stop(){
        if(!isRunning){
            System.out.println("Car is now stop");
        }
        else{
            isRunning = false;
        }
    }
    public void fuelLevel(){
        System.out.println(this.fuel);
    }
}
class Main {
    public static void main(String[] args) {
        PropertiesOfCar car1 = new PropertiesOfCar("Fatema", "BMW");
        car1.start();
        car1.stop();
        car1.start();
        car1.fuelLevel();
        car1.display();
    }
}
