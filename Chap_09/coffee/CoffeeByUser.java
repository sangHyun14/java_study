package Chap_09.coffee;

import Chap_09.User.User;

public class CoffeeByUser <T extends User> {
    public T User;

    public CoffeeByUser(T user) {
        this.User = user;
    }
    public void ready(){
        System.out.println("커피 준비 완료: "+ User.name);
        User.addPoint();
    }
}
