package org.example.store.stores;

import org.example.menus.impl.rolemenus.CustomerMenu;
import org.example.menus.impl.rolemenus.ManagerMenu;
import org.example.menus.impl.storemenus.IcaMenu;
import org.example.menus.impl.storemenus.LidlMenu;
import org.example.menus.impl.storemenus.WillysMenu;
import org.example.store.Main;
import org.example.store.stores.impl.Ica;
import org.example.store.stores.impl.Lidl;
import org.example.store.stores.impl.Willys;
import org.example.store.titles.Role;
import org.example.store.titles.impl.*;

import java.util.ArrayList;
import java.util.List;


public class StoreManager {
    private Role role;
    private Store store;
    private List<Store> savedStores = new ArrayList<>();

    private final Main main;
    public StoreManager(Main main){
        this.main = main;
    }

    public void selectStore(String storeSelection) {

        switch (storeSelection) {
            case "lidl":
                for (Store store : savedStores) {
                    if (store instanceof Lidl) {
                        this.store = store;
                        main.menu = new LidlMenu(main);
                        return;
                    }
                }
                store = new Lidl(main);
                main.menu = new LidlMenu(main);
                savedStores.add(store);
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
                main.menu = new ManagerMenu(main);
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
