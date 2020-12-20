package tretoPaketche;

import java.util.Date;

public class Account {
	private int id = 0;
	protected double balance = 0;
	private static double yearInterestRate = 4.5;
	private Date dateCreated = new Date();
	
	Account() {
		
	}
	
	Account(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
		
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getYearInterestRate() {
		return yearInterestRate;
	}
	public void setYearInterestRate(double yrInterestRate) {
		yearInterestRate = yrInterestRate;
	}
	
	public static double getMonthlyInterestRate() {
		return yearInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * yearInterestRate / 12 / 100;
	}
	
	public void withdraw (double draw) {
		balance -= draw;
	}
	
	public void deposit(double sum) {
		balance += sum;
	}
	
	public String toString() {
		return "Balance: " + balance;
	}

}
