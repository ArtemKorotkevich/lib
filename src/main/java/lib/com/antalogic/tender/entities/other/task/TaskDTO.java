package lib.com.antalogic.tender.entities.other.task;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class TaskDTO {
    private long id;
    private String name;
    private TaskEnum status;
    private String description;
    private UUID creator;
    private UUID executor;
    private UUID inspecting;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String timeZone;
}
