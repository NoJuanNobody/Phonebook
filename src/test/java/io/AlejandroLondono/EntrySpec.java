package io.AlejandroLondono;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by alejandrolondono on 5/16/16.
 */
public class EntrySpec {

    Entry entry;
    Name name;
    PhoneNumber number;

    String first, last, full;
    int areaCode, exchange, station;


    @Before
    public void sandbox(){
        first = "Randy";
        last = "dandy";
        areaCode = 555;
        exchange = 555;
        station = 5555;
        full = first+" "+last;
        number = new PhoneNumber(areaCode, exchange, station);
        name = new Name(first, last);
        entry = new Entry(name, number);

    }

    @Test
    public void setNameTest(){
        Name newName = new Name("Dandy", "Doodle");
        entry.setName(newName);
        String actualFullName = entry.getName().getFullName();
        assertEquals("full name should have been changed", newName.getFullName(), actualFullName);
    }

    @Test
    public void setNumberTest(){
        PhoneNumber newNumber = new PhoneNumber(666,666,7777);
        entry.setNumber(newNumber);
        String actualNumber = entry.getNumber().getFullNumber();
        assertEquals("the number passed should be "+newNumber, newNumber.getFullNumber(),actualNumber);
    }

    @Test
    public void getSetNameTest(){
        String actualName = entry.getName().getFirst();
        assertEquals("the name saved in entryOne should be "+first,first, actualName);
        String actualLast = entry.getName().getLastName();
        assertEquals("the last name should have been "+last,last,actualLast);
    }

    @Test
    public void getSetNumberTest(){
        int actualAreaCode = entry.getNumber().getAreaCode();
        int actualExchange = entry.getNumber().getExchange();
        int actualStation = entry.getNumber().getStation();
        assertEquals("areaCode should be equal", areaCode, actualAreaCode);
        assertEquals("Exchange should be the same", exchange, actualExchange);
        assertEquals("Station should be the same", station, actualStation );
    }



    @Test
    public void setGetNameTest(){
        String actualFullName = entry.getName().getFullName();
        assertEquals("first name should be "+full, full, actualFullName);
    }
}
