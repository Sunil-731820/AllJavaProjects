package com.java.jsf.WithDependency;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
class UserDto{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserDto [name=" + name + "]";
	}
	
	
}


@ManagedBean
@SessionScoped
public class HelloBean {
	
	@ManagedProperty(value = "#{user}")
	private UserDto userDto = null;

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	
	public String display() {
		return "second";
	}
	
	
	
	

}
