package com.jobsearch.myapp.repository;

import com.jobsearch.myapp.domain.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {}
