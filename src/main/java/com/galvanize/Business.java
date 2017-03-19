package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable  {

    private final String name;

    private final List<Address> addresses = new ArrayList<>();

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

}
