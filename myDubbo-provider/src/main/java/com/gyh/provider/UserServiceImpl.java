package com.gyh.provider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gyh.api.UserService;
import com.gyh.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<UserDto> getUsers() {
		UserDto u1=new UserDto();
		u1.setAge(11);
		u1.setName("gyh");
		UserDto u2=new UserDto();
		u2.setAge(12);
		u2.setName("yfs");
		
		List<UserDto> list=new ArrayList<>();
		list.add(u1);
		list.add(u2);
		System.out.println("========================");
		return list;
	}

}
