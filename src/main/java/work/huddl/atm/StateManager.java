package dev.himalay.bank;

import dev.himalay.bank.enums.ATMStateEnum;
import dev.himalay.bank.enums.OperationType;

public class StateManager {

  private ATMStateEnum currentState;

  public StateManager() {
    this.currentState = ATMStateEnum.IDLE;
  }

  public void setState(ATMStateEnum nextState){
    this.currentState = nextState;
  }

  public void insertCard(String cardNumber){
    //
  }

  public void enterPin(String pin){
    //
  }

  public void selectOperation(OperationType operationType){
    //
  }

  public void withdrawCash(CashDispenser cashDispenser){
    //
  }

  public void ejectCard(String cardNumber){
    //
  }
}
