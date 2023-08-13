package Chap_09;

import Chap_09.User.User;
import Chap_09.User.VIPUser;
import Chap_09.coffee.*;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("-------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("-------------------");
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호: " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름: "+ c4Name);

       // c4Name = (String) c3.name; ( 실행 불가능 )
        System.out.println("-------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름:" + c6Name);

        System.out.println("-------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<User>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        System.out.println("-------------------");
        orderCoffee("김영철", "아메리카노");
        orderCoffee(36, "라뗴는 말이야");
    }

    public static <T, V> void orderCoffee(T name,V coffee){
        System.out.println(coffee + "커피 준비 완료 :" + name);
    }
}