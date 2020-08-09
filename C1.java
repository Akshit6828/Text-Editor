import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
class C1 extends Frame implements ActionListener,KeyListener
{
    MenuBar m;
    Menu m1,m2,m3,m4,m5;
    MenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16;
    TextArea t1;
    String undo=" ",str10=" ",str11=" ";
    int final_size=0;
    int count=0;
    public C1()
    {   m= new MenuBar();
        m1= new Menu("File");
        m2= new Menu("Edit");
        m3= new Menu("Tools");
        m4= new Menu("Format");
        m5= new Menu("Help");
        i1= new MenuItem("New");
        i2= new MenuItem("Open");
        i3= new MenuItem("Save");
        i4= new MenuItem("SaveAs");
        i5= new MenuItem("Exit");
        i6= new MenuItem("Cut");
        i7= new MenuItem("Copy");
        i8= new MenuItem("Paste");
        i9= new MenuItem("Delete");
        i10= new MenuItem("SelectAll");
        i11= new MenuItem("Undo");
        i12= new MenuItem("Find");
        i13= new MenuItem("Replace");
        i14= new MenuItem("Font");
        i15= new MenuItem("View Help");
        i16= new MenuItem("About Notepad");
        t1= new TextArea();
        setTitle("Untitled");
        setMenuBar(m);
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        m.add(m5);
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        m1.add(i5);
        m2.add(i6);
        m2.add(i7);
        m2.add(i8);
        m2.add(i9);
        m2.add(i10);
        m2.add(i11);
        m3.add(i12);
        m3.add(i13);
        m4.add(i14);
        m5.add(i15);
        m5.add(i16);
        add(t1);
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
        i8.addActionListener(this);
        i9.addActionListener(this);
        i10.addActionListener(this);
        i11.addActionListener(this);
        i12.addActionListener(this);
        i13.addActionListener(this);
        i14.addActionListener(this);
        i15.addActionListener(this);
        i16.addActionListener(this);
        t1.addKeyListener(this);
    }
     public void keyPressed(KeyEvent ke)
    {
      count=1;
    }
    public void keyReleased(KeyEvent ke)
    { count=1;}
    public void keyTyped(KeyEvent ke)
    { count=1;}
    
    
    public void actionPerformed(ActionEvent ae)
    {
        String str= ae.getActionCommand();
        if(str.equals("New"))
        {
            if(count==1)
            {
                Q1 q = new Q1(this,"Notepad",false);
                q.setSize(200,250);
                q.setVisible(true);
              
 }
            else if(count==0)
            {
            this.setTitle("Untitled");
             t1.setText(" ");
                
            }
            
        }
        else if(str.equals("Save"))
        {
           
            
            try{
                String head=this.getTitle();
                if(head.equals("Untitled")||count==1)
                {
                FileDialog f1= new FileDialog(this,"Save",FileDialog.SAVE);
              
                f1.setVisible(true);
                FileOutputStream f= new FileOutputStream(f1.getDirectory()+f1.getFile());
                str= t1.getText();
                byte b[]=str.getBytes();
                int i;
                for(i=0;i<b.length;i++)
                {
                    f.write(b[i]);
                }
               //int final_size= Files.size(f1.getDirectory()+f1.getFile());
               
               
                String name=f1.getFile();//----gets name of the file the user is going to save----
                this.setTitle(name);
                count=0;//--sets title of the name given in save dialog to our file.
                //this.dispose();//--disposes the Current dialog of New Button---
                f.close(); 
                
                }
                else if(count==0)
                {
                FileOutputStream f= new FileOutputStream(this.getTitle());
                str= t1.getText();
                byte b[]=str.getBytes();
                int i;
                for(i=0;i<b.length;i++)
                {
                    f.write(b[i]);
                }
                f.close(); 
                    
                }
                
                
            }
            catch(Exception e1)
            {
            }
        }
       else if(str.equals("Open"))
       {
           try{
               String head=this.getTitle();      
           if(head.equals("Untitled")||count==1)
           {
                Q3 q = new Q3(this,"Notepad",false);
                q.setSize(200,250);
                q.setVisible(true);
                //this.dispose();
              
           }
           else if(count==0)
           {
              FileDialog fopen= new FileDialog(this,"Open",FileDialog.LOAD);
               fopen.setVisible(true); 
               FileInputStream fi= new FileInputStream(fopen.getDirectory()+fopen.getFile());
               int t= fi.available();//returns size of the file
               int ik;
               String str1=" ";
               for(ik=1;ik<=t;ik++)
               {
                   char c= (char)fi.read();
                   str1= str1+c;
               }
               t1.setText(str1);
               fopen.setTitle(fopen.getDirectory()+fopen.getFile());
               fi.close();
               //this.dispose();
            
           }
        }
        catch(Exception e)
        {
        }
            
           
        }
        else if(str.equals("SaveAs"))
        {
            try{
                //String head=this.getTitle();
                //if(head.equals("Untitled"))
                {
                FileDialog f1= new FileDialog(this,"Save",FileDialog.SAVE);
                f1.setVisible(true);
                FileOutputStream f= new FileOutputStream(f1.getDirectory()+f1.getFile());
                byte b[]=str.getBytes();
                str= t1.getText();
                int i;
                for(i=0;i<b.length;i++)
                {
                    f.write(b[i]);
                }
                this.setTitle(str);
                f.close();
                }
                
            }
            catch(Exception e1)
            {
            }
            //this.dispose();
        }
        else if(str.equals("Exit"))
        {
            String head=this.getTitle();
            if(count==1||head.equals("Untitled"))
            {
              Q2 q = new Q2(this,"Notepad",false);
            {
                q.setSize(200,250);
                q.setVisible(true);
                //this.dispose();
            }  
            }
            else if(count==0)
            {
                this.dispose();
            }
                
            
        }
        else if(str.equals("Cut"))
        {
        undo = t1.getText();
        str10=t1.getText();
        int fullenght= str10.length();
        str11= t1.getSelectedText();
        int t=str10.indexOf(str11);
        int last=str11.length();
        String str3= str10.substring(0,t);
        str3= str3+ str10.substring(t+last,fullenght);
        t1.setText(str3);
        str10= str3;
        }
        else if(str.equals("Copy"))
        {
        str11= t1.getSelectedText();
        }
        else if(str.equals("Paste"))
        {
        undo=t1.getText();
        int k = t1.getCaretPosition();
        t1.insert(str11,k);
        }
        
        else if(str.equals("Delete"))
        {
        undo = t1.getText();
        str10=t1.getText();
        str11= t1.getSelectedText();
        int fullenght= str10.length();
        int t=str10.indexOf(str11);
        int last=str11.length();
        String str3= str10.substring(0,t); 
        str3= str3+str10.substring(t+last,fullenght);
        t1.setText(str3);
        str10=" ";
        }
        else if(str.equals("SelectAll"))
        {
        t1.select(0,t1.getText().length());
        }
        else if(str.equals("Undo"))
        {
        t1.setText(undo);
        }
        else if(str.equals("Find"))
        {
           Find f= new Find(this,"Find",false);
           {
               f.setSize(300,300);
               f.setVisible(true);
            }
            
        }
        else if(str.equals("Replace"))
        {
            Replace r= new Replace(this,"Replace",false);
            {
                r.setSize(300,300);
                r.setVisible(true);
            }
        }
        else if(str.equals("Font"))
        {
            Fonts f= new Fonts(this,"Font",false);
            {
                f.setSize(400,400);
                f.setVisible(true);
            }
        }
        else if(str.equals("View Help"))
        {
           ViewHelp h= new ViewHelp(this,"Help",false);
           {
              h.setSize(400,400);
              h.setVisible(true);
           }
        }
        /*else if(str.equals("About Notepad"))
        {
            About a= new About(this,"About NOTEPAD",false)
            {
                a.setSize(400,400);
                a.setVisible(true)'
            }
        }*/
    }
}
