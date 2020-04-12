package online.shop.service;

import online.shop.model.User;
import online.shop.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRep userRep;

    @Autowired
    public UserService(UserRep userRep) {
        this.userRep = userRep;
    }

    public void createOrUpdateUser(User user) {
        if (null == user.getId()) {
            createUser(user);
            return;
        }
        updateUser(user);

    }


    private void updateUser(User user) {
        userRep.save(user);
    }


    public void createUser(User user) {
        userRep.save(user);
    }
}
