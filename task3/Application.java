package task3;

public class Application {
  public static void main(String[] args) {
        Builder builder = new Builder();
        Director directr = new Director(Builder);
        director.Builder();
        House house = director.getHouse();
        System.out.println(house);
      
       
    }
}
