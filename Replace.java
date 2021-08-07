import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Replace extends Dialog implements ActionListener
{
    String strf=" ",strr=" ",strg=" ",str1=" ",str2=" ",str3=" ";
    Button b1,b2,b3,b4;
    TextField t1,t2;
    Label l1,l2;
    MainMenu k;
    int t=-1;
    int r=-1;
    public Replace(MainMenu p,String tt,boolean rr)
    {
        super(p,tt,rr);
        k=p;
        setLayout(new FlowLayout());
        b1= new Button("Find Next");
        b2= new Button("Replace");
        b3= new Button("Replace All");
        b4= new Button("Cancel");
        l1= new Label("Find Text");
        l2= new Label("Replace With");
        t1=new TextField(15);
        t2= new TextField(15);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str= ae.getActionCommand();
        if(str.equals("Find Next"))
        {
          str1= k.t1.getText();
          str2= t1.getText();
          t= str1.indexOf(str2,t+1);
          if(t<0)
          {
          }
          else
          {
              k.t1.select(t,t+str2.length());
              k.setVisible(true);
          }
        }
        else if(str.equals("Replace"))
        {
            str1=k.t1.getText();
            str3= k.t1.getSelectedText();
            strr=t2.getText();
            int i=str1.indexOf(str3);
            k.t1.replaceRange(strr, i,i+str3.length());
        }
        else if(str.equals("Replace All"))
        {
            str1=k.t1.getText();
            strr=t1.getText();
            int strt=str1.indexOf(strr);
                   
            while(strt>=0)
            {
               
                    //String got= k.t1.getSelectedText();
                    k.t1.replaceRange(t2.getText(), strt,strt+strr.length());
                    str1=k.t1.getText();
                    strt=str1.indexOf(strr);
            }
             
        }
        else if(str.equals("Cancel"))
        {
           this.dispose();
        }
    }
}
          
    