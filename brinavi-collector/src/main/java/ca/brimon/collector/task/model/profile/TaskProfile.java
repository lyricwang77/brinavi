package ca.brimon.collector.task.model.profile;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "task_profile")
public class TaskProfile {
    @Id
    private String id;
    private String title;
    private String type;
    private String workspaceId;
    private String channel;
    private String content;
    private String creatorId;
    private Boolean inEffect;
}
