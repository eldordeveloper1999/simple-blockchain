package org.example;

import java.security.PublicKey;
import java.util.ArrayList;

public class Transaction {

    public String transactionId; //this is also the hash of the transaction
    public PublicKey sender; //senders address/public key
    public PublicKey recipient; //Recipients address/public key
    public float value;
    public byte[] signature; //this is to prevent anybody else from spending funds in our wallet.

//    public ArrayList<TransactionInput>



}
