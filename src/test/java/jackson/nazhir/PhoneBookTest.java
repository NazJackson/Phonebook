package jackson.nazhir;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by nazhirjackson on 9/28/16.
 */
public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    public void lookupTest(){

        List<Long> expected = new ArrayList<>();
        expected.add(2155555555l);
        List<Long> actual = phoneBook.lookUp("Naz");

        Assert.assertEquals("you should get 215....", expected, actual);


    }

    @Test
    public void listNamesTest(){
        phoneBook.addToPhonebook("Naz", 2155848495l);
        Set expected;
       expected = phoneBook.phoneBook.keySet();

        Set actual = phoneBook.listNames();
        Assert.assertEquals("you should get just Naz ", expected, actual);
    }

    @Test
    public void reverseLookup(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addToPhonebook("Naz", 2155848495l);
        String expected = "Naz";
        String actual = phoneBook.reverseLookUp(2155848495l);

        Assert.assertEquals("you should get Naz", expected, actual);
    }

}
