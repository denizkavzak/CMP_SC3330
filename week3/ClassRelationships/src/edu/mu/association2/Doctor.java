package edu.mu.association2;

public class Doctor {
	private String name;
    private Patient patient;

    public Doctor(String name) {
        this.name = name;
    }

    public void assignPatient(Patient patient) {
        this.patient = patient;
    }

    public void showPatient() {
        if (patient != null) {
            System.out.println(
                name + " is treating " + patient.getName()
            );
        }
    }
}
