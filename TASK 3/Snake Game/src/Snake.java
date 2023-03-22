import javax.swing.*;

public class Snake extends JFrame{

    Snake(){
        super("Snake Game");
        add(new Board());
        pack();

        setLocationRelativeTo(null);
        setResizable(true);
    }

    public static void main(String[] args){
        new Snake().setVisible(true);
    }
}