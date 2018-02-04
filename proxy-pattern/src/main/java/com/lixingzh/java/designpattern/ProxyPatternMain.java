package com.lixingzh.java.designpattern;

import com.lixingzh.java.designpattern.javaproxy.OwnerInvocationHandler;
import com.lixingzh.java.designpattern.javaproxy.PersonBean;
import com.lixingzh.java.designpattern.javaproxy.impl.PersonBeanImpl;

import java.lang.reflect.Proxy;

public class ProxyPatternMain {
    public static void main(String[] args) {
        ProxyPatternMain test = new ProxyPatternMain();
        test.drive();
    }

    public ProxyPatternMain() {
        super();
    }

    private void drive() {
        PersonBean joe = new PersonBeanImpl("joe joe", "male", "be strong", 8);

        PersonBean proxyPerson = getOwnerProxy(joe);
        try {
            proxyPerson.setHotOrNotRating(19);
        } catch (Exception e) {
            System.out.println("Can't set rating from here");
        }

        proxyPerson.setInterests("be a man");
        System.out.println(String.format(" Name: %s \n Gender: %s \n Interests: %s", proxyPerson.getName(), proxyPerson.getGender(), proxyPerson.getInterests()));

    }

    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }
}
