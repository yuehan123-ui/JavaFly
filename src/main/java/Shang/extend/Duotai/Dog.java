package Shang.extend.two;

import java.util.zip.GZIPOutputStream;

public class Dog extends Animal{
    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    @Override
    public void eat(String something) {
        System.out.println("狗吃骨头");
    }

    public void lookHome(){
        System.out.println("狗kanjia");
    }
}
