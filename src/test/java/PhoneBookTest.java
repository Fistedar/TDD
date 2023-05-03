import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd(){
      PhoneBook phoneBook = new PhoneBook();
        String testName = "Test";
        String testNumber = "1234567";

        int expected = 1;

        int actual = phoneBook.add(testName, testNumber);

        assertEquals(expected, actual);
    }
    }
