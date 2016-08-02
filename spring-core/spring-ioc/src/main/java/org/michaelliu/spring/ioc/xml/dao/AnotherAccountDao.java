package org.michaelliu.spring.ioc.xml.dao;

import org.michaelliu.spring.beans.Account;

/**
 * Created by michael on 2016/8/2.
 */
public class AnotherAccountDao {

    public Account selectByName(String name) {
        Account account = new Account();
        account.setName(name);
        return account;
    }

}
