package dev.himalay.bank;

import dev.himalay.bank.enums.CardStatus;

public record Card(String cardNumber, String pin, CardStatus status) {

}
