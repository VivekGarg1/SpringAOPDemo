package com.home.service;

import com.home.model.Account;

public interface AccountService {

	public void updateAccountBalance(Account account, Long amount);
	public Account getAccountBycustomerId(String custId) throws Exception;

}