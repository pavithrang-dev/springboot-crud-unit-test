package com.pavithrandev.springboot_crud_unit_test.DTO;

import com.pavithrandev.springboot_crud_unit_test.Entity.Patient;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PatientData {
    private List<Patient> patients = new ArrayList<>();

    public PatientData(){
        initializePatient();
    }

    public void initializePatient(){
        patients.add(new Patient("pav", LocalDate.of(1980, 12, 12), "Chennai", "Local Area", "pav@gmail.com", "+91-9876543210"));
        patients.add(new Patient("arun", LocalDate.of(1985, 5, 21), "Chennai", "Anna Nagar", "arun@gmail.com", "+91-9876543211"));
        patients.add(new Patient("karthik", LocalDate.of(1978, 8, 3), "Chennai", "T Nagar", "karthik@gmail.com", "+91-9876543212"));
        patients.add(new Patient("meena", LocalDate.of(1990, 2, 15), "Chennai", "Velachery", "meena@gmail.com", "+91-9876543213"));
        patients.add(new Patient("suresh", LocalDate.of(1975, 10, 30), "Chennai", "Tambaram", "suresh@gmail.com", "+91-9876543214"));
        patients.add(new Patient("divya", LocalDate.of(1992, 7, 8), "Chennai", "Guindy", "divya@gmail.com", "+91-9876543215"));
        patients.add(new Patient("rahul", LocalDate.of(1988, 3, 19), "Chennai", "Adyar", "rahul@gmail.com", "+91-9876543216"));
        patients.add(new Patient("priya", LocalDate.of(1995, 11, 25), "Chennai", "Mylapore", "priya@gmail.com", "+91-9876543217"));
        patients.add(new Patient("vijay", LocalDate.of(1982, 1, 5), "Chennai", "Porur", "vijay@gmail.com", "+91-9876543218"));
        patients.add(new Patient("anitha", LocalDate.of(1987, 4, 11), "Chennai", "Nungambakkam", "anitha@gmail.com", "+91-9876543219"));
        patients.add(new Patient("senthil", LocalDate.of(1979, 9, 18), "Chennai", "Ashok Nagar", "senthil@gmail.com", "+91-9876543220"));
        patients.add(new Patient("manoj", LocalDate.of(1991, 6, 9), "Chennai", "Kodambakkam", "manoj@gmail.com", "+91-9876543221"));
        patients.add(new Patient("revathi", LocalDate.of(1984, 12, 1), "Chennai", "Vadapalani", "revathi@gmail.com", "+91-9876543222"));
        patients.add(new Patient("naveen", LocalDate.of(1989, 7, 22), "Chennai", "Chrompet", "naveen@gmail.com", "+91-9876543223"));
        patients.add(new Patient("pooja", LocalDate.of(1993, 5, 14), "Chennai", "Pallavaram", "pooja@gmail.com", "+91-9876543224"));
        patients.add(new Patient("balaji", LocalDate.of(1977, 11, 28), "Chennai", "Perungudi", "balaji@gmail.com", "+91-9876543225"));
        patients.add(new Patient("hema", LocalDate.of(1996, 2, 17), "Chennai", "Thoraipakkam", "hema@gmail.com", "+91-9876543226"));
        patients.add(new Patient("srikanth", LocalDate.of(1981, 10, 6), "Chennai", "Medavakkam", "srikanth@gmail.com", "+91-9876543227"));
        patients.add(new Patient("lavanya", LocalDate.of(1994, 8, 12), "Chennai", "Sholinganallur", "lavanya@gmail.com", "+91-9876543228"));
        patients.add(new Patient("ramesh", LocalDate.of(1976, 4, 27), "Chennai", "Ambattur", "ramesh@gmail.com", "+91-9876543229"));
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatients(Patient patient){
        patients.add(patient);
    }
}