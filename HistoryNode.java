package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HistoryNode {

    static int  count = 0;
    int numberOfTheObject;
    private String date;
    private String time;
    private String url;

    HistoryNode(String url){
        numberOfTheObject = count;
        count++;
        this.url = url;
        Date d = new Date();
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/y");
        this.date = date.format(d);
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
        this.time = time.format(d);
    }

    public String getTime() {
        return time;
    }

    public int getNumberOfTheObject() {
        return numberOfTheObject;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return  url + " " + date + " " + time;
    }
}
