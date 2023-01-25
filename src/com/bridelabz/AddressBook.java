package com.bridelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contacts> contactList = new ArrayList<>();

    public void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.next();
        System.out.println("Enter the age: ");
        String age = sc.next();
        System.out.println("Enter the phoneNumber: ");
        String phoneNumber = sc.next();
        System.out.println("Enter the city: ");
        String city = sc.next();
        System.out.println("Enter the state: ");
        String state = sc.next();
        Contacts contacts = new Contacts();
        contacts.setName(name);
        contacts.setAge(age);
        contacts.setPhoneNumber(phoneNumber);
        contacts.setCity(city);
        contacts.setState(state);
        contactList.add(contacts);
    }
    public void displayContact(){
        System.out.println(contactList);
    }
}
