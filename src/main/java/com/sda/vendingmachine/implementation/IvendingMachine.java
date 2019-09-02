package com.sda.vendingmachine.implementation;

import com.sda.vendingmachine.bank.Coin;
import com.sda.vendingmachine.storage.Item;

import java.math.BigDecimal;
import java.util.Queue;

public interface IvendingMachine {

    Item getItem(int productCode);

    void payItem(Queue<Coin> amountPayed);

    void getChange(BigDecimal amountExpected, BigDecimal amountReceived);

    void cancelRequest();

}
