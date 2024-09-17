/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
/**
 *
 * @author Omar
 */
public class method extends objectt {
String metercode=" ",namme=" ",email=" ",address=" ",slash="----------------------------",payment=" ",payment2=" ",date=" ",taxes="";
    /**
     * Creates new form querrybyaddress
     * @param metercode
     * @param jTextArea1
     * @return 
     */
public String[] file2 (String metercode,JTextArea jTextArea1,String arr[] )
        {
           String b[]=null;
    try {
        BufferedReader ll=file_read(collect_payments); 
        //FileReader ff;
         
        /*ff = new FileReader("D:\\importan papers\\pl2\\section\\operator\\build\\classes\\operator\\new and old\\collect payment.txt");
    
               BufferedReader ll=new BufferedReader(ff);
       */
                String struct2;
            System.out.println("read");
                while((struct2=ll.readLine())!=null)
                {
                    System.out.println("hhh");
                    if(struct2.contains((metercode.trim())))
                    {
                        System.out.println("found 2");
                        //String n=fn.nextLine();
                         b=struct2.split("[|]");
                        payment=b[1];
                        System.out.println(payment);
                        payment2=b[2];
                        taxes=b[3];
                        date=b[4];
                  
                        String title="\t\tINVOICE";
                        String s=title+"\n\nDate of payment:"+date+"\ncustomer name: "+arr[1]+"\ncustomer address :"+arr[3]+"\ncustomer country:egypt\ncustomer email :"+arr[2]+"\n"+slash+"\nmeter code :"+metercode+"\n reading :"+payment+"\n taxes:"+taxes+"\n total payment:"+payment2+"\n"+slash+slash+slash+"\n\n";
                        file_write(querry_address,s,true);
               // FileReader reader=new FileReader("D:\\importan papers\\pl2\\section\\operator\\build\\classes\\operator\\new and old\\querry_address.txt");
                    BufferedReader br=file_read(querry_address);
                            //new BufferedReader(reader);
                    jTextArea1.read(br,null);
                    br.close();
                
                    }}
               
                ll.close();
                } catch (FileNotFoundException ex) {
        Logger.getLogger(byaddress.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(byaddress.class.getName()).log(Level.SEVERE, null, ex);
    }
    return b;
 
        }
 public void removeRecordFile(String file,String remove,int pos,String deli) throws IOException {
       String tempfile="D:\\importan papers\\pl2\\section\\operator\\build\\classes\\operator\\new and old\\temp.txt";
       File oldfile= new File(file);
       File newfile= new File(tempfile);
       String r;
       String struct[];
       try{
           FileWriter fw=new FileWriter(tempfile,true);
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter pw=new PrintWriter(bw);
           FileReader fr=new FileReader(file);
           BufferedReader br = new BufferedReader(fr);
           while((r=br.readLine())!=null){
               struct=r.split("[|]");
               if(!struct[pos].equals(remove)){
                   pw.println(r);
               }
           }

           pw.flush();
           pw.close();
           fr.close();
           br.close();
           fw.close();
           bw.close();
           oldfile.delete();
           File d=new File(file);
           newfile.renameTo(d);
       }
        catch(Exception ex){
                   
                   }
       }
 public void removeRecordFile1(String file,String remove,int pos,String deli) throws IOException {
       String tempfile="D:\\importan papers\\pl2\\section\\operator\\build\\classes\\operator\\new and old\\temp1.txt";
       File oldfile= new File(file);
       File newfile= new File(tempfile);
       String r;
       String struct[];
       try{
           FileWriter fw=new FileWriter(tempfile,true);
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter pw=new PrintWriter(bw);
           FileReader fr=new FileReader(file);
           BufferedReader br = new BufferedReader(fr);
           while((r=br.readLine())!=null){
               struct=r.split("[|]");
               if(!struct[pos].equals(remove)){
                   pw.println(r);
               }
           }

           pw.flush();
           pw.close();
           fr.close();
           br.close();
           fw.close();
           bw.close();
           oldfile.delete();
           File d=new File(file);
           newfile.renameTo(d);
       }
        catch(Exception ex){
                   
                   }
       }
    private  Scanner x;
     public  void updateRecordFile(String file,String replace,String newmetercode,String newname,String newemail,String newaddress,String active) throws IOException {
       String tempfile="D:\\importan papers\\pl2\\section\\operator\\build\\classes\\operator\\new and old\\temp9.txt";
       File oldfile= new File(file);
       File newfile= new File(tempfile);
       String metercode,name,email,address;

       try{
           FileWriter fw=new FileWriter(tempfile,true);
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter pw=new PrintWriter(bw);
           x=new Scanner(new File(file));

while (x.hasNext())
        {
            String line = x.nextLine();
            String[] tokens = line.split("[|]");
            metercode=tokens[0];
            name=tokens[1];
            email=tokens[2];
            address=tokens[3];
            active=tokens[4];
               if(metercode.trim().equals(replace.trim())){
                   pw.println(newmetercode+" |"+newname+"|"+newemail+"|"+newaddress+"|"+active);
               }
                else{
               pw.print(metercode+"|"+name+"|"+email+"|"+address+"|"+active+"\n");
           }   
           
        }

           x.close();
           pw.flush();
           pw.close();
           fw.close();
           bw.close();
           oldfile.delete();
           File d=new File(file);
           newfile.renameTo(d);
       }
        catch(Exception ex){
                   
                   }
     }
      public  void updateRecordFile1(String file,String replace,String newmetercode,String newname,String newemail,String newaddress,String active) throws IOException {
       String tempfile="D:\\importan papers\\pl2\\section\\operator\\build\\classes\\operator\\new and old\\temp7.txt";
       File oldfile= new File(file);
       File newfile= new File(tempfile);
       String metercode,name,email,address;

       try{
           FileWriter fw=new FileWriter(tempfile,true);
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter pw=new PrintWriter(bw);
           x=new Scanner(new File(file));

while (x.hasNext())
        {
            String line = x.nextLine();
            String[] tokens = line.split("[|]");
            metercode=tokens[0];
            name=tokens[1];
            email=tokens[2];
            address=tokens[3];
            active=tokens[4];
               if(metercode.trim().equals(replace.trim())){
                   pw.println(newmetercode+"|"+active);
               }
                else{
               pw.print(metercode+"|"+active+"\n");
           }   
           
        }

           x.close();
           pw.flush();
           pw.close();
           fw.close();
           bw.close();
           oldfile.delete();
           File d=new File(file);
           newfile.renameTo(d);
       }
        catch(Exception ex){
                   
                   }
     }

       public void  stop(String inputFilee,String metercode){
    FileReader ff;
    
      try {
          
          ff = new FileReader(inputFilee);
           BufferedReader br =new BufferedReader(ff);
            String s;
             String totalStr="";
               System.out.println("read");
        while ((s = br.readLine()) != null) {
            if( s.contains(metercode)){
                if(!s.contains("unactive"))
            s=s.replace("active", "unactive");
        }
            totalStr+=s+"\n";
        }  
        
        FileWriter fw = new FileWriter(inputFilee);
    fw.write( totalStr+"\n");
    fw.close();
 }
   catch (IOException e) {
          System.out.println("An error occurred.");
      
}}
       public double consumptionStatistics(String region) {
    double sumreading=0;
    String struct;
    String s[];
    double o,average;
    int count=0;
    FileReader fr;
    try {
        
        BufferedReader bb=file_read(readings);
     //   fr = new FileReader("D:\\importan papers\\pl2\\section\\operator\\build\\classes\\operator\\new and old\\readings.txt");
      //      BufferedReader bb=new BufferedReader(fr);
            
            
            while((struct=bb.readLine())!=null){
                s=struct.split("[|]");
                if(s[0].equals(region)){
                    o=Double.parseDouble(s[1]);
                    sumreading+=o;
                    count++;
                }
}
            }
    catch(Exception e){
        
    }
    average=sumreading/count;
            return average;
}
    
}
