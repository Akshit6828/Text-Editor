import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Fonts extends Dialog implements ActionListener
{
   
   Label l1,l2,l3,l4,l5;
   Choice c1,c2,c3,c4,c5;
   Button b1,b2;
   MainMenu p1;
   String bcolor,fcolor,face,style,size;
   Fonts(MainMenu p,String tt,boolean rr)
   {
       super(p,tt,rr);
       p1=p;
       setLayout(new FlowLayout());
       l1= new Label("Font");
       l2= new Label("Font Style");
       l3= new Label("Font Size");
       l4= new Label("Background");
       l5= new Label("Foreground");
       b1= new Button("Apply");
       b2= new Button("Exit");
       c1= new Choice();
       add(l1);
       add(c1);
       c2= new Choice();
       add(l2);
      add(c2);
      add(l3);
      c3= new Choice();
      add(c3);
      add(l4);
      c4= new Choice();
      add(c4);
      add(l5);
      c5= new Choice();
      add(c5);
      c1.add("Arial"); 
      c1.add("Consolas");
      c1.add("Franklin Gothic");
      c2.add("Italic");
      c2.add("Bold");
      c2.add("Bold Italic");
      c3.add("12");
      c3.add("14");
      c3.add("16");
      c4.add("green");
      c4.add("yellow");
      c4.add("black");
      c4.add("white");
      c5.add("green");
      c5.add("yellow");
      c5.add("black");
      c5.add("white");
      add(b1);
      add(b2);
      b1.addActionListener(this);
      b2.addActionListener(this);
    
   }
   public void actionPerformed(ActionEvent ae)
   {
     String str=ae.getActionCommand();
     face= c1.getSelectedItem();
     style=c2.getSelectedItem();
     size= c3.getSelectedItem();
     bcolor=c4.getSelectedItem();
     fcolor=c5.getSelectedItem();
     if(str.equals("Apply"))
   {
      if(face.equals("Arial"))
      {
         if(style.equals("Italic"))
         {    
           if(bcolor.equals("green"))
           {
               if(fcolor.equals("yellow"))
               {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.green);
                   p1.t1.setForeground(Color.yellow);
                }
                else if(fcolor.equals("green"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.green);
                   p1.t1.setForeground(Color.green);
                }
                else if(fcolor.equals("black"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.green);
                   p1.t1.setForeground(Color.black);
                }
                 else if(fcolor.equals("white"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.green);
                   p1.t1.setForeground(Color.white);
                }
            }
            else if(bcolor.equals("yellow"))
            {
               if(fcolor.equals("yellow"))
               {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.yellow);
                   p1.t1.setForeground(Color.yellow);
                }
                else if(fcolor.equals("green"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.yellow);
                   p1.t1.setForeground(Color.green);
                }
                else if(fcolor.equals("black"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.yellow);
                   p1.t1.setForeground(Color.black);
                }
                 else if(fcolor.equals("white"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.yellow);
                   p1.t1.setForeground(Color.white);
                } 
            }
            else if(bcolor.equals("black"))
            {
               if(fcolor.equals("yellow"))
               {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.black);
                   p1.t1.setForeground(Color.yellow);
                }
                else if(fcolor.equals("green"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.black);
                   p1.t1.setForeground(Color.green);
                }
                else if(fcolor.equals("black"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.black);
                   p1.t1.setForeground(Color.black);
                }
                 else if(fcolor.equals("white"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.black);
                   p1.t1.setForeground(Color.white);
                }  
            }
            else if(fcolor.equals("white"))
            {
                if(fcolor.equals("yellow"))
               {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.white);
                   p1.t1.setForeground(Color.yellow);
                }
                else if(fcolor.equals("green"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.white);
                   p1.t1.setForeground(Color.green);
                }
                else if(fcolor.equals("black"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.white);
                   p1.t1.setForeground(Color.black);
                }
                 else if(fcolor.equals("white"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.ITALIC,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.white);
                   p1.t1.setForeground(Color.white);
                } 
            }
     
        }
        else if(style.equals("Bold"))
        {
          if(bcolor.equals("green"))
           {
               if(fcolor.equals("yellow"))
               {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.green);
                   p1.t1.setForeground(Color.yellow);
                }
                else if(fcolor.equals("green"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.green);
                   p1.t1.setForeground(Color.green);
                }
                else if(fcolor.equals("black"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.green);
                   p1.t1.setForeground(Color.black);
                }
                 else if(fcolor.equals("white"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.green);
                   p1.t1.setForeground(Color.white);
                }
            }
            else if(bcolor.equals("yellow"))
            {
               if(fcolor.equals("yellow"))
               {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.yellow);
                   p1.t1.setForeground(Color.yellow);
                }
                else if(fcolor.equals("green"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.yellow);
                   p1.t1.setForeground(Color.green);
                }
                else if(fcolor.equals("black"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.yellow);
                   p1.t1.setForeground(Color.black);
                }
                 else if(fcolor.equals("white"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.yellow);
                   p1.t1.setForeground(Color.white);
                } 
            }
            else if(bcolor.equals("black"))
            {
               if(fcolor.equals("yellow"))
               {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.black);
                   p1.t1.setForeground(Color.yellow);
                }
                else if(fcolor.equals("green"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.black);
                   p1.t1.setForeground(Color.green);
                }
                else if(fcolor.equals("black"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.black);
                   p1.t1.setForeground(Color.black);
                }
                 else if(fcolor.equals("white"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.black);
                   p1.t1.setForeground(Color.white);
                }  
            }
            else if(fcolor.equals("white"))
            {
                if(fcolor.equals("yellow"))
               {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.white);
                   p1.t1.setForeground(Color.yellow);
                }
                else if(fcolor.equals("green"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.white);
                   p1.t1.setForeground(Color.green);
                }
                else if(fcolor.equals("black"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.white);
                   p1.t1.setForeground(Color.black);
                }
                 else if(fcolor.equals("white"))
                {
                   int s= Integer.parseInt(size);
                   Font f= new Font("Arial",Font.BOLD,s);
                   p1.t1.setFont(f);  
                   p1.t1.setBackground(Color.white);
                   p1.t1.setForeground(Color.white);
                } 
            }  
        }
     }
    }
   else if(str.equals("Exit"))
   {
      
       this.dispose();
   }
   }
   
}
   
   
 