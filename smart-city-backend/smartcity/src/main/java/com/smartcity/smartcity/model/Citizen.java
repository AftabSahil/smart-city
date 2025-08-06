package com.smartcity.smartcity.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Citizens")
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CitizenID")
    private int citizenID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "ContactInfo")
    private String contactInfo;

    @Column(name = "RegistrationDate")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    // Getters and setters here (or use Lombok)
    public int getCitizenID() { return citizenID; }
    public void setCitizenID(int citizenID) { this.citizenID = citizenID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

    public Date getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(Date registrationDate) { this.registrationDate = registrationDate; }
}
