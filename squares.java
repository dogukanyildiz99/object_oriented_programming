/*
 *Doğukan YILDIZ - 20360859095
 */
package squares;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author doguk
 */
public class Squares {
    public static void main(String[] args) {
        // Çerçeve sınırlarını belirleme
        JFrame fr = new JFrame();
        fr.setTitle("Yanar&Döner");
        fr.setSize(400,419);
        fr.setLayout(new GridLayout(4,4));
        
        // 4x4 gridi çizme
        for(int i=0; i < 16; i++){
            JLabel grid = new JLabel();
            grid.setBackground(Color.white);
            // sınırları BorderFactory ile çizme
            grid.setBorder(BorderFactory.createLineBorder(Color.black));
            grid.setOpaque(true);
            fr.add(grid);
            fr.setVisible(true);
            
        // Mouse Listener ile renk değişimini ayarlama    
            grid.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseEntered(MouseEvent e) {
                Color black = grid.getBackground();
                grid.setBackground(grid.getForeground());
                grid.setForeground(black);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                Color white = grid.getBackground();
                grid.setBackground(grid.getForeground());
                grid.setForeground(white);
                }
            });
        }       
        // Pencere kapandığında uygulama sona erer
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }    
}
