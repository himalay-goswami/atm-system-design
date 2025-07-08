package dev.himalay.bank;

public class DispenseRequest {

    private int amount;
    private String accountNumber;

    public DispenseRequest(int amount, String accountNumber) {
	this.amount = amount;
	this.accountNumber = accountNumber;
    }

    public int getAmount() {
	return amount;
    }

    public String getAccountNumber() {
	return accountNumber;
    }

    @Override
    public String toString() {
	return "DispenseRequest{" +
		"amount=" + amount +
		", accountNumber='" + accountNumber + '\'' +
		'}';
    }
}
