package com.bridelabz;

import java.util.Scanner;

public class AddressBookMain {

    static void choose(AddressBook addressBook){
        Scanner sc = new Scanner(System.in);
        int chooseNumber;
        do {
            System.out.println("Enter the number: \n1:- add Contact \n2:- Display Contact \n3:- exit");
            chooseNumber = sc.nextInt();
            switch (chooseNumber){
                case 1:
                    System.out.println("Add Contact");
                    addressBook.addContact();
                    break;
                case 2:
                    System.out.println("Display Contact");
                    addressBook.displayContact();
                    break;
                case 3:
                    System.out.println("exit");
                    break;
            }
        } while (chooseNumber != 3);
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        choose(addressBook);
    }
}
