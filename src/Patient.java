public class Patient {

    private String patientId;
    private String name;
    private int age;
    private String disease;
    private String symptoms;
    private String severity;

    public Patient(String patientId, String name,
                   int age, String disease,
                   String symptoms, String severity) {

        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.symptoms = symptoms;
        this.severity = severity;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public String getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return patientId + " | " +
               name + " | " +
               age + " | " +
               disease + " | " +
               symptoms + " | " +
               severity;
    }
}