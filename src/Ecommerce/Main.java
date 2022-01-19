package Ecommerce;

import Ecommerce.GoogleAccount.GoogleManager;
import Ecommerce.business.abstracts.UserService;
import Ecommerce.business.concretes.UserManager;
import Ecommerce.core.GoogleManagerAdapter;
import Ecommerce.dataAccess.concretes.HibernateUserDao;
import Ecommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter(new GoogleManager()));
        User user = new User("Kardelen","Şimşek","kardelen.simsek@nttdata.com","123456",true);
        User user2 = new User("Ceren","Şimşek","ceren.simsek@gmail.com","145263",false);
        userService.register(user);
        userService.login(user);
        userService.confirm(user);
        userService.loginWithEmail(user);
        userService.registerWithEmail(user);
        
    	userService.register(user2);
		userService.login(user2);
		userService.confirm(user2);
		userService.loginWithEmail(user2);
		userService.registerWithEmail(user2);
	}

}
