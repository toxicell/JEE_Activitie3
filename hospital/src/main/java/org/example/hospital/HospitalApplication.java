package org.example.hospital;

import org.example.hospital.entities.Patient;
import org.example.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //patientRepository.save(new Patient(null,"Badr",new Date(1993,04,19),false,34));
        //patientRepository.save(new Patient(null,"Omar",new Date(1903,12,20),true,99));
        //patientRepository.save(new Patient(null,"Badr",new Date(2023,10,23),false,10));
    }
}
