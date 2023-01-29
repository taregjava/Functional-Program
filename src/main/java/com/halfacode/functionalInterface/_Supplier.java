package com.halfacode.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {


    public static void main(String[] args) {
        System.out.println(getDBConnectinUrl());
        System.out.println(getDbConnectionSupplier.get());
        System.out.println(getDbConnectionSupplierList.get());
    }

    static String getDBConnectinUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDbConnectionSupplier =()
            -> "jdbc://localhost:5432/users";
    static Supplier<List<String>> getDbConnectionSupplierList =()
            -> List.of("jdbc://localhost:5432/users",
            "jdbc://localhost:5432/users");
}

