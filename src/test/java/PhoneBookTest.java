import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Test";
        String num = "1234567";

        int expected = 1;

        int actual = phoneBook.add(name, num);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindByNumber(){
        PhoneBook phoneBook = new PhoneBook();
        String name = "Test";
        String num = "1234567";
        phoneBook.add(name, num);


        String expected = "1234567";
        String actual = phoneBook.findByNumber(name);

        assertEquals(expected,actual);
    }
}
