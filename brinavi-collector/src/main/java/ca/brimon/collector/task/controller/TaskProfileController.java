package ca.brimon.collector.task.controller;

import ca.brimon.collector.task.model.profile.TaskProfile;
import ca.brimon.collector.task.service.profile.TaskProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/taskprofile")
public class TaskProfileController {

    private TaskProfileService taskProfileService;

    @Autowired
    TaskProfileController(TaskProfileService taskProfileService) {
        this.taskProfileService = taskProfileService;
    }

    @PostMapping
    public TaskProfile createTaskProfile(@RequestBody TaskProfile taskProfile) {
        return this.taskProfileService.createTaskProfile(taskProfile);
    }

    @GetMapping
    public List<TaskProfile> getUserAllTaskProfiles(@RequestParam String userId) {
        return this.taskProfileService.getUserAllTaskProfiles(userId);
    }

}
