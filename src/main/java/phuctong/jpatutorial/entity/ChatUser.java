package phuctong.jpatutorial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "user")
public class ChatUser {
    @Id
    @Column(name= "id")
    private String id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String gmail;
    @Column
    private String address;
//    @JsonIgnore
//    @OneToMany( mappedBy = "own")
//    private List<Comment> comments;
//    public List<Comment> getComments(){
//        return comments;
//    }
}

