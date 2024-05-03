package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		
	//create object of user
//		User user1=new User();
//		user1.setName("saswat");
//		user1.setCity("puri");
//		user1.setStatus("java devloper");
		
//		User result= userRepository.save(user1);
//		System.out.println(result);
		
//		User user2=new User();
//		user2.setName("rakesh");
//		user2.setCity("biswalsahi");
//		user2.setStatus("bartender");
//		
//		User user3=new User();
//		user3.setName("deepak");
//		user3.setCity("mudulisahi");
//		user3.setStatus("captain");
//		
		//saving single user
//		User resultuser=userRepository.save(user2);
//		System.out.println("saved user is "+resultuser);
//		saving multiple user
//		List<User> users=List.of(user2,user3);
//		Iterable<User> resultusers=userRepository.saveAll(users);
//		resultusers.forEach(user->{
//			System.out.println(user);
//		});
//	
		//update data of id 303
//		Optional<User> optional = userRepository.findById(303);
//		User user = optional.get();
//		user.setName("deepak muduli");
//		User result = userRepository.save(user);
//		System.out.println(result);
		//how to get data
//		findBy(id)-return optional containg your data
		
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext())
//		{
//			User user=iterator.next();
//			System.out.println(user);
//		}
//		or
//		itr.forEach(new Consumer<User>()
//		{
//
//			@Override
//			public void accept(User t) 
//			{
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});
//		itr.forEach(user->{System.out.println(user);});
		//deleting single user element
//		userRepository.deleteById(302);
		//or deleting all user element
//		Iterable<User> allusers = userRepository.findAll();
//		userRepository.deleteAll(allusers);
//		List<User> user = userRepository.findByNameAndCity("saswat","puri");
//		user.forEach(e->{System.out.println(e);});
//		List<User> user = userRepository.getAllUsers();
//		user.forEach(e->{System.out.println(e);});
//		List<User> user = userRepository.getUserByName("saswat");
//		user.forEach(e->{System.out.println(e);});
//		List<User> user = userRepository.getUserByName("saswat","puri");
//		user.forEach(e->{System.out.println(e);});
		
		userRepository.getUsers().forEach(e->System.out.println(e));
		
	}
	

}
