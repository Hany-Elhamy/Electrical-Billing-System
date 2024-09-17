
package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class objectt {
   String collect_payments="D:\\importan papers\\pl2\\section\\finalll\\files\\collect payment.txt";
   String complaints="D:\\importan papers\\pl2\\section\\finalll\\files\\complaints.txt";
   String info="D:\\importan papers\\pl2\\section\\finalll\\files\\info.txt";
   String invoice="D:\\importan papers\\pl2\\section\\finalll\\files\\invoice.txt";
   String meter_code="D:\\importan papers\\pl2\\section\\finalll\\files\\meter codes.txt";
   //String payment="D:\\importan papers\\pl2\\section\\finalll\\files\\payment.txt";
   String payments="D:\\importan papers\\pl2\\section\\finalll\\files\\payments.txt";
   String querry_address="D:\\importan papers\\pl2\\section\\finalll\\files\\querry_address.txt";
   String readings="D:\\importan papers\\pl2\\section\\finalll\\files\\readings.txt";
   String tarrif="D:\\importan papers\\pl2\\section\\finalll\\files\\tarrif.txt";
    String real="D:\\importan papers\\pl2\\section\\finalll\\files\\real.txt";
   String [] arr;
    public void file_write(String path,String text,boolean check)  
    {
        if (check=true)
        {
            FileWriter fw = null;
            try {
                fw = new FileWriter(path,true);
                fw.write(text);
                fw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(objectt.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null,"I/O error occured" ,"error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }
    
    public void file_write(String path,String text) 
    {
       
        FileWriter fw;
       try {
           fw = new FileWriter(path);
           fw.write(text);
                fw.close();
       } catch (IOException ex) {
           Logger.getLogger(objectt.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"I/O error occured" ,"error", JOptionPane.ERROR_MESSAGE);
       }
                
               
           
    }
   
    public String [] querry (String path,String condition) 
    {
   
     try{
         FileReader fr=new FileReader(path);
         BufferedReader br=new BufferedReader(fr);
         String struct;
         while((struct=br.readLine())!=null)
         {
             if(struct.contains(condition))
             {
                 arr=struct.split("[|]");
                 
             }
             else{
                 
}
     }}
     catch (FileNotFoundException ex) {
            Logger.getLogger(objectt.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"the file does not exist" ,"error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
           Logger.getLogger(objectt.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"I/O error occured" ,"error", JOptionPane.ERROR_MESSAGE);
       }
        
  return arr;
    }
    public BufferedReader file_read(String path) throws IOException
    {
        
        FileReader fr=new FileReader(path);
        BufferedReader br=new BufferedReader(fr);
       return br;
    }
 public static void main(String[] args){

}
}