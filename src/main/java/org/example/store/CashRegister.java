package org.example.store;

import org.example.store.titles.impl.Cashier;

public class CashRegister {
    private Cashier cashier = null;

    public CashRegister(Cashier cashier) {
        this.cashier = cashier;
    }
}
