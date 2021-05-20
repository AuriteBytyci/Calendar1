
public class CalendarController
{ private CalendarInput cin;
  private CalendarModel cim;
    public CalendarController(CalendarInput ci, CalendarModel cm)
    { cin=ci;
      cim=cm;
      processing();}

    private void processing()
   {    cin.yearInput();
        cin.monthInput();
        cim.getstart();
        new CalendarWindow(cin,cim);
        this.processing();
   }
}