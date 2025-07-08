package dev.himalay.bank;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.HashMap;

public class BankingService {

	// string is the unique account number of the user
	private Map<String, Account> accounts;
	private Map<String, Card> cards;

	// assuming one account can have multiple cards
	private Map<Account, List<Card>> cardToAccountMap;

	public BankingService() {
		this.accounts = new HashMap<>();
		this.cards = new HashMap<>();
		this.cardToAccountMap = new HashMap<>();
	}

	public Account createAccount(String userName, double initialBalance) {
		return null;
	}

	public Card createCard(String userName) {
		return null;
	}

	public Card getCard(String userName) {
		return null;
	}

	public String getAccount() {
		return "";
	}

	public void linkCardToAccount(String username, Card card) {
		Optional<Account> userAccount = Optional.of(accounts.get(username));
		List<Card> previousCards = cardToAccountMap.get(userAccount.get());
		previousCards.add(card);
	}

	// utility method to validate the card for duplicate and status
	private boolean validateCard(Card card, String userName) {
		return true;
	}
}

/*
 * Bank Service acts as a repository for ATM.
 * It validates a user, card, then validates balance,
 * and returns some kind of token to continue with transaction.
 */
