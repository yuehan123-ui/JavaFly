package Shang.jigsawGame;

import javax.swing.*;


public class GameJFrame extends JFrame {
    public GameJFrame(){
        initJFrame();
        initJMenuBar();
        initImage();

        this.setVisible(true);
    }

    private void initImage() {
        int number = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel = new JLabel(new ImageIcon("D:\\Javacode\\JavaFly\\image\\animal\\animal1\\"+number+".jpg"));
                jLabel.setBounds(105*j,105*i,105,105);
                this.getContentPane().add(jLabel);
                number++;
            }
        }



        /*this.add(jLabel);*/

    }


    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu funcitonJMeu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reloginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        funcitonJMeu.add(replayItem);
        funcitonJMeu.add(reloginItem);
        funcitonJMeu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(funcitonJMeu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603,680);
        this.setTitle("拼图游戏");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
    }
}
