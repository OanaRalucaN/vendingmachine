package com.sda.vendingmachine.implementation;

import com.sda.vendingmachine.bank.Coin;
import com.sda.vendingmachine.storage.Item;

import java.math.BigDecimal;
import java.util.Queue;

public class VendingMachineImpl implements IvendingMachine {


    public Item getItem(int productCode) {
        return null;
    }

    public void payItem(Queue<Coin> amountPayed) {

    }

    public void getChange(BigDecimal amountExpected, BigDecimal amountReceived) {

    }

    public void cancelRequest() {

    }
}
