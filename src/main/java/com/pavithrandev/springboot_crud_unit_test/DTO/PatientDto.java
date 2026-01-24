package com.pavithrandev.springboot_crud_unit_test.DTO;

import java.time.LocalDate;


public record PatientDto(String name, LocalDate dob, String address, String city, String state, String email,Long phoneNo) {

}
