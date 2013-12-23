
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LENOVO
 */
public class Splash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sleepThread();
       
         java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try 
    { 
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
    } 
    catch(Exception e){ 
    }
    //new YourClass();
                MainFrame frame = new MainFrame();
                 frame.setVisible(true);
                ImageIcon img = new ImageIcon("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\UsersPad\\src\\notepad.jpg");
                 frame.setIconImage(img.getImage());
                 TextLineNumber tln = new TextLineNumber(frame.jTextArea1);
                 frame.getjScrollPane1().setRowHeaderView(tln);
                
            } });
    }
   
     private static void sleepThread() {
        try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException ex)
            {
                // Do something, if there is a exception
                System.out.println(ex.toString());
            }
    }
} 