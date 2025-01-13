package ee.ivkhkdev.demofx.services;

import ee.ivkhkdev.demofx.entity.User;
import ee.ivkhkdev.demofx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean add(User user){
        try {
            userRepository.save(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
