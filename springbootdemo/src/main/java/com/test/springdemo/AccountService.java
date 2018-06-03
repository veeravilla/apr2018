package com.test.springdemo;

import com.test.springdemo.dao.IAccountDAO;
import com.test.springdemo.entity.Account;

public class AccountService {
	
	private IAccountDAO accountDAO;
	
	public AccountService(IAccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	public boolean isValidUser(String userName) {
		Account account = accountDAO.getAccount(userName);
		if(account != null)
			return true;
		else
			return false;
	}

}
