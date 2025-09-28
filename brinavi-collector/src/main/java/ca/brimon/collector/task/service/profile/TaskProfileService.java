package ca.brimon.collector.task.service.profile;

import ca.brimon.collector.task.model.profile.TaskProfile;
import ca.brimon.collector.task.repository.profile.TaskProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskProfileService {

    private TaskProfileRepository taskProfileRepository;

    @Autowired
    TaskProfileService(TaskProfileRepository taskProfileRepository) {
        this.taskProfileRepository = taskProfileRepository;
    }

    public TaskProfile createTaskProfile(TaskProfile taskProfile){
        return this.taskProfileRepository.save(taskProfile);
    }

    public List<TaskProfile> getUserAllTaskProfiles(String userId) {
        return this.taskProfileRepository.findByCreatorId(userId);
    }

}
