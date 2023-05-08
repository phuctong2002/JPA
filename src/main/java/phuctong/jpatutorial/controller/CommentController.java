package phuctong.jpatutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import phuctong.jpatutorial.service.CommentService;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;
    @GetMapping("/comment")
    public ResponseEntity<Object> getAllComments() {
        System.out.println("heheh");
        return new ResponseEntity<>( commentService.getAllComments(), HttpStatus.OK);
    }
}
