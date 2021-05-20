import java.util.*;
import java.awt.*;
public class CalendarModel
   { public int startDayOfMonth;
     public int startDayOfYear;
     private CalendarInput calendarinput2;
  public CalendarModel(CalendarInput ci2)
  {   calendarinput2=ci2;
  }
       public int calendarmodeling()
       {    
           
            // Year 1900 started on Monday and its Feb didn't have 29 days  
             int year3=calendarinput2.getyear();
             /*For simplicity, since 1900 is the only leap year in the interval, it is considered as a separate case,
             and we can assume that a leap year occurs every four years in our interval*/
             
             if (year3==1900)
               {startDayOfYear=2;}
             else {if ((year3%4)==0)
                     { startDayOfYear=(year3-1900)+(year3-1900)/4+1;
                     }
             else {startDayOfYear=(year3-1900)+(year3-1900)/4+2;}}
      
            if (startDayOfYear>7)
                {startDayOfYear=startDayOfYear%7;}
               
       
             int month4=calendarinput2.getmonth()+1;
             int startDayOfMonth=0;
             if (month4==1)
                {  startDayOfMonth=startDayOfYear;}
             else {if (month4==2) 
                {  startDayOfMonth=startDayOfYear+31%7;}
             else{ 
             int febDaysLeapYear=0;
             if (year3%4==0)
            {  febDaysLeapYear=29;}
            else {febDaysLeapYear=28;}
            if (month4<=7)
                 {if ((month4-1)%2==0)
                     {startDayOfMonth=startDayOfYear+(febDaysLeapYear+31+(31+30)*((month4/2-1)))%7;}
                  else
                     {startDayOfMonth=startDayOfYear+(31+febDaysLeapYear+31*((month4-1)/2)+30*((month4-1)/2-1))%7;}}
            else if (month4>7)
                 {if ((month4-1)%2!=0)
                     {startDayOfMonth=startDayOfYear+(febDaysLeapYear+31+31*((month4-1)/2)+30*((month4-1)/2-1))%7;}
                    
                  else   {startDayOfMonth=startDayOfYear+(31+febDaysLeapYear+31*((month4-1)/2)+30*((month4-1)/2-2))%7;}}}}
             
             if (startDayOfMonth>7)
                {startDayOfMonth=startDayOfMonth%7;} 
             return startDayOfMonth;
      

        }
        
        public int getstart()
        {return startDayOfMonth;}
   


}
