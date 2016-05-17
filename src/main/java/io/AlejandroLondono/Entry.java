package io.AlejandroLondono;

import java.util.ArrayList;

/**
 * Created by alejandrolondono on 5/16/16.
 */
public class Entry {
    private Name name;
    private ArrayList<PhoneNumber> numbers;

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

    public ArrayList<PhoneNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<PhoneNumber> numbers) {
        this.numbers = numbers;
    }
}
