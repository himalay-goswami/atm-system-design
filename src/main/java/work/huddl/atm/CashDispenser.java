package dev.himalay.bank;

import java.util.Map;
import dev.himalay.bank.BankingService;

public class CashDispenser {

	// this map holds demonimination and avaialble notes
	private Map<Integer, Integer> availableCurrency;
	private BankingService bankingService;

	public CashDispenser(final Map<Integer, Integer> currency, final BankingService service) {
		this.availableCurrency = currency;
		this.bankingService = service;
	}

	public void dispenseCash(DispenseRequest dispenseRequest) {
		//
	}

	private boolean validateDispenseRequest(DispenseRequest request) {
		//
		return false;
	}

	private boolean isCurrencyAvailable(final DispenseRequest request) {
		// we need to check from map of available currency how to dispense amount.
		return false;
	}

	private Map<Integer, Integer> denominationCalculator(final DispenseRequest request) {

		Integer amount = request.getAmount();
		return null;
	}

}
