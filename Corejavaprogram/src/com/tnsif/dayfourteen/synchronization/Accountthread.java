package com.tnsif.dayfourteen.synchronization;

public class Accountthread extends Thread{
	private Account acc;
	private int amt;
	
	public Accountthread(Account acc,int amt)
	{
		this.acc=acc;
		this.amt=amt;
		start();
		
	}
	@Override
	public void run()
	{
		/* Using Synchronized Block - withdraw() is non synchronized
		 * synchronized (acc) 
		 * { 
		 * acc.withdraw(amt); 
		 * }
		 */		
		
		try {
			acc.withdraw(amt);
		} catch (Insufficientbalance e) {
			System.err.println(e.getMessage());
		}
	}{

}