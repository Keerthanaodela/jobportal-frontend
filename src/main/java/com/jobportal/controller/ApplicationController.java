package com.jobportal.controller;

import com.jobportal.model.Application;
import com.jobportal.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping("/apply")
    public Application apply(@RequestBody Application application) {
        return applicationService.applyJob(application);
    }

    @GetMapping
    public List<Application> getApplications() {
        return applicationService.getAllApplications();
    }
}