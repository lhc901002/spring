package org.michaelliu.spring.service;

import org.michaelliu.spring.beans.dto.Transaction;

import javax.jws.WebService;

/**
 * Created by Michael on 8/10/16.
 */
@WebService
public interface TransactionService {

    boolean saveInSameBank(Long fromAccountId, Long toAccountId, Transaction transaction) throws Exception;

    boolean saveInDifferentBank(Long fromAccountId, Long toAccountId, Transaction transaction) throws Exception;

}
