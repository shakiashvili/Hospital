package services;
import java.time.LocalDateTime;

public class MedicalRecord {
    private String diagnosis;
    private LocalDateTime visitTime;
    private boolean hasMedicalRecord;

    public MedicalRecord(String diagnosis, LocalDateTime visitTime) {
        this.diagnosis = diagnosis;
        this.visitTime = visitTime;
        this.hasMedicalRecord = false;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDateTime getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(LocalDateTime visitTime) {
        this.visitTime = visitTime;
    }

    public boolean hasMedicalRecord() {
        return hasMedicalRecord;
    }

    public void setHasMedicalRecord(boolean hasMedicalRecord) {
        this.hasMedicalRecord = hasMedicalRecord;
    }
}
