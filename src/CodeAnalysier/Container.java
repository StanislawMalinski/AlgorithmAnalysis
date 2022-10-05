package CodeAnalysier;

public class Container {
    private String [] nameContainer;
    private String [] typeContainer;

    public Container(){
        nameContainer = new String[1];
        typeContainer = new String[1];
    }

    public Container(String ... name){
        nameContainer = new String[1];
        typeContainer = new String[1];
        addAll(name);
    }

    public void add(String name, String type){
        nameContainer[nameContainer.length-1] = name;
        typeContainer[typeContainer.length-1] = type;
        sizeUp();
    }

    public void addAll(String ... names){
        for(String name : names){
            add(name, "c");
        }
    }

    public String contains(String name){
        for(int i = 0; i < nameContainer.length; i++){
            if(nameContainer[i] == name) return typeContainer[i];
        }
        return null;
    }

    private void sizeUp(){
        String [] NnameContainer = new String[nameContainer.length+1];
        String [] NtypeContainer = new String[typeContainer.length+1];
        System.arraycopy(nameContainer,0,NnameContainer,0,nameContainer.length);
        System.arraycopy(typeContainer,0,NtypeContainer,0, typeContainer.length);
        nameContainer = NnameContainer;
        typeContainer = NtypeContainer;
    }
}
