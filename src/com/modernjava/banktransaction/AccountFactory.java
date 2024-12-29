package com.modernjava.banktransaction;

public interface AccountFactory {
	public abstract BankAccount getBankAccount(int id, double balance, String accountName);
}
