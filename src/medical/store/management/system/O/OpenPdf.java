/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medical.store.management.system.O;

import medical.store.management.system.*;
import java.io.File;
import javax.swing.JOptionPane;
import medical.store.management.system.D.Path;

/**
 *
 * @author PRINCE
 */
public class OpenPdf {
   
   
    public static void openById(String bill_id){
        try{
            if((new File(Path.billPath+bill_id+".pdf")).exists()){
           Process p = Runtime
                   .getRuntime()
                   .exec("rundll32 url.dll,FileProtocolHandler " + Path.billPath + bill_id + ".pdf");

        }
            else{
                JOptionPane.showMessageDialog(null, "File does not exist.");
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    }
            public static void main(String args[]){}

    
}
