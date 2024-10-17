package org.example.store.titles;

import org.example.menus.impl.rolemenus.AdministratorMenu;
import org.example.menus.impl.rolemenus.CustomerMenu;
import org.example.menus.impl.rolemenus.EmployeeMenu;
import org.example.menus.impl.rolemenus.ManagerMenu;
import org.example.store.Main;
import org.example.store.titles.impl.*;

import java.util.ArrayList;

public class RoleManager {

    private Role role;
    private ArrayList<Role> savedPeople = new ArrayList<>();

    private Main main;

    public RoleManager(Main main) {
        this.main = main;
    }

    public void selectRole(String roleString, String name) {
        switch (roleString.toLowerCase()) {
            case "manager":
                role = new Manager(name);
                savedPeople.add(role);
                main.menu = new ManagerMenu(main);
                break;
            case "cashier":
                role = new Cashier(name);
                savedPeople.add(role);
                break;
            case "customer":
                role = new Customer(name);
                main.menu = new CustomerMenu(main);
                savedPeople.add(role);
                break;
            case "employee":
                role = new Employee(name);
                main.menu = new EmployeeMenu(main);
                savedPeople.add(role);
                break;
            case "adminstrator":
                role = new Administrator(name);
                main.menu = new AdministratorMenu(main);
                savedPeople.add(role);
                break;
            default:
                role = new Customer(name);
                savedPeople.add(role);
                break;
        }
    }


    public void setRole(Role role) {
        this.role = role;
        if (role instanceof Administrator) {
            //todo
            return;
        } else if (role instanceof Manager) {
            main.menu = new ManagerMenu(main);
            return;
        } else if (role instanceof Employee) {
            main.menu = new EmployeeMenu(main);
            return;
        } else if (role instanceof Customer) {
            main.menu = new CustomerMenu(main);
            return;
        }
    }

    public Role getRole() {
        if (role == null) {
            System.out.println("No role selected");
        }

        return this.role;
    }

    public ArrayList<Role> getSavedPeople() {
        return savedPeople;
    }
}
