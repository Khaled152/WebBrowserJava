package sample;

import java.util.LinkedList;

public class BookMarks {
    private LinkedList<BookMarkNode> list = new LinkedList<>();

    public void add(String url , String name){
        list.add(new BookMarkNode(url , name));
    }
    public BookMarkNode getBookMarkAt(int index){
        return list.get(index);
    }
    public void remove( int index){
        list.remove(index);
    }
    public void clear(){
        list.clear();
    }
}
