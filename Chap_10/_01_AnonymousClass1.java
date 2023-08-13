package Chap_10;

import Chap_09.coffee.Coffee;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        //익명 클래스
        Coffee1 c1 = new Coffee1();
        c1.order("아메리카노");

        System.out.println("--------------");

        Coffee1 c2 = new Coffee1();
        c2.order("라뗴");
        System.out.println("---------------------");

        Coffee1 specialCoffee = new Coffee1(){
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크 내마음");
            }

            @Override
            public void returnTray() {
                System.out.println("(귓속말) 씨발 내가 치울꼐 ");
            }
        };
        specialCoffee.order("바닐라라뗴");
        specialCoffee.returnTray();
    }
}
class Coffee1{
    public void order(String coffee){
        System.out.println("주문하신 " + coffee + " 나왔습니다");
    }

    public void returnTray(){
        System.out.println("커피 반납이 완료됬다.");
    }
}

