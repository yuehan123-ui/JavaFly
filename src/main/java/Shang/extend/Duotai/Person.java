package Shang.extend.two;

public class Person {
    private String name;
    public int age;

    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void keepAnimal(Person person,Animal a,String somenthing){
        if (a instanceof Dog dog){
            System.out.println("年龄为"+getAge()+"的"+getName()+"养了一只"+dog.getColor()+"颜色的狗，抱住"+somenthing+"猛吃");
        }else if(a instanceof Cat cat){
            System.out.println("年龄为"+getAge()+"的"+getName()+"养了一只"+cat.getColor()+"颜色的猫，抱住"+somenthing+"猛吃");
        }else System.out.println("没有这种动物");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
