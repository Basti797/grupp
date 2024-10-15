package org.example.store.stores;

import org.example.store.CashRegister;
import org.example.store.titles.Role;
import org.example.store.titles.impl.Cashier;
import org.example.store.titles.impl.Customer;
import org.example.store.titles.impl.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Store {
    protected Map<String, Integer> storeItems = new HashMap<>();
    public ArrayList<CashRegister> cashRegister = new ArrayList<>();
    public ArrayList<Employee> employees = new ArrayList<>();

    protected Role role;
    private String storeName;

    public Store(Role role, String storeName) {
        this.role = role;
        this.storeName = storeName;
        this.populateItems();
    }

    protected void populateItems() {
        storeItems.put("default", 2000);
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

    public Map<String, Integer> getStoreItems() {
        return storeItems;
    }
}
