import java.awt.*;
import java.awt.event.*; 
class Find extends Dialog implements ActionListener
{
    Label l1;
    TextField t1;
    Checkbox c1,c2,c3;
    CheckboxGroup cg;
    C1 k;
    int t= -1;
    int count=0,stay=0;
    Button b1,b2;
    String str="",str2="",str1="";
    public Find(C1 p,String tt,boolean rr)
    {
        super(p,tt,rr);
        k=p;
        setLayout(new FlowLayout());
        l1=new Label("Find Text");
        cg= new CheckboxGroup();
        c1= new Checkbox("Match Case",false);
        c2= new Checkbox("Up",cg,false);
        c3= new Checkbox("Down",cg,true);
        b1= new Button("Find Next");
        b2= new Button("Cancel");
        t1= new TextField(15);
        add(l1);
        add(t1);
        add(b1);
        add(b2);
        add(c1);
        add(c2);
        add(c3);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
      
          if(str.equals("Find Next"))
          {
            if(c3.getState()==true)
              {
              //count++;
              stay++;
              char cmp='\n';
              str1=k.t1.getText();
              str2=t1.getText();
              int last= str1.length();
              int startp=str1.indexOf(str2);
              t= str1.indexOf(str2,t+1);
              /* //System.out.println(t1.getText());
              int i;
              for(i=0;i<str1.lastIndexOf(str2);t++)
              {
                 
                  //t= str1.indexOf(str2,t+1);
                  /*if(count%2==1)
              {
                  t= str1.indexOf(str2,t+1);
                   System.out.println("T value is "+t);
                  if(t<0) 
                  {}
                 else 
                {

                k.t1.select(t,t+str2.length());
                k.setVisible(true);
                }
              }
              else if(count%2==0)
              {
                  t= str1.indexOf(str2,t+1);
                  System.out.println("T value is "+t);
                   if(t<0)
                  {}
                 else 
                {

                k.t1.select(t,t+str2.length());
                k.setVisible(true);
                  
                }
               }
              }*/
              if(t<0)
              {}
              else 
              {
              k.t1.select(t,t+str2.length());
              k.setVisible(true);
              }
            }
          else if(c2.getState()==true)
          {
              int z= k.t1.getText().length();
              str1=k.t1.getText();
              str2=t1.getText();  
              z=str1.substring(0,z).lastIndexOf(str2);
              k.t1.select(z,z+str2.length());
              k.setVisible(true);
              str1=str1.substring(0,z);
          }
          else if(c3.getState()==true)
          {
              int z= k.t1.getText().length();
              str1=k.t1.getText().toLowerCase();
              str2=t1.getText().toLowerCase();
              z=str1.substring(0,z).lastIndexOf(str2);
              k.t1.select(z,z+str2.length());
              k.setVisible(true);
          }
        }
                  
        else if(str.equals("Cancel"))
        {
            this.dispose();
        }
   }
}
  