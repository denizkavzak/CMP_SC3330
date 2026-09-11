package edu.mu.association2;

public class Main {
	
    public static void main(String[] args) {

    	// both objects are created independently
        Doctor doctor = new Doctor("Dr. Smith");
        Patient patient = new Patient("Alice");

        // relationship is established afterward
        doctor.assignPatient(patient);

        doctor.showPatient();
    }
}
