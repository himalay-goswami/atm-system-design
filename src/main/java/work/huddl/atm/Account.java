package dev.himalay.bank;

import java.util.HashMap;
import java.util.Map;

public class Account {

  /**
   * A unique identifier for account holder
   */
  private final String userName;
  private final String accountNumber;
  private final double balance;

  /**
   * Cards are not final as a user may opt for more than 1 card for an account
   */
  private Map<String, Card> cards;

  public Account(final String accountNumber,
                 final double balance,
                 final String userName) {
    this.userName = userName;
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.cards = new HashMap<>();
  }

  public double getBalance(){
    return this.balance;
  }

  public String getUserName(){
    return this.userName;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public Map<String, Card> getCards() {
    return cards;
  }

  public synchronized boolean withdraw(final double balance){
    return false;
  }

  public synchronized void deposit(final double balance){
    //
  }
}

/*
   Bank Service acts as a repository for ATM.
   It validates a user, card, then validates balance,
   and returns some kind of token to continue with transaction.
*/
