package dev.himalay.bank.enums;

public enum ATMStateEnum {

  // since enums are inherently singleton,
  // we will use an enum object to represent ATM's state.

  IDLE,
  CARD_INSERTED,
  AUTHENTICATED,
  IN_PROCESS,
  CARD_EJECTED
}
