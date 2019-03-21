package com.ddh.springboot.first;

import com.ddh.springboot.first.dao.UserDao;
import com.ddh.springboot.first.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ddh on 2019/3/14.
 */
@RestController
public class HelloController {
	@Autowired private UserDao userDao;

	@RequestMapping(value = "/hello")
	public String hello() {
		List<User> users = userDao.findAll();
		System.out.println(users.size());
		return "hello world2.";
	}
}
