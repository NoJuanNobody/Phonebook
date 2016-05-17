package io.AlejandroLondono;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by alejandrolondono on 5/16/16.
 */
public class PhoneBookSpec {

    PhoneBook phoneBook;
    Entry entryOne, entryTwo;
    Name nameOne, nameTwo;
    PhoneNumber numberOne, numberTwo;

    String firstOne, firstTwo, lastOne, lastTwo, fullOne, fullTwo;
    int areaCodeOne, areaCodeTwo, exchangeOne, exchangeTwo, stationOne, stationTwo;


    @Before
    public void sandbox(){
        phoneBook = new PhoneBook();
        firstOne = "Randy";
        firstTwo = "Clarence";
        lastTwo = "Dandy";
        lastTwo = "Terrance";
        areaCodeOne = 555;
        areaCodeTwo = 777;
        exchangeOne = 555;
        exchangeTwo = 777;
        stationOne = 5555;
        stationTwo = 7777;
        fullOne = firstOne+" "+lastOne;
        fullTwo = firstTwo+" "+lastTwo;
        numberOne = new PhoneNumber(areaCodeOne, exchangeOne, stationOne);
        numberTwo = new PhoneNumber(areaCodeTwo, exchangeTwo, stationTwo);
        nameOne = new Name(firstOne, lastOne);
        nameTwo = new Name(firstTwo, lastTwo);
        entryOne = new Entry(nameOne, numberOne);
        entryTwo = new Entry(nameTwo, numberTwo);
    }

    @Test
    public void addEntryTest(){
        int response = phoneBook.addEntry(nameOne.getFullName(), entryOne);
        int expectedResponse = 1;
        assertEquals("the correct response should have been passed upon addition", expectedResponse, response);
        int actualSize = phoneBook.getEntries().size();
        assertEquals("the size of the list should be "+expectedResponse,expectedResponse,actualSize);
    }
    @Test
    public void removeEntryTest(){
        phoneBook.addEntry(nameOne.getFullName(), entryOne);
        phoneBook.addEntry(nameTwo.getFullName(), entryTwo);
        int response = phoneBook.removeEntry(entryTwo);
        int expectedSize = 1;

        int expectedResponse = 1;

        assertEquals("the response should be 1", expectedResponse, response);
        assertEquals("the size of the array should be "+expectedSize,expectedSize, response);
    }

    @Test
    public void lookupTest(){
        phoneBook.addEntry( nameOne.getFullName(), entryOne);
        phoneBook.addEntry(nameTwo.getFullName(), entryTwo);
        String actualName = phoneBook.lookUp(nameTwo.getFullName()).getName().getFullName();
        assertEquals("the number returned should be "+numberTwo, entryTwo.getName().getFullName(), actualName);
    }
    @Test
    public void reverseLookupTest(){
        phoneBook.addEntry(nameOne.getFullName(), entryOne);
        phoneBook.addEntry(nameTwo.getFullName(), entryTwo);
        String actualNum = phoneBook.reverseLookup(numberTwo.getFullNumber()).getName().getFullName();
        assertEquals("the name returned should be "+fullTwo, fullTwo, actualNum);
    }
}
