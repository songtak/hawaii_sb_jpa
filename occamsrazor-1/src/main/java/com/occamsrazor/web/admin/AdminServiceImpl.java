package com.occamsrazor.web.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired AdminDao adminDao;
	
	
	@Override
	public void register(Admin admin) {
		/*
		 employNumber, passwd ,name , position, profile, email, phoneNumber, registerDate;
		 * */
		System.out.println(admin);
		admin.setEmployNumber(createEmployNumber());
		admin.setPasswd("1");
		admin.setRegisterDate(createCurrentDate());
		adminDao.insert(admin);
		
	}

	private String createCurrentDate() {
		// TODO Auto-generated method stub
		return null;
	}

	private String createEmployNumber() {
		return null;
	}

	@Override
	public List<Admin> findAll() {
		return adminDao.selectAll();
	}

	@Override
	public Admin findOne(String employNumber) {
		return adminDao.selectOne(employNumber);
	}

	@Override
	public void modify(Admin admin) {
		adminDao.update(admin);
		
	}

	@Override
	public void remove(Admin admin) {
		adminDao.delete(admin);
		
	}
	
	
}











