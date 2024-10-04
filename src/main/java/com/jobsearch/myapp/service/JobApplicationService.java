package com.jobsearch.myapp.service;

import com.jobsearch.myapp.domain.JobApplication;
import com.jobsearch.myapp.repository.JobApplicationRepository;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JobApplicationService {

    private final Logger log = LoggerFactory.getLogger(JobApplicationService.class);

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationService(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public JobApplication save(JobApplication jobApplication) {
        log.debug("Request to save JobApplication : {}", jobApplication);
        return jobApplicationRepository.save(jobApplication);
    }

    public Optional<JobApplication> partialUpdate(JobApplication jobApplication) {
        log.debug("Request to partially update JobApplication : {}", jobApplication);

        return jobApplicationRepository
            .findById(jobApplication.getId())
            .map(existingJobApplication -> {
                if (jobApplication.getDateApplied() != null) {
                    existingJobApplication.setDateApplied(jobApplication.getDateApplied());
                }
                if (jobApplication.getCompanyName() != null) {
                    existingJobApplication.setCompanyName(jobApplication.getCompanyName());
                }
                if (jobApplication.getPosition() != null) {
                    existingJobApplication.setPosition(jobApplication.getPosition());
                }
                if (jobApplication.getJobNumber() != null) {
                    existingJobApplication.setJobNumber(jobApplication.getJobNumber());
                }
                if (jobApplication.getWebsite() != null) {
                    existingJobApplication.setWebsite(jobApplication.getWebsite());
                }
                if (jobApplication.getStatus() != null) {
                    existingJobApplication.setStatus(jobApplication.getStatus());
                }
                if (jobApplication.getContactInfoFollowUp() != null) {
                    existingJobApplication.setContactInfoFollowUp(jobApplication.getContactInfoFollowUp());
                }
                if (jobApplication.getNotes() != null) {
                    existingJobApplication.setNotes(jobApplication.getNotes());
                }

                return existingJobApplication;
            })
            .map(jobApplicationRepository::save);
    }

    @Transactional(readOnly = true)
    public List<JobApplication> findAll() {
        log.debug("Request to get all JobApplications");
        return jobApplicationRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<JobApplication> findOne(Long id) {
        log.debug("Request to get JobApplication : {}", id);
        return jobApplicationRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete JobApplication : {}", id);
        jobApplicationRepository.deleteById(id);
    }
}
