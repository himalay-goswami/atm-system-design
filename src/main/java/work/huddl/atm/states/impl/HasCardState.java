package dev.himalay.bank.states.impl;

import dev.himalay.bank.CashDispenser;
import dev.himalay.bank.StateManager;
import dev.himalay.bank.enums.OperationType;
import dev.himalay.bank.states.ATMState;

public class HasCardState implements ATMState {

  @Override
  public void insertCard(StateManager manager, String cardNumber) {

  }

  @Override
  public boolean authenticate(StateManager manager, String pin) {
    return false;
  }

  @Override
  public void performOperation(StateManager manager, OperationType operation) {

  }

  @Override
  public void dispense(StateManager manager, CashDispenser dispenser) {

  }

  @Override
  public void ejectCard(StateManager manager) {

  }
}
