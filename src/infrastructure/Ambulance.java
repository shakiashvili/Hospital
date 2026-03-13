package infrastructure;

public class Ambulance {
    private String numberPlate;
    private boolean isAvailable;

    public Ambulance(String numberPlate, boolean isAvailable) {
        this.numberPlate = numberPlate;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
