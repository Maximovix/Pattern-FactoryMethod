package com.company;

public class CreatorCaesar extends Creator {
    @Override
    public Encryption createEncryption() {
        return new Caesar();
    }
}
