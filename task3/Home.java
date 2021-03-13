package task3;

public class Home {
   private String houseWalls;
    private String houseDoors;
    private String houseWindows;
    private String houseRoof;
    private String houseGarage;

    @Override
    public void setWalls(String walls) {
        houseWalls = walls;
    }

    @Override
    public void setDoors(String doors) {
        houseDoors = doors;
    }

    @Override
    public void setWindows(String windows) {
        houseWindows = windows;
    }

    @Override
    public void setRoof(String roof) {
        houseRoof = roof;
    }

    @Override
    public void setGarage(String garage) {
        houseGarage = garage;
    }

    public String getHouseWalls() {
        return houseWalls;
    }

    public String getHouseDoors() {
        return houseDoors;
    }

    public String getHouseWindows() {
        return houseWindows;
    }

    public String getHouseRoof() {
        return houseRoof;
    }

    public String getHouseGarage() {
        return houseGarage;
    }

    @Override
    public String toString() {
        return "Home{" +
                "houseWalls='" + houseWalls + '\'' +
                ", houseDoors='" + houseDoors + '\'' +
                ", houseWindows='" + houseWindows + '\'' +
                ", houseRoof='" + houseRoof + '\'' +
                ", houseGarage='" + houseGarage + '\'' +
                '}';
    }
}
