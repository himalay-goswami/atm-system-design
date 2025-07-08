package dev.himalay.bank.states;

import dev.himalay.bank.CashDispenser;
import dev.himalay.bank.StateManager;
import dev.himalay.bank.enums.OperationType;

public interface ATMState {

	void insertCard(StateManager manager, String cardNumber);

	boolean authenticate(StateManager manager, String pin);

	void performOperation(StateManager manager, OperationType operation);

	void dispense(StateManager manager, CashDispenser dispenser);

	void ejectCard(StateManager manager);

}
