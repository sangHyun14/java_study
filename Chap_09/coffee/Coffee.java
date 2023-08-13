package Chap_09.coffee;

public class Coffee <T>{
    public Coffee(T name) {
        this.name = name;
    }

    public T name;

    public void ready(){
        System.out.println("커피 준비 완료: "+ name);
    }
}
