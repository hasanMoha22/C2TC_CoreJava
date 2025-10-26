package com.tnsif.dayfourteen.synchronization;


public class Depositlimit extends Exception {

	public Depositlimit()
	{
		super("Daily limit of Deposit is exceeded..");
	}
	public Depositlimit(String message)
	{
		super(message);
	}{

}