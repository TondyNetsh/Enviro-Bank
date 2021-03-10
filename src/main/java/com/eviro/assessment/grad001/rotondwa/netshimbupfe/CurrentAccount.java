package com.eviro.assessment.grad001.rotondwa.netshimbupfe;

import java.math.BigDecimal;

public class CurrentAccount implements AccountService{
    SystemDB systemDB = SystemDB.getSystemDB();
    BigDecimal balance;

    @Override
    public BigDecimal withdraw(String accountNum, BigDecimal amountToWithdraw) {
        for(int i = 0; i < systemDB.getAccountNum().size(); i++){
            if(accountNum == systemDB.getAccountNum().get(i)){
                if(systemDB.getAccountNum().indexOf(i) == systemDB.getBalance().indexOf(i)){
                    balance = systemDB.getBalance().get(i);
                    balance = balance.subtract(amountToWithdraw);

                }
            }
        }
        return balance;
    }
}
