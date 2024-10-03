package com.jobsearch.myapp.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "job_application")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "application_method")
    private String applicationMethod;

    @Column(name = "date_applied")
    private LocalDate dateApplied;

    @Column(name = "contact_information")
    private String contactInformation;

    @Column(name = "follow_up")
    private String followUp;

    @Column(name = "status")
    private String status;

    @Column(name = "interview_dates")
    private String interviewDates;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getApplicationMethod() {
        return applicationMethod;
    }

    public void setApplicationMethod(String applicationMethod) {
        this.applicationMethod = applicationMethod;
    }

    public LocalDate getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(LocalDate dateApplied) {
        this.dateApplied = dateApplied;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getFollowUp() {
        return followUp;
    }

    public void setFollowUp(String followUp) {
        this.followUp = followUp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInterviewDates() {
        return interviewDates;
    }

    public void setInterviewDates(String interviewDates) {
        this.interviewDates = interviewDates;
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
            ", companyName='" +
            companyName +
            '\'' +
            ", jobTitle='" +
            jobTitle +
            '\'' +
            ", applicationMethod='" +
            applicationMethod +
            '\'' +
            ", dateApplied=" +
            dateApplied +
            ", contactInformation='" +
            contactInformation +
            '\'' +
            ", followUp='" +
            followUp +
            '\'' +
            ", status='" +
            status +
            '\'' +
            ", interviewDates='" +
            interviewDates +
            '\'' +
            ", notes='" +
            notes +
            '\'' +
            '}'
        );
    }
}
