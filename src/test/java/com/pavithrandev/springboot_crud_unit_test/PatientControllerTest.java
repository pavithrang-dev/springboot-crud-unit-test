package com.pavithrandev.springboot_crud_unit_test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pavithrandev.springboot_crud_unit_test.Controller.PatientController;
import com.pavithrandev.springboot_crud_unit_test.Entity.Patient;
import com.pavithrandev.springboot_crud_unit_test.Service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.time.LocalDate;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PatientController.class)// load only controller layer Spring creates a mini web application context
public class PatientControllerTest {
    @Autowired
    private MockMvc mockMvc; //fake http call
    @MockitoBean
    private PatientService patientService; //fake PatientService injected into controller
    @Autowired
    private ObjectMapper objectMapper;
    @Test
    void shouldReturnAllPatients() throws Exception{
        List<Patient> patients = List.of(new Patient("pav", LocalDate.of(1980, 12, 12), "Chennai", "Local Area", "pav@gmail.com", "+91-9876543210"),
                new Patient("pav", LocalDate.of(1980, 12, 12), "Chennai", "Local Area", "pav@gmail.com", "+91-9876543210"));

        when(patientService.getAllPatientService()).thenReturn(patients);
        mockMvc.perform(get("/api/v1/patient"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$.size()").value(2));

    }
    @Test
    void shouldSavePatient() throws Exception{

        Patient patient = new Patient("pav", LocalDate.of(1980, 12, 12), "Chennai", "Local Area", "pav@gmail.com", "+91-9876543210");
        mockMvc.perform(post("/api/v1/patient")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(patient)))
                .andExpect(status().isOk());
        verify(patientService, times(1)).savePatientService(any(Patient.class));
    }


}
