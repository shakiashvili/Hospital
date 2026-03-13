package infrastructure;

public class Building {
    private String adress;
    private int floorCount;
    private Room[] rooms;

    public Building(String adress, int floorCount, Room[] rooms) {
        this.adress = adress;
        this.floorCount = floorCount;
        this.rooms = rooms;
    }

    public String getAdress() {
        return adress;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }
}