package phuctong.jpatutorial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Comment {
    @Id
    @Column(name = "comment_id")
    private String comment_id;
    @Column(name= "content")
    private String content;
    @ManyToOne
//    @JsonIgnore
    @JoinColumn(name = "own",  nullable = false)
    private ChatUser own;
}
