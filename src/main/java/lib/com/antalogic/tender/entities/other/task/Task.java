package lib.com.antalogic.tender.entities.other.task;

import lib.com.antalogic.tender.entities.other.authorisation.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "TEXT")
    private String name;
    @Enumerated(EnumType.STRING)
    private TaskEnum status;
    @Column(columnDefinition = "TEXT")
    private String description;
    @ManyToOne
    private User creator;
    @ManyToOne
    private User executor;
    @ManyToOne
    private User inspecting;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startDateTime;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endDateTime;
    @CreatedDate
    private ZonedDateTime creationDate;
    @LastModifiedDate
    private ZonedDateTime updatedDate;
}
