package org.michaelliu.spring.ioc.annotation.dao;

import org.michaelliu.spring.beans.Account;
import org.springframework.stereotype.Component;

/**
 * Created by michael on 2016/8/2.
 */
@Component
public class AccountDao {

    public Account selectById(Long id) {
        Account account = new Account();
        account.setId(id);
        return account;
    }

}
