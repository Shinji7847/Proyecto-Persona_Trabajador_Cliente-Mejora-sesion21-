package open_bootcamp.Persona_sesion21;

import java.util.HashMap;

public class OptionsParser {
    private HashMap<String, String> options = new HashMap();
    private String[] args;

    private OptionsParser(){}
    public OptionsParser(String[] args){
        this.args = args;
    }

    public void registerOptions(String optionName){
        options.put(optionName, "");
    }

    public String getOptions(String optionName){
        return options.get(optionName);
    }

    public void setOptionValue(String optionName, String optionValue){
        options.replace(optionName, optionValue);
    }

    public void parse(){
        for(int i = 0; i < args.length; i++){
            //Nombre de opción limpio
            String optionName = args[i].replace("-", "");

            if(options.containsKey(optionName)){
                setOptionValue(optionName, args[i + 1]);
            }
        }
    }
}
