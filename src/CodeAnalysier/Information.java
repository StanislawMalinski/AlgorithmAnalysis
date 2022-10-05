package CodeAnalysier;

public class Information{

    private static Container keyWordContainer = new Container("static", "switch", "case", "return");
    private static Container accessModifierContainer = new Container("public", "private", "proteced");
    private static Container dataTypeContainer = new Container("double", "long", "int", "char", "String", "void");
    private static Container loopContainer = new Container("for", "while", "do");

    public static boolean isAccessModifier(String word){
        return "c".equals(accessModifierContainer.contains(word));
    }

    public static boolean isDataType(String word){
        return "c".equals(dataTypeContainer.contains(word));
    }

    public static boolean isLoop(String word){
        return "c".equals(loopContainer.contains(word));
    }

    public static boolean isKeyWord(String word){
        return "c".equals(keyWordContainer.contains(word));
    }
}
