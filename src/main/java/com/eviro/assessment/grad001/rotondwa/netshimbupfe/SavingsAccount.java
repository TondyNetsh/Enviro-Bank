package com.eviro.assessment.grad001.rotondwa.netshimbupfe;

import java.math.BigDecimal;

public abstract class SavingsAccount implements AccountService {
    SystemDB systemDB = SystemDB.getSystemDB();
    BigDecimal balance;

    @Override
    public BigDecimal withdraw(String accountNum, BigDecimal amountToWithdraw) {
        for(int i = 0; i < systemDB.getAccountNum().size(); i++){
            if(accountNum == systemDB.getAccountNum().get(i)){
                if(systemDB.getAccountNum().indexOf(i) == systemDB.getBalance().indexOf(i)){
                    balance = systemDB.getBalance().get(i).subtract(amountToWithdraw);
                    break;
                }
            }
            else{
                System.out.println("Account not found.");
                break;
            }
        }
        return balance;
    }
}
