interface Vehicle{
    void start();
    void stop();
      default void fuelUp(){
          System.out.println("Fuel up");
      }

      static void service(){
          System.out.println("service");

      }


}

class car implements Vehicle{



    public void start() {
        System.out.println("samochut start");
    }

    public void stop() {
        System.out.println("samochut stop");
    }
}

class Motor implements Vehicle{


    public void start() {
        System.out.println("motor start");
    }


    public void stop() {
        System.out.println("motor stop");
    }
}



class Application {
    public static void main(String[] args) {

        Vehicle car = new car();
        Vehicle motor = new Motor();
        car.start();
        car.stop();
       car.fuelUp();

        motor.start();
        motor.stop();
        motor.fuelUp();

        }
    }
