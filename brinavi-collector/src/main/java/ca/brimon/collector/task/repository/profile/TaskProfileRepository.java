package ca.brimon.collector.task.repository.profile;

import ca.brimon.collector.task.model.profile.TaskProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskProfileRepository extends MongoRepository<TaskProfile, Long> {

    TaskProfile save(TaskProfile taskProfile);
    List<TaskProfile> findByCreatorId(String creatorId);

}
