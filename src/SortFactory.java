import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class SortFactory {

    private Map<String, SortAlgo> registred;

    public SortFactory(){
        registred = new HashMap<>();
    }

    public SortAlgo getAlgo(String algoName)throws IllegalArgumentException{
        if(registred.containsKey(algoName)){ //verify if the key is in the map
            return registred.get(algoName);
        }else{ //throw an exception that need to be handled by the caller
            throw new IllegalArgumentException("The algorithm is not registered or is registred with another name");
        }
    }

    public boolean registerAlgo(String key, SortAlgo value){
        if(registred.containsKey(key) || registred.containsValue(value)){ //verify if the key or the value are already in the map
            return false;
        }else{
            registred.put(key, value); //if the value or the key are not in the map, they are added
            return true;
        }
    }

    public String[] getRegistred(){ //return an array of the keys from the map
        List<String> arr = new ArrayList<>();
        registred.keySet().stream().forEach(i->arr.add(i));
        String[] toReturn = new String[ (int) registred.keySet().stream().count()];
        for(int i=0; i<=arr.size(); i++){
            toReturn[i]=arr.get(i);
        }
        return toReturn;
    }

}
