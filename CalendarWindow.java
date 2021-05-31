import java.awt.*;
import javax.swing.*;
import java.util.*;

 public class CalendarWindow extends JPanel 
  {  
     private CalendarInput calendarinput; 
     private CalendarModel calendarmodel;
     
     public CalendarWindow(CalendarInput c, CalendarModel cc)
     {    
           calendarmodel=cc;
           calendarinput=c;
           JFrame frame= new JFrame("Calendar");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.getContentPane().add(this);
           frame.setSize(450,435);
           frame.setVisible(true);
         
          
      }
     
      
      public void paintComponent(Graphics g)
     {   
           super.paintComponent(g);
           g.setColor(Color.white);
           g.fillRect(0,0,450,435);
           g.setColor(new Color(0,0,50));
           g.fillRect(35,80,360,35*8+10);
           g.setColor(Color.white);
           g.fillRect(40,85,350,35*8);
           paintCalendar(40,120,7,7,50,35,g);
           g.setColor(new Color(0,0,100));
           g.fillRect(40,85,350,35);
           g.setColor(new Color(0,0,50));
           g.fillRect(145,10,140,50);
           paintMonthAndYear(g);
           g.setColor(Color.black);
           Font font3 = new Font("Verdana", Font.BOLD, 17);
           g.setFont(font3);
           g.drawString("Sun  Mon  Tue  Wed  Thu  Fri   Sat",45,150);
           g.setColor(Color.black);
           
           int month5=calendarinput.getmonth()+1;
           int year5=calendarinput.getyear();
           int daysofmonth=0;
           int o=calendarmodel.calendarmodeling();
           int f=o-1;
                     
          if (month5==2)
             {
              if (year5%4==0 && year5!=1900) 
                 { daysofmonth=29; }
              else {daysofmonth=28; }}
         else if (month5<=7 && month5!=2)  
             { if (month5%2!=0)
              { daysofmonth=31;}
              else {daysofmonth=30;  }}
          else {if (month5%2!=0)
              { daysofmonth=30;}
              else {daysofmonth=31;  }}
           
            ArrayList<String> days = new ArrayList<String>();

            for (int k=0; k<=daysofmonth; k++)
                     {String day=""+k;
                      days.add(day);}
                 for(int i=0; i<6;i++)
                     {for (int j=0; j<7; j++) 
                          {if ((i*7+j+1)<=f)
                          {drawstring("  ",j,i,g);}
           
                          else { if ((i*7+j+1-f)<=daysofmonth && (i*7+j+1)>f)
                              {drawstring(days.get(i*7+j+1-f),j,i,g);}
                                else {drawstring("  ",j,i,g);}}}}
              this.repaint();
             
      }
    
           
       private void drawstring(String date, int column,int row,Graphics g)
      {    Font font3 = new Font("Verdana", Font.BOLD, 17);
           g.setFont(font3);
           g.drawString(date,53+column*50,180+row*35);
       
      }
 
      
      private void paintCalendar(int startx, int starty, int totalrows,int totalcolumns, int height,int width, Graphics g)
     { 
            for ( int i = 0; i < totalrows; i = i + 1 )
                  {int xposition = startx + (i * height);
            for ( int j = 0; j < totalcolumns; j = j + 1 )
                {int yposition = starty + (j * width);
             if (j==0)
                {	g.setColor(new Color(51,140,255));
                  g.fillRect(xposition,yposition,height,width);}
                  g.setColor(Color.black);
                  g.drawRect(xposition,yposition,height,width);}}
     }
                  
         private void paintMonthAndYear(Graphics p)
      { 
           p.setColor(Color.white);
           Font font = new Font("Verdana", Font.BOLD, 40);
           p.setFont(font);
           int yearinput2=calendarinput.getyear();
           String yearinput=""+yearinput2;
           p.drawString(yearinput,158,50); 
           Font font1 = new Font("Verdana", Font.BOLD, 30);
           p.setFont(font1);
           String [] months={"January","February","March","April","May", "June", "July", "August","September","October","November","December"};
           int monthinput=calendarinput.getmonth();
          
           
           
        if (monthinput<3|| monthinput>6)
              { p.drawString(months[monthinput],145,113); }
        else
              { p.drawString(months[monthinput],170,113); }
         
                         
        }  
        
     
   
   }     
