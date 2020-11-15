package com.company;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {

    Account bobsAccount = new Account();//"12345" ,0.00, "Bob Brown", "myemail@gmail.com", "0871252606");
		System.out.println((bobsAccount.getAccountNumber()));
		System.out.println(bobsAccount.getBalance());


	bobsAccount.deposit(50.0);
	bobsAccount.withdrawal(100.0);

	bobsAccount.deposit(51.0);
	bobsAccount.withdrawal(100.0);


	Account timsAccount = new Account("Tim", "tim@email.com", "12345");
	System.out.println(timsAccount.getAccountNumber() + "name " + timsAccount.getCustomerName());

	VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getName());

		VipCustomer person2 = new VipCustomer("bob", 2500.00);
		System.out.println(person2.getName());

		VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
		System.out.println(person3.getName());

    }

}
