import java.util.HashMap;
import java.util.Map;

public class SortFactory {

    private static Map<String, SortAlgo> registered;

    public SortFactory(){
        registered = new HashMap<>();
    }

    public SortAlgo getAlgo(String algoName)throws IllegalArgumentException{
        if(registered.containsKey(algoName)){ //verify if the key is in the map
            return registered.get(algoName);
        }else{ //throw an exception that need to be handled by the caller
            throw new IllegalArgumentException("The algorithm is not registered or is registered with another name");
        }
    }

    public synchronized boolean  registerAlgo(String key, SortAlgo value){ //this method is synchronized to make it threadsafe
        if(registered.containsKey(key) || registered.containsValue(value)){ //verify if the key or the value are already in the map, if the algorithm is registered
            return false;
        }else{
            registered.put(key, value); //if the value or the key are not in the map, they are added
            return true;
        }
    }

    public synchronized boolean unregisterAlgo(String key){ //remove algorithm from registry
                                                            //this method is synchronized to make it threadsafe
        if(registered.containsKey(key)){

            registered.remove(key);

            return true;
        }else{ // if key is not in the registry return false
            return false;
        }

    }

    public String[] getRegistered(){ //return an array of the keys from the map

        return registered.keySet().toArray(new String[0]);
    }
}
