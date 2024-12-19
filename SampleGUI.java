import java.awt.*;
import java.awt.event.*;

public class SampleGUI {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple AWT Example");   //110360102
        Label label = new Label("Press the button!");
        Button button = new Button("Click Me");

        // 設定按鈕的事件處理
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // 設定佈局
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);

        // 設定視窗大小和關閉事件
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
