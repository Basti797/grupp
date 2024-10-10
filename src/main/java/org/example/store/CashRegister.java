package org.example.store;

import org.example.store.titles.Cashier;

public class CashRegister extends Role{
    private Cashier cashier = null;

    public CashRegister(Cashier cashier) {
        this.cashier = cashier;
    }
}
