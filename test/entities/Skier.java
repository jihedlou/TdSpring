package tn.esprit.test.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity

public class Skier {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  int idSkier;
    private String name;
    private LocalDate birthDate;


}
