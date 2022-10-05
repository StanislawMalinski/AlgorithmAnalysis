package CodeAnalysier;

public class Cursor {
    private final char [] array;
    private int cursor;

    public Cursor(String text){
        array = text.toCharArray();
        cursor = 0;
    }

    public char getNextChar(){
        return array[++cursor];
    }

    public char getPreviousChar(){
        return array[--cursor];
    }

    public char getCurrentChar(){
        return array[cursor];
    }

    public boolean hasNext(){
        return cursor < array.length - 1;
    }

    public boolean hasPrevious(){
        return 0 < cursor;
    }
}
