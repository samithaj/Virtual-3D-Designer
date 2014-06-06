/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.UIManager;


/**
 *
 * @author Amila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Enumeration enu = CommPortIdentifier.getPortIdentifiers();
//        while(enu.hasMoreElements()){
//            CommPortIdentifier cpid = (CommPortIdentifier)enu.nextElement();
//            System.out.println(cpid.getName());
//        }

//        try {
//            CommPortIdentifier cpid = CommPortIdentifier.getPortIdentifier("COM2");
//            SerialPort sp = (SerialPort)cpid.open("Amila",2000);
//            InputStream is = sp.getInputStream();
//            while(true){
//                if(is.available()>0){
//                    System.out.print((char)is.read());
//                }
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception e) {
            System.out.println(e);
        }



        new Thread(new Runnable() {

            @Override
            public void run() {
                new Settings().setVisible(true);
            }
        }).start();

        new Loading().setVisible(true);



    }
}
