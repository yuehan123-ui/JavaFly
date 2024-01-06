package Shang.extend.one;

public class employee {
    private String id;
    private String name;
    private double money;


    public employee() {
    }

    public employee(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public void eat(){
        System.out.println("吃米饭");
    }
    public void work(){
        System.out.println("员工在工作");
    }
    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "employee{id = " + id + ", name = " + name + ", money = " + money + "}";
    }
}
