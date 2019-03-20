package com.ddh.springboot.first.dao;

import com.ddh.springboot.first.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ddh on 2019/3/20.
 */
public interface UserDao extends JpaRepository<User, Long> {


}
