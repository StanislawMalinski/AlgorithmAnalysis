package CodeAnalysier;

import java.io.*;

public class Analyser {
    private File fileCode;
    private char [] charArray;

    public Analyser(File code){
        if(code == null || !code.exists()) throw new NullPointerException();
        fileCode = code;
        getText();

    }

    private void getText(){
        try{
            BufferedReader BW = new BufferedReader(new FileReader(fileCode));
            String line;
            String text = "";
            while((line = BW.readLine()) != null){
                text += line;
            }
        }catch (IOException e){
            ;
        }
    }


}
