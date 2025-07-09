package dev.himalay.bank;

import dev.himalay.bank.states.ATMState;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class ATM {

  // first of all, we need a single instance of this class.
  private static volatile ATM instance;

  private final BankingService bankingService;
  private final CashDispenser cashDispenser;
  private final ATMState currentState;
  private final AtomicInteger transactionCounter;
  private final LocalDateTime timestamp;
  private final Card currentCard;

  private ATM(BankingService bankingService, CashDispenser cashDispenser, ATMState currentState, AtomicInteger transactionCounter, LocalDateTime timestamp, Card currentCard) {
    this.bankingService = bankingService;
    this.cashDispenser = cashDispenser;
    this.currentState = currentState;
    this.transactionCounter = transactionCounter;
    this.timestamp = timestamp;
    this.currentCard = currentCard;
  }

  public static ATM getATMInstance(BankingService bankingService, CashDispenser cashDispenser, ATMState atmState, AtomicInteger transactionCounter, LocalDateTime timestamp, Card currentCard){
    if(instance == null){
      synchronized (ATM.class){
          if(instance == null){
            instance = new ATM(bankingService, cashDispenser, atmState, transactionCounter, timestamp, currentCard);
          }
      }
    }
    return instance;
  }
}
