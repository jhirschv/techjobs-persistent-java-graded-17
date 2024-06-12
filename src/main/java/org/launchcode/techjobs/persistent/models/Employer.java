package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany(mappedBy = "employer")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "Cannot be blank")
    @Size(min = 1, max = 100, message = "location must be between 1 and 100 characters long")
    private String location;

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
