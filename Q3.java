import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Q3 extends Dialog implements ActionListener
{
    Label l1;
    Button b1,b2,b3;
    MainMenu k;
    Q3(MainMenu p,String tt,boolean rr)
    {
        super(p,tt,rr);
        k=p;
        l1= new Label("Do You want to save the Changes");
        b1= new Button("Yes Save");
        b2=new Button("Dont Save");
        b3= new Button("Cancel");
        setLayout(new FlowLayout());
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
       
    }
   
     public void actionPerformed(ActionEvent ae)
   {
     String str=ae.getActionCommand();
     if(str.equals("Yes Save"))
     {
         try{
                k.count=0;
                FileDialog f1= new FileDialog(this,"Save",FileDialog.SAVE);
                f1.setVisible(true);
                FileOutputStream f= new FileOutputStream(f1.getDirectory()+f1.getFile());
                str= k.t1.getText();
                byte b[]=str.getBytes();
                int i;
                for(i=0;i<b.length;i++)
                {
                    f.write(b[i]);
                }
                f.close();
                FileDialog f2= new FileDialog(this,"Open",FileDialog.LOAD);
               f2.setVisible(true);
               FileInputStream fi= new FileInputStream(f1.getDirectory()+f1.getFile());
               int t= fi.available();//returns size of the file
               int ik;
               String str1=" ";
               for(ik=1;ik<=t;ik++)
               {
                   char c= (char)fi.read();
                   str1= str1+c;
               }
               k.t1.setText(str1);
               k.setTitle(f2.getDirectory()+f2.getFile());
               f.close();
            }
            catch(Exception e1)
            {
            }
            this.dispose();
     }
     else if(str.equals("Dont Save"))
     {
            //this.dispose();
            //k.dispose();
            //k.t1.setText("");
            this.setTitle("Untitled");
            k.t1.setText(" ");
            k.count=0;
            try{
            FileDialog f2= new FileDialog(this,"Open",FileDialog.LOAD);
               f2.setVisible(true);
               FileInputStream fi= new FileInputStream(f2.getDirectory()+f2.getFile());
               int t= fi.available();//returns size of the file
               int ik;
               String str1=" ";
               for(ik=1;ik<=t;ik++)
               {
                   char c= (char)fi.read();
                   str1= str1+c;
               }
               k.t1.setText(str1);
               k.setTitle(f2.getDirectory()+f2.getFile());
               fi.close();
               this.dispose();
            }
            catch(Exception e1)
            {
            }
            
     }
     else if(str.equals("Cancel"))
     {
       this.dispose();  
     }
    }
}