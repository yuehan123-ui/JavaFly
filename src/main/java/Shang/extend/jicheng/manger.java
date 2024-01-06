package Shang.extend.one;

public class manger extends employee{
    private double mangerMoney;

    public manger() {

    }

    public manger(String id, String name, double money, double mangerMoney) {
        super(id, name, money);
        this.mangerMoney = mangerMoney;
    }

    public double getMangerMoney() {
        return mangerMoney;
    }

    public void setMangerMoney(double mangerMoney) {
        this.mangerMoney = mangerMoney;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
