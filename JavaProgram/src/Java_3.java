import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Java_3 extends JFrame implements ActionListener {
    private ArrayList<JLabel> labels = new ArrayList();
    private JPanel panel = new JPanel();
    private int currentNumber = 0;

    public Java_3() {
        this.setTitle("Ten 레이블 클릭");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(3);
        this.panel.setLayout((LayoutManager)null);

        for(int i = 0; i < 10; ++i) {
            final JLabel label = new JLabel(String.valueOf(i));
            label.setBounds(this.randomPosition(), this.randomPosition(), 20, 20);
            label.setForeground(Color.MAGENTA);
            label.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    Java_3.this.labelClicked(label);
                }
            });
            this.labels.add(label);
            this.panel.add(label);
        }

        this.shuffleLabels();
        this.add(this.panel);
        this.setVisible(true);
    }

    private void labelClicked(JLabel label) {
        int labelNumber = Integer.parseInt(label.getText());
        if (labelNumber == this.currentNumber) {
            this.panel.remove(label);
            this.panel.repaint();
            ++this.currentNumber;
            if (this.currentNumber == 10) {
                JOptionPane.showMessageDialog(this, "성공! 다시 시작합니다.");
                this.resetGame();
            }
        } else {
            JOptionPane.showMessageDialog(this, "잘못된 순서! 다시 시도하세요.");
        }

    }

    private void shuffleLabels() {
        Collections.shuffle(this.labels);
        Iterator var1 = this.labels.iterator();

        while(var1.hasNext()) {
            JLabel label = (JLabel)var1.next();
            label.setLocation(this.randomPosition(), this.randomPosition());
        }

    }

    private void resetGame() {
        this.currentNumber = 0;
        this.shuffleLabels();
        Iterator var1 = this.labels.iterator();

        while(var1.hasNext()) {
            JLabel label = (JLabel)var1.next();
            this.panel.add(label);
        }

        this.panel.repaint();
    }

    private int randomPosition() {
        return (int)(Math.random() * 250.0);
    }

    public static void main(String[] args) {
        new Java_3();
    }

    public void actionPerformed(ActionEvent e) {
    }
}
