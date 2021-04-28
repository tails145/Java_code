import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame implements ActionListener {

    private final String title;
    private String button = "";//底部显示
    private int sum = 0;//和
    private int addCount = -1;//上一次出现+的位置

    public MyFrame(String title) {
        super(title);
        this.title = title;
    }

    protected TextField tf1 = new TextField(35);
    protected TextField tf2 = new TextField(35);
    public void init() {
        this.add(tf1,BorderLayout.NORTH);
        this.add(tf2,BorderLayout.SOUTH);
        Panel p3 = new Panel();
        p3.setLayout(new GridLayout(3,2,4,4));
        String[] name = {"1","2","3","4","+","="};
        Button b[] = new Button[6];
        for(int i = 0;i < 6;i++) {
            b[i] = new Button(name[i]);
            p3.add(b[i]);
            b[i].addActionListener(this);
        }
        this.add(p3);
        this.pack();
        this.setVisible(true);
    }

    private void renew() {
        button = "";
        sum = 0;
        addCount = -1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button += e.getActionCommand();
        if(e.getActionCommand() == "+") {
            if(button.length() == 1) {
                tf1.setText("输入错误");
                renew();
                return;
            }
            sum += Integer.parseInt(button.substring(addCount + 1,button.length() - 1));
            addCount = button.lastIndexOf("+");
        }
        if(e.getActionCommand() == "=") {
            if(button.length() == 1) {
                tf1.setText("输入错误");
                renew();
                return;
            }
            sum += Integer.parseInt(button.substring(addCount + 1,button.length() - 1));
            button += String.valueOf(sum);
            tf1.setText(String.valueOf(sum));
            tf2.setText(button);
            renew();
            return;
        }
        tf1.setText(e.getActionCommand());
        tf2.setText(button);
    }

    public static void main(String[] args) {
        new MyFrame("计算器").init();
    }

}
