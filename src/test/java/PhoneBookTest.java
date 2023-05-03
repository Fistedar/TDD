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
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Test";
        String num = "1234567";
        phoneBook.add(name, num);


        String expected = "1234567";
        String actual = phoneBook.findByNumber(name);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Test";
        String num = "1234567";
        phoneBook.add(name, num);

        String expected = "Test";
        String actual = phoneBook.findByName(num);

        assertEquals(expected, actual);
    }

    @Test
    public void printAllNames() {
        PhoneBook phoneBook = new PhoneBook();

        String testName1 = "Test1";
        String testNumber1 = "1234567";

        String testName2 = "Test2";
        String testNumber2 = "1234568";

        String testName3 = "Test3";
        String testNumber3 = "1234569";

        String testName4 = "Test4";
        String testNumber4 = "1234566";

        String expected = "[Test1, Test2, Test3, Test4]";

        phoneBook.add(testName2, testNumber2);
        phoneBook.add(testName4, testNumber4);
        phoneBook.add(testName1, testNumber1);
        phoneBook.add(testName3, testNumber3);

        String actual = phoneBook.printAllNames();
        assertEquals(expected, actual);
    }
}
