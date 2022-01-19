package Ecommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Ecommerce.dataAccess.abstracts.UserDao;
import Ecommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void deleteUser(User user) {
        System.out.println(user.getName() + user.getSurname() + "isimli kullanıcı basarılı bir şekilde silindi!");		
	}

	@Override
	public void UpdateUser(User user) {
        System.out.println(user.getName() + user.getSurname() + "isimli kullanıcı basarılı bir şekilde güncelleştirildi!");		
		
	}

	@Override
	public void register(User user) {
        System.out.println(user.getName() + user.getSurname() + "isimli kullanıcı sisteme kayıt oldu!");		
		
	}

	@Override
	public void confirm(User user) {
        System.out.println(user.getName() + user.getSurname() + "isimli kullanıcı onaylanmıştır!");		
		
	}

	@Override
	public void login(User user) {
        System.out.println(user.getName() + user.getSurname() + "isimli kullanıcı giriş yaptı!");		
		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	
	
}
