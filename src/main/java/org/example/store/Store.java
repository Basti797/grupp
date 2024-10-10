package org.example.store;

import org.example.store.titles.Cashier;
import org.example.store.titles.Customer;
import org.example.store.titles.Employee;

import java.util.ArrayList;

public abstract class Store {
    public ArrayList<CashRegister> cashRegister = new ArrayList<>();
    public ArrayList<Employee> employees = new ArrayList<>();

    protected Role role;
    private String storeName;

    public Store(Role role, String storeName) {
        this.role = role;
        this.storeName = storeName;
    }

    public void enter(Role role) {
        if (role instanceof Customer) {
            System.out.println("Welcome to " + storeName + ", " + role.getName());
        }
        if (role instanceof Employee employee) {
            System.out.println("Get to work!");
            employees.add(employee);
        }

        if (role instanceof Cashier cashier) {
           cashRegister.add(new CashRegister(cashier));
        }
    }

}
