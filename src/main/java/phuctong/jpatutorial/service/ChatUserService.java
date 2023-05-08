package phuctong.jpatutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phuctong.jpatutorial.entity.ChatUser;
import phuctong.jpatutorial.entity.Comment;
import phuctong.jpatutorial.repository.IChatUserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChatUserService {
    @Autowired
    private IChatUserRepository repository;

    public List<ChatUser> getAllChatUsers(){
        List<ChatUser> users = new ArrayList<>();
        repository.findAll().forEach( user -> users.add(user) );
        return users;
    }
    public List<Comment> getAllComments( String userId){
        Optional<ChatUser> a = repository.findById(userId);
        System.out.println(a.get());
//        if( a.isPresent() ){
//            return null;
//        }
//        List<Comment> comments = a.get().getComments();
        return null;
    }
    public ChatUser getUser(String userId){
        Optional<ChatUser> user = repository.findById(userId);
        if( user.isPresent() ){
            return user.get();
        }
        return null;
    }

}
