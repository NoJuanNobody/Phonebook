package io.AlejandroLondono;

/**
 * Created by alejandrolondono on 5/16/16.
 */
public class Entry {
    private Name name;
    private PhoneNumber number;

    public Entry(Name name, PhoneNumber number){
        this.name = name;
        this.number = number;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneNumber getNumber() {
        return number;
    }

    public void setNumber(PhoneNumber number) {
        this.number = number;
    }
}
