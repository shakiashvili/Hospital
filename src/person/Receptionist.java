package person;

public class Receptionist {
    private String name;
    private String shift;

    public Receptionist(String name, String shift) {
        this.name = name;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}