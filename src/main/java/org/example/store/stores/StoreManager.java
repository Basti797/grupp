package org.example.store.stores;

import org.example.menus.impl.storemenus.IcaMenu;
import org.example.menus.impl.storemenus.LidlMenu;
import org.example.menus.impl.storemenus.WillysMenu;
import org.example.store.Main;
import org.example.store.stores.impl.Ica;
import org.example.store.stores.impl.Lidl;
import org.example.store.stores.impl.Willys;

import java.util.ArrayList;
import java.util.List;


public class StoreManager {
    private Store store;
    private List<Store> savedStores = new ArrayList<>();

    private final Main main;

    public StoreManager(Main main) {
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
                for (Store store : savedStores) {
                    if (store instanceof Willys) {
                        this.store = store;
                        main.menu = new WillysMenu(main);
                        return;
                    }
                }
                store = new Willys(main);
                main.menu = new WillysMenu(main);
                savedStores.add(store);
                break;
            case "ica":
                for (Store store : savedStores) {
                    if (store instanceof Ica) {
                        this.store = store;
                        main.menu = new IcaMenu(main);
                        return;
                    }
                }
                store = new Ica(main);
                main.menu = new IcaMenu(main);
                savedStores.add(store);
                break;
            default:
//                for (Store store : savedStores) {
//                    if (store instanceof Lidl) {
//                        this.store = store;
//                        main.menu = new LidlMenu(main);
//                        return;
//                    }
//                }
//                store = new Lidl(main);
//                main.menu = new LidlMenu(main);
//                savedStores.add(store);
        }
    }

    public Store getStore() {
        return this.store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
