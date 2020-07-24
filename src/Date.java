import java.time.LocalDate;
import java.time.Year;

public class Date {
    private int month = 0;
    private int day = 0;
    private int year = 0;

    public Date(int _month, int _day, int _year){
        if (_month < 0) _month = 1;
        if (_month > 12 ) _month = 12;
        if (_day < 0) _day = 1;
        if (_day > getLastDayOfMonth(_year, _month)) _day = getLastDayOfMonth(_year, _month);
        if (_year < 0) _year = 2000;
        if (_year > 3000) _year = 3000;
        this.setMonth(_month);
        this.setDay(_day);
        this.setYear(_year);
    }

    int getLastDayOfMonth(int _year, int _month){
        return LocalDate.of(_year, _month, 1).getMonth().length(Year.of(_year).isLeap());
    }

    void setMonth(int _month){
        this.month = _month;
    }

    int getMonth(){
        return this.month;
    }

    void setDay(int _day){
        this.day = _day;
    }

    int getDay(){
        return this.day;
    }

    void setYear(int _year){
        this.year = _year;
    }

    int getYear(){
        return this.year;
    }


    void displayDate(){
        //setYear(2020);
        //setDay(1);
        //setMonth(7);
        System.out.printf("%d/%d/%d\n",this.getMonth(), this.getDay(), this.getYear());
    }

}
