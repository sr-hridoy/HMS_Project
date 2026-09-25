import java.util.ArrayList;

public class Hospital {
    private ArrayList<Patient> patients = new ArrayList<>();
    private int nextId = 1;

    public void addPatient(String name, int age) {
        patients.add(new Patient(nextId++, name, age));
        System.out.println("Patient added successfully!");
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found!");
            return;
        }
        for (Patient p : patients) {
            p.display();
        }
    }

    public void updatePatient(int id, String name, int age) {
        for (Patient p : patients) {
            if (p.getId() == id) {
                p.setName(name);
                p.setAge(age);
                System.out.println("Patient updated successfully!");
                return;
            }
        }
        System.out.println("Patient not found!");
    }

    public void deletePatient(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) {
                patients.remove(p);
                System.out.println("Patient deleted successfully!");
                return;
            }
        }
        System.out.println("Patient not found!");
    }
}