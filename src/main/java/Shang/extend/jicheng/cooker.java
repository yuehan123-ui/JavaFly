package Shang.extend.one;

public class cooker extends employee{
    public cooker() {
    }

    public cooker(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
