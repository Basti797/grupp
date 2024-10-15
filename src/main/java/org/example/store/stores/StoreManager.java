package org.example.store.stores;

import org.example.Menu.CustomerMenu;
import org.example.Menu.IcaMenu;
import org.example.Menu.LidlMenu;
import org.example.Menu.WillysMenu;
import org.example.commands.CommandManager;
import org.example.store.Main;
import org.example.store.stores.impl.Ica;
import org.example.store.stores.impl.Lidl;
import org.example.store.stores.impl.Willys;
import org.example.store.titles.Role;
import org.example.store.titles.impl.*;


public class StoreManager {
    private Role role;
    private Store store;

    private final Main main;
    public StoreManager(Main main){
        this.main = main;
    }

    public void selectStore(String storeSelection) {

        switch (storeSelection) {
            case "lidl":
                store = new Lidl(main);
                main.menu = new LidlMenu(main);
                break;
            case "willys":
                store = new Willys(main);
                main.menu = new WillysMenu(main);
                break;
            case "ica":
                store = new Ica(main);
                main.menu = new IcaMenu(main);
                break;
            default:
                store = new Lidl(main);
                main.menu = new LidlMenu(main);
        }
    }
    public void selectRole(String roleString, String name) {
        switch (roleString.toLowerCase()) {
            case "manager":
                role = new Manager(name);
                break;
            case "cashier":
                role = new Cashier(name);
                break;
            case "customer":
                role = new Customer(name);
                main.menu = new CustomerMenu(main);
                break;
            case "employee":
                role = new Employee(name);
                break;
            case "adminstrator":
                role = new Administrator(name);
                break;
            default:
                role = new Customer(name);
                break;
        }
    }
    public Role getRole() {
        if (role == null) {
            System.out.println("No role selected");
        }

        return this.role;
    }

    public Store getStore() {
        return this.store;
    }
    public void setStore(Store store){
        this.store = store;
    }
}
