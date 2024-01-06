package Shang.extend.two;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("老王",30);
        Person person2 = new Person("老李",25);

        Animal dog = new Dog(2,"黑");
        Animal cat = new Cat(3,"灰");

        person1.keepAnimal(person1,dog,"骨头");
        person2.keepAnimal(person2,cat,"小鱼干");
    }
}
