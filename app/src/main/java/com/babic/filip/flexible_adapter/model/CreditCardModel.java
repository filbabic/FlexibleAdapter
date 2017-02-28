package com.babic.filip.flexible_adapter.model;

/**
 * Created by Filip Babic @cobe
 */

public class CreditCardModel {

    private final String cardBankName;
    private final String cardNumber;
    private final String cardExpireDate;
    private final String cardOwnerName;

    public CreditCardModel(String cardBankName, String cardNumber, String cardExpireDate, String cardOwnerName) {
        this.cardBankName = cardBankName;
        this.cardNumber = cardNumber;
        this.cardExpireDate = cardExpireDate;
        this.cardOwnerName = cardOwnerName;
    }

    public String getCardBankName() {
        return cardBankName;
    }

    public String getCardExpireDate() {
        return cardExpireDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardOwnerName() {
        return cardOwnerName;
    }
}
