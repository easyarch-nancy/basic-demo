package initialize;

public class Apple {

    int i=0;
    Apple eatApple(){
        i++;
        return this;
    }
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.eatApple().eatApple();
        System.out.println(apple.i);
    }

}
