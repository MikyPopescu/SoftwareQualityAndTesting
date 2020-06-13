package cts.patterns.miky.client;

import cts.patterns.miky.exceptions.ExceptionCreateSingletonConnection;
import cts.patterns.miky.implementation.Singleton;
import cts.patterns.miky.implementation.SingletonConnection;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstanta();
        Singleton singleton2 = Singleton.getInstanta();


        try {
            //singleton connection
            SingletonConnection connection1 = SingletonConnection.getInstance("miky", "miky123");
            System.out.println(connection1);

            //another connection
            SingletonConnection connection2 = SingletonConnection.getInstance("mikypopescu", "miky123");

        } catch (ExceptionCreateSingletonConnection e) {
            System.out.println("You tried making another connection!");
        }

    }


}
