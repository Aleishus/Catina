package cn.gispub.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gispub.dao.UserDao;
import cn.gispub.intf.User;

@Service
public class TestMyBatis {

@Autowired
private UserDao ud ;

 
public List<User> getAll()
{
	return ud.getAllUser() ;
}


public User getOne(long id)
{
	return ud.getUser(id) ;
}
	

}
