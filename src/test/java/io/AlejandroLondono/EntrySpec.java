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

    String first, last;
    int areaCode, exchange, station;


    @Before
    public void sandbox(){
        first = "Randy";
        last = "dandy";
        areaCode = 555;
        exchange = 555;
        station = 5555;

        number = new PhoneNumber(areaCode, exchange, station);
        name = new Name(first, last);

    }


    @Test
    public void getSetNameTest(){
        entry = new Entry(name, number);
        String actualName = entry.getName().getFirst();
        assertEquals("the name saved in entry should be "+first,first, actualName);
        String actualLast = entry.getName().getLastName();
        assertEquals("the last name should have been "+last,last,actualLast);
    }

    @Test
    public void getSetNumberTest(){
        entry = new Entry(name, number);
        int actualAreaCode = entry.getNumber().getAreaCode();
        int actualExchange = entry.getNumber().getExchange();
        int actualStation = entry.getNumber().getStation();
        assertEquals("areaCode should be equal", areaCode, actualAreaCode);
        assertEquals("Exchange should be the same", exchange, actualExchange);
        assertEquals("Station should be the same", station, actualStation );
    }



    @Test
    public void setGetNameTest(){
        entry = new Entry(name, number);
        String full = first+" "+last;
        String actualFullName = entry.getName().getFullName();
        assertEquals("first name should be "+full, full, actualFullName);
    }
}
