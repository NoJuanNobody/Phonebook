package io.AlejandroLondono;



import java.util.HashMap;
import java.util.Map;

/**
 * Created by alejandrolondono on 5/16/16.
 */
public class PhoneBook {

    private Map<String, Entry> entries = new HashMap<>();

    public Entry lookUp(String fullName){
        Entry returnEntry = null;
        for(Map.Entry<String, Entry> contact : this.getEntries().entrySet()){
            boolean condition = contact.getKey().equalsIgnoreCase(fullName);
            if(condition) returnEntry = contact.getValue();
        }
        return returnEntry;
    }

    public Entry reverseLookup(String number){
        Entry returnEntry = null;
        for(Map.Entry<String, Entry> contact : this.getEntries().entrySet()){
            for(PhoneNumber theNumber : contact.getValue().getNumbers()){
               boolean condition = theNumber.getFullNumber().equalsIgnoreCase(number);
                if(condition) returnEntry = contact.getValue();
            }
        }
        return returnEntry;
    }
    public Map<String, Entry> getEntries() {
        return entries;
    }
    /**
     * returns size of array and how many entries added to contacts
     * @return
     */
    public int addEntry(String name, Entry entry){
        this.getEntries().put(name,entry);
        int contacts = this.getEntries().size();
        return contacts;
    }

    public int removeEntry(Entry entry){
        int sizeBeforeDelete = this.getEntries().size();
        this.getEntries().remove(entry.getName().getFullName());
        return (sizeBeforeDelete - this.getEntries().size());
    }



}
