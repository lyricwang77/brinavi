package ca.brimon.collector.task.model.profile;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "task_profile")
public class TaskProfile {
    private String title;
    private String category;
    private String workspace;
    private String channel;
    private String content;
}
