package com.pavithrandev.springboot_crud_unit_test.Controller;

import com.pavithrandev.springboot_crud_unit_test.DTO.PatientDto;
import com.pavithrandev.springboot_crud_unit_test.Entity.Patient;
import com.pavithrandev.springboot_crud_unit_test.Service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/patient")
public class PatientController {

 private PatientService patientService;

 PatientController(PatientService patientService){
     this.patientService= patientService;
 }
@GetMapping
public List<Patient> getAllPatient(){
return  patientService.getAllPatientService();
}

@PostMapping
public void savePatient(@RequestBody Patient patient){
     patientService.savePatientService(patient);
 }
}
