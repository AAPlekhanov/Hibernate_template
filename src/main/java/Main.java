import models.Auto;
import models.User;
import service.UserService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();

        // юзер Маша
        User userMasha = new User("Masha", 25);
        Auto bmw = new Auto("BMW", userMasha);
        Auto audi = new Auto("AUDI", userMasha);
        userMasha.setAutoList(Arrays.asList(bmw, audi));

        // юзер Паша
        User userPasha = new User("Pasha", 30);
        Auto lexus = new Auto("LEXUS", userPasha);
        userPasha.setAutoList(Arrays.asList(lexus));

        // сохраняем юзеров
        userService.saveUser(userMasha);
        userService.saveUser(userPasha);

        userMasha.setName("NewNameMasha");
        userService.updateUser(userMasha);


        System.out.println(userService.findUser(1).getAutoList());  ;

        System.out.println(userService.findAllUsers());


      //  userService.deleteUser(userMasha);
    }
}
