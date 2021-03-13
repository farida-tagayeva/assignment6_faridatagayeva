package task3;

public class HomeBuilder implements Builder{
  private House house;

    public HouseBuilder1() {
        this.house = new House();
    }

    @Override
    public void buildHouseWalls() {
        house.setWalls("wood walls");
    }

    @Override
    public void buildHouseDoors() {
        house.setDoors("wood doors");
    }

    @Override
    public void buildHouseWindows() {
        house.setWindows("glass windows");
    }

    @Override
    public void buildHouseRoof() {
        house.setRoof("green roof");
    }

    @Override
    public void buildHouseGarage() {
        house.setGarage("big garage");
    }
    public House getHouse(){
        return this.house;
    }
}
