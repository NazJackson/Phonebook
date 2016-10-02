package jackson.nazhir;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazhirjackson on 9/28/16.
 */
public class PhoneBook {
    Map<String, List<Long>> phoneBook = new HashMap<>();
    int count=0;
    public List lookUp(String name){
        List g = phoneBook.get(name);
        return g;
    }

    public void addToPhonebook(String name, Long number){
        if(phoneBook.containsKey(name)){
            phoneBook.get(name).add(number);
        }
        else{
            List<Long> newNumber = new ArrayList<>();
            newNumber.add(number);
            phoneBook.put(name, newNumber);

        }


    }
    public void removeFromPhonebook(String name){
        phoneBook.remove(name);
    }

    public Set listNames(){
        Set<String> listOfNames = phoneBook.keySet();
        return listOfNames;
    }
    public void listAllEntries(){
        Set printThem = phoneBook.keySet();
        Iterator iterator = printThem.iterator();

        while (iterator.hasNext()){
            String key = (String)iterator.next();

            List value = phoneBook.get(key);
            System.out.println("name: "+ key+ " and Number: "+value);
        }

    }
    public String reverseLookUp(Long number){

        for(String p : phoneBook.keySet()){
            if(phoneBook.get(p).contains(number)){
                return p;
            }
            else{
                String foundIt="Doesnt exist";
                return foundIt;
            }
        }
        return null;
    }
}
