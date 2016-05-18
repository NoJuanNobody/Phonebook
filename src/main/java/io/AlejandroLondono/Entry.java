package io.AlejandroLondono;

import java.util.ArrayList;

/**
 * Created by alejandrolondono on 5/16/16.
 */
public class Entry {
    private Name name;
    private ArrayList<PhoneNumber> numbers = new ArrayList<>();

    public Entry(Name name, PhoneNumber number){
        this.name = name;
        this.numbers.add(number);
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneNumber getNumber(int index) {
        try{

            return this.numbers.get(index);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("it seems like there are only "+numbers.size()+" numbers for this contact");
            return numbers.get(0);
        }
    }
    public ArrayList<PhoneNumber> getNumbers(){
        return this.numbers;
    }

    public void setNumber(PhoneNumber number) {
        this.numbers.add(number);
    }

    public String listNumbers(){
        String numString="";
        for(PhoneNumber number : numbers){
            numString += number.numType.toString().toLowerCase()+": "+number.getFullNumber()+"\n";
        }
        return numString;
    }

    public int removeNumber(String theNumType){
        PhoneNumber.Type phoneTypeEnum = PhoneNumber.Type.valueOf(theNumType.toUpperCase());
        int i = 0;
        for(PhoneNumber number : numbers){
            if(number.numType == phoneTypeEnum){
                break;
            }
            i++;
        }
        PhoneNumber theNumber =  numbers.get(i);
        numbers.remove(theNumber);
        return getNumbers().size();
    }
}
