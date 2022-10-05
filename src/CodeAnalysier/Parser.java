package CodeAnalysier;

public class Parser {
    private final Cursor cursor;

    private Container methodContainer;
    private Container variableContainer;

    private int openBraces; // {
    private int openBrackets; // [
    private int openParenthesis; // (
    private boolean quoting; // "
    private boolean isCharing; // '

    public Parser(Cursor cursor){
        this.cursor = cursor;
        methodContainer = new Container();
        openBraces = 0;
        openBrackets = 0;
        openParenthesis = 0;
    }

    public void run(){
        char c;
        StringBuilder buff = new StringBuilder();
        while(cursor.hasNext()){
            c = cursor.getNextChar();
            switch (c){
                case '{':

                    openBraces++;
                    break;
                case '}':       //Method definition, lambda expression
                    openBraces--;
                    break;
                case '[':
                    openBrackets++;
                    break;
                case ']':       //Index of array
                    openBrackets--;
                    break;
                case '(':
                    openParenthesis++;
                    break;
                case ')':      //Method arguments or method call or loop
                    openParenthesis--;
                    break;
                case '>' | '<':
                    break;
                case '/':      //Comment

                    break;
                case '\"':
                    boolean stop = false;
                    while(stop) {
                        while (cursor.hasNext() && (c = cursor.getNextChar()) != '\"') {
                            buff.append(c);
                        }
                        if (cursor.getPreviousChar() != '\\') {
                            stop = true;
                        } else{
                            cursor.getNextChar();
                        }
                    }
                    default:
                    while(Character.isAlphabetic(c)){ // Names of method, variable, class reading
                        buff.append(c);
                        if(cursor.hasNext()){
                            c = cursor.getNextChar();
                        }
                    }
                    if(Information.isAccessModifier(buff.toString())){      // Defining new class, method or field

                    } else if (Information.isDataType(buff.toString())){

                    } else if (Information.isLoop(buff.toString())) {

                    } else if (Information.isKeyWord(buff.toString())){

                    } else {    //Name of the class, method or variable.

                    }
            }
        }
    }

}
