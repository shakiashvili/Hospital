package services;
import java.math.BigDecimal;

public class Prescription {
    private String medicationName;
    private BigDecimal cost;

    public Prescription(String medicationName, BigDecimal cost) {
        this.medicationName = medicationName;
        this.cost = cost;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}