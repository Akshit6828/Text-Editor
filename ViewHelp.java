import java.util.*;
import java.awt.*;
import java.awt.event.*;
class ViewHelp extends Dialog implements ActionListener
{
    Label l1;
    Button b1;
    C1 k;
    
    public ViewHelp(C1 p,String tt,boolean rr)
    {
       super(p,tt,rr);
       k=p;
       //setLayout()= new Layout(null);
       setLayout(new FlowLayout());
       l1= new Label("Please Contact Mr.Akshit Mangotra: 9465675515");
       b1= new Button("Exit");
       l1.setBounds(100,100,50,50);
       b1.setBounds(120,120,50,50);
       add(l1);
       add(b1);
       b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str= ae.getActionCommand();
        if(str.equals("Exit"))
        {
         this.dispose();   
        }
    }
}