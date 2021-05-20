import javax.swing.*; 

 public class CalendarInput
 { public int year2; public int month2;
   
    
      public int yearInput()
      {  
             String year=JOptionPane.showInputDialog("Choose the year (1900-2021):");
                int year1=new Integer(year).intValue();
       while (year1<1900 || year1>2021)
             {  year=JOptionPane.showInputDialog("Choose the year (1900-2021):");
                year1=new Integer(year).intValue();}
                year2=year1;
            return year2;  }
              
       public int getyear()
       { return year2; }
       
        public int monthInput()
      {    
            String month=JOptionPane.showInputDialog("Choose the month (1-12):");
            int month1=(new Integer(month).intValue())-1;
            while (month1<0 || month1>=12)
              {  month=JOptionPane.showInputDialog("Choose the month (1-12):");
                 month1=(new Integer(month).intValue())-1;}
                 month2=month1; 
            return month2; }
       
       public int getmonth()
      { return month2;}
            
      
      
      
      
       
 }
 