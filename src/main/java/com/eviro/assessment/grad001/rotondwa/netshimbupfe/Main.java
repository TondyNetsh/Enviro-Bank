package com.eviro.assessment.grad001.rotondwa.netshimbupfe;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SystemDB systemDB = SystemDB.getSystemDB();
        BigDecimal balance = null;
        SavingsAccount savingsAccount = null;

        try {
            System.out.println("Enter account number to withdraw from: ");
            String accountNum = sc.nextLine();
            System.out.println("Enter amount to withdraw: ");
            BigDecimal amountToWithdraw = sc.nextBigDecimal();

            for(int i = 0; i < systemDB.getAccountNum().size(); i++) {

                if(systemDB.getAccountNum().get(i) == accountNum){
                    balance = savingsAccount.withdraw(accountNum,amountToWithdraw);
                    System.out.println("Acount Number: " + accountNum);
                    System.out.println("Acount ID: " + systemDB.getId().get(i));
                    System.out.println("Balance: R" + systemDB.getBalance());
                    break;
                }
            }
        }

        catch (Exception e){
            System.out.println("Error occured: " + e.getMessage());
        }
    }
}
