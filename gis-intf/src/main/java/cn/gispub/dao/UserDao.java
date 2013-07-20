package cn.gispub.dao;

import java.util.List;

import cn.gispub.intf.User;

public interface UserDao {
	
	List<User> getAllUser() ;
	
	User getUser(long id) ;

}
