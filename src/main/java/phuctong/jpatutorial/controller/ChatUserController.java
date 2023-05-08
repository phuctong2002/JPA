package phuctong.jpatutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import phuctong.jpatutorial.entity.ChatUser;
import phuctong.jpatutorial.entity.Comment;
import phuctong.jpatutorial.service.ChatUserService;

import java.util.List;

@RestController
public class ChatUserController {
    @Autowired
    private ChatUserService service;
    @GetMapping("/chat-user")
    public ResponseEntity<Object> getAllChatUsers(){
        return ResponseEntity.status(200).body( service.getAllChatUsers());
    }
    @GetMapping("/test/{userId}")
    public ResponseEntity<Object> testMethod( @PathVariable String userId){
        System.out.println(userId);
        List<Comment> comments = service.getAllComments(userId);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<Object> getUser(@PathVariable String userId){
        return new ResponseEntity<>( service.getUser(userId), HttpStatus.OK);
    }

}
