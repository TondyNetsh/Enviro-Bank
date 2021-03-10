package com.eviro.assessment.grad001.rotondwa.netshimbupfe;

import java.math.BigDecimal;

public interface AccountService {
    BigDecimal withdraw(String accountNum, BigDecimal amountToWithdraw);
}
