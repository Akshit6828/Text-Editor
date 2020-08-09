import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Q2 extends Dialog implements ActionListener
{
    Label l1;
    Button b1,b2,b3;
    C1 k;
    Q2(C1 p,String tt,boolean rr)
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
            }
            catch(Exception e1)
            {
            }
     }
     else if(str.equals("Dont Save"))
     {
            this.dispose();
           // k.dispose();
     }
     else if(str.equals("Cancel"))
     {
       this.dispose();  
     }
    }
}