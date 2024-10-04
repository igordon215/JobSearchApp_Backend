package com.jobsearch.myapp.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "job_application")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Date applied is required")
    @Column(name = "date_applied", nullable = false)
    private LocalDate dateApplied;

    @NotBlank(message = "Company name is required")
    @Size(max = 100, message = "Company name cannot exceed 100 characters")
    @Column(name = "company_name", length = 100, nullable = false)
    private String companyName;

    @NotBlank(message = "Position is required")
    @Size(max = 100, message = "Position cannot exceed 100 characters")
    @Column(name = "position", length = 100, nullable = false)
    private String position;

    @Size(max = 50, message = "Job number cannot exceed 50 characters")
    @Column(name = "job_number", length = 50)
    private String jobNumber;

    @Size(max = 255, message = "Website cannot exceed 255 characters")
    @Column(name = "website")
    private String website;

    @NotNull(message = "Status is required")
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Size(max = 500, message = "Contact info and follow up cannot exceed 500 characters")
    @Column(name = "contact_info_follow_up", length = 500)
    private String contactInfoFollowUp;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    public enum Status {
        APPLIED,
        INTERVIEW,
        FILLED,
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(LocalDate dateApplied) {
        this.dateApplied = dateApplied;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getContactInfoFollowUp() {
        return contactInfoFollowUp;
    }

    public void setContactInfoFollowUp(String contactInfoFollowUp) {
        this.contactInfoFollowUp = contactInfoFollowUp;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobApplication that = (JobApplication) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return (
            "JobApplication{" +
            "id=" +
            id +
            ", dateApplied=" +
            dateApplied +
            ", companyName='" +
            companyName +
            '\'' +
            ", position='" +
            position +
            '\'' +
            ", jobNumber='" +
            jobNumber +
            '\'' +
            ", website='" +
            website +
            '\'' +
            ", status=" +
            status +
            ", contactInfoFollowUp='" +
            contactInfoFollowUp +
            '\'' +
            ", notes='" +
            notes +
            '\'' +
            '}'
        );
    }
}
