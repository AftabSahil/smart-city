package com.smartcity.smartcity.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Requests")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RequestID")
    private int requestID;

    @Column(name = "CitizenID")
    private String citizenID;

    @Column(name = "ServiceID")
    private int serviceID;

    @Temporal(TemporalType.DATE)
    private Date dateRequested;

    @Column(name = "Status")
    private String status;

    // Getters and setters
   public int getRequestID() { return requestID; }
public void setRequestID(int requestID) { this.requestID = requestID; }

public String getCitizenID() { return citizenID; }
public void setCitizenID(String citizenID) { this.citizenID = citizenID; }

public int getServiceID() { return serviceID; }
public void setServiceID(int serviceID) { this.serviceID = serviceID; }

public Date getDateRequested() { return dateRequested; }
public void setDateRequested(Date dateRequested) { this.dateRequested = dateRequested; }

public String getStatus() { return status; }
public void setStatus(String status) { this.status = status; }



  
}
