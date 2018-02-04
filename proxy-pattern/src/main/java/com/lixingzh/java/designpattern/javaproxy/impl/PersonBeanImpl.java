package com.lixingzh.java.designpattern.javaproxy.impl;

import com.lixingzh.java.designpattern.javaproxy.PersonBean;

public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    int hotOrNotRating;
    int ratingCount;

    public PersonBeanImpl(String name, String gender, String interests, int hotOrNotRating) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.hotOrNotRating = hotOrNotRating;
        ratingCount = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public int getHotOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return hotOrNotRating / ratingCount;
    }

    @Override
    public void setHotOrNotRating(int hotOrNotRating) {
        this.hotOrNotRating += hotOrNotRating;
        ++ratingCount;
    }
}
