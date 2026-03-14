package com.jobportal.controller;

import com.jobportal.model.Job;
import com.jobportal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://jobportal-frontend-d45s.onrender.com")
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    // GET all jobs
    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    // POST create job
    @PostMapping("/jobs")
    public Job createJob(@RequestBody Job job) {
        return jobRepository.save(job);
    }

    // APPLY JOB API
    @PostMapping("/apply/{id}")
    public String applyJob(@PathVariable Long id) {
        return "Application submitted successfully for job ID: " + id;
    }
}