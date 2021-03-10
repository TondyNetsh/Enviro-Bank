package com.eviro.assessment.grad001.rotondwa.netshimbupfe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SystemDB {
    private static SystemDB systemDB;

    private List<Integer> id = new ArrayList<>();
    private List<String> accountNum = new ArrayList<>();
    private List<BigDecimal> balance = new ArrayList<>();



    private SystemDB(){

    }

    public List<Integer> getId(){
        id.add(101);
        id.add(102);
        id.add(103);
        id.add(103);

        return id;
    }

    public List<String> getAccountNum(){
        return this.accountNum;
    }
    public void setId(){
        this.accountNum.add("1");
        this.accountNum.add("2");
        this.accountNum.add("3");
        this.accountNum.add("4");
    }

    public List<BigDecimal> getBalance(){
        return balance;
    }

    public void setBalance(List<BigDecimal> balance) {
        balance.add(new BigDecimal(2000));
        balance.add(new BigDecimal(5000));
        balance.add(new BigDecimal(1000));
        balance.add(new BigDecimal(5000));

        this.balance = balance;
    }

    public static SystemDB getSystemDB() {
        if(systemDB == null){
            systemDB = new SystemDB();
        }
        return systemDB;
    }
}
