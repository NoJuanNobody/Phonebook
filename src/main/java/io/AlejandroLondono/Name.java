package io.AlejandroLondono;

/**
 * Created by alejandrolondono on 5/16/16.
 */
public class Name {
    private String first;
    private String last;

    public String getFullName(){
        return this.first+" "+this.last;
    }

    public String getFirst(){
        return this.first;
    }

    public String getLastName(){
        return this.last;
    }

    public Name(String first, String last){
        this.first = first;
        this.last = last;
    }
}
