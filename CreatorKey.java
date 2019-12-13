package com.company;

public class CreatorKey extends Creator {
    @Override
    public Encryption createEncryption() {
        return new Key();
    }
}
