package task3;

public class Director {
   private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public House getHouse(){
        return this.builder.getHouse();
    }
    public void houseBuild(){
        this.builder.buildHouseDoors();
        this.builder.buildHouseWalls();
        this.builder.buildHouseWindows();
        this.builder.buildHouseRoof();
        this.builder.buildHouseGarage();
    }
}
