package com.tnsif.dayfourteen.synchronization;
public class Insufficientbalance extends Exception {

	public Insufficientbalance() {
		super("Insufficient balance in your account");
	}

	public Insufficientbalance(String message) {
		super(message);
	}
}
