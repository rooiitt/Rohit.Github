package com.kodewala.interfacetype.functionalinterface;

/*
 * Functional -> Interface which got only one abstract method (SAM)--> Single Abstract Method 
 * @FuctionalInterface (Optional) -> with this we can only have the one abstract method. We use to achieve the lambda expression
 * Lambda Functionality  -> Implement Function/ Method without name. 
 */
@FunctionalInterface

interface IAccountMngmt {
	void accountmngmt();
}

/*
 * IMPORTANT--> [interface IAccount extends IAccountMngmt]--> there will be two abstract method --> One from Account and second
 * from AccountMngmt we can verify using through @FunctionalInterface n' also becomes Normal Interface 
 */

@FunctionalInterface //Use to know how many abstract are there, useful if we wrote wrong condition.

public interface IAccount{
	String openAccount(String name, String adress, int amount); // Only one abstract method - SAM

	default void addBeni() { // default method (Optional) 

	}

}
