package com.bellafkih.bankaccountkataapi.controller;

import com.bellafkih.bankaccountkataapi.model.Transaction;
import com.bellafkih.bankaccountkataapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.dsig.TransformService;
import java.util.ArrayList;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/history")
    public ArrayList<Transaction> get_history(){
        return accountService.getHistory();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/deposit")
    public void deposit_amount(@RequestBody Transaction t){
        accountService.depositAmount(t);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/withdrawal")
    public void retrieve_amount(@RequestBody Transaction t){
        accountService.retrieveAmount(t);
    }



}
