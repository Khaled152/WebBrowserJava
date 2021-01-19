package sample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class History {
    LinkedList<HistoryNode> list = new LinkedList<>();


    public void add(String url){
        list.add(new HistoryNode(url));
    }
    public HistoryNode getHistoryNodeAt(int index){
        return list.get(index);
    }
    public void remove( int index){
        list.remove(index);
    }
    public void clear(){
        list.clear();
    }




}
