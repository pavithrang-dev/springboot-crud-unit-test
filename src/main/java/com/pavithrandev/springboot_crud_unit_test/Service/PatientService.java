package com.pavithrandev.springboot_crud_unit_test.Service;

import com.pavithrandev.springboot_crud_unit_test.DTO.PatientData;
import com.pavithrandev.springboot_crud_unit_test.DTO.PatientDto;
import com.pavithrandev.springboot_crud_unit_test.Entity.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    private PatientData patientData = new PatientData();
    PatientService(){

    }

    public List<Patient> getAllPatientService(){
        return patientData.getPatients();
    }

    public void savePatientService(Patient patient){
        patientData.addPatients(patient);
    }
}
