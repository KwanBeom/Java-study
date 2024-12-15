package com.example.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {
    public static void main(String[] args) {
        try {
            System.out.println(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {

            InetAddress[] addressArray = InetAddress.getAllByName("www.google.com");
            for (InetAddress i : addressArray) {
                System.out.println(i.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
