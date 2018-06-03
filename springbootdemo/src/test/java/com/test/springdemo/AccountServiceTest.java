package com.test.springdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import com.test.springdemo.dao.IAccountDAO;
import com.test.springdemo.entity.Account;

public class AccountServiceTest {
	
	@Test
	public void testIsValidUser() {
		//Mock Object
		IAccountDAO accountDAO = Mockito.mock(IAccountDAO.class);
		
		Mockito.when(accountDAO.getAccount("Jhon")).thenReturn(new Account("Jhon", "Test123"));
		
		AccountService accountService = new AccountService(accountDAO);
		
		assertEquals(true, accountService.isValidUser("Jhon"));
	}
	
	
	@Test
	public void testIsValidUserWithNull() {
		//Mock Object
		IAccountDAO accountDAO = Mockito.mock(IAccountDAO.class);
		
		Mockito.when(accountDAO.getAccount("Tim")).thenReturn(null);
		Mockito.when(accountDAO.getAccount("Jhon")).thenReturn(new Account("Jhon", "Test123"));
		
	//	Mockito.when(accountDAO.getAccount(Mockito.anyString())).thenReturn(new Account("Jhon", "Test123"));
		
		AccountService accountService = new AccountService(accountDAO);
		
		assertEquals(false, accountService.isValidUser("Tim"));
	}

}
