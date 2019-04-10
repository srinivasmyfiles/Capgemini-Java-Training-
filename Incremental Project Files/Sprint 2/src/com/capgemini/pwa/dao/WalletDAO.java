package com.capgemini.pwa.dao;

import com.capgemini.pwa.beans.Customer;
import com.capgemini.pwa.beans.Wallet;

public interface WalletDAO {

	/*
	 * Given the account holding user, the user is able to transfer some or all
	 * of his/her funds from their own account to any other account registered
	 * on the payment wallet application.
	 * 
	 * return the amount transfered from one customer to another
	 */
	public double transfer(Wallet account1, Wallet account2, double transferAmount);

	/*
	 * deposit will calculate the customer's new balance after money is added to
	 * their account
	 * 
	 * 
	 * Given the account holding user, the user is able to add desired amount to
	 * his/her respective account.
	 * 
	 * returns the new balance of the Customer if
	 * validateAmmountAdditionRequest() returns true
	 *
	 */
	public void deposit(Wallet[] account,int accountNumber, double newMoney);

	/*
	 * withdraw() will return the money that a customer wants to transfer to
	 * another user and return the new balance after withdrawal
	 */
	public void withdraw(Wallet[] account,int accountNumber , double withdrawl);

	/*
	 * print all the Customers with wallet accounts
	 * 
	 */
	public void printAllAccounts(Wallet[] accounts);

	/*
	 * Given the user signup / register / create account page, the user is able
	 * to enter the necessary data and create an account on the payment wallet
	 * application.
	 * 
	 * void signUp(Set<Customer> newCustomers);
	 */
	

	/*
	 * Given the user details, the data entered should be validated before
	 * registering the user and creating an account for the same.
	 * 
	 * return boolean if a new customer object is created
	 */
	boolean validateSignUp(Wallet account);

	/*
	 * return boolean if a customer new balance is updated in the Wallet class
	 * also if the customer has a wallet
	 * 
	 * boolean validateAmmountAdditionRequest();
	 */
	
	/*
	 * returns the available balance of the customer's wallet account 
	 * 
	 */
	double viewBalance(Wallet[] account, int accountNumber);
	
	
	
	
	
	

	/*
	 * Given the registered credentials, the user should be able to access the
	 * payment wallet.
	 */
	Customer findAccount(Wallet[] accounts, String accountType, String customerName);

	/*
	 * return boolean if both customers have a wallet and customer1 has enough
	 * money to transfer to the other
	 */
	boolean validateTransfer(Wallet account1, Wallet account2);

	/*
	 * returns boolean if the password and user name match the wallet account or not
	 */
	public boolean validateLogin(Wallet[] accounts, String password, String userName);
	
	
	/*
	 * Deletes customer wallet account from database
	 */
	public void deleteAccount(String userName, String password);
	
}
