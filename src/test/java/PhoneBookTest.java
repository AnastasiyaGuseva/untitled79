import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    public void addTest() {
        int result = PhoneBook.add("Anna", "89392929871");
        assertEquals(result, 1);
    }

    @Test
    public void addTestPlural() {
        int result = PhoneBook.add("Kate", "8585039282882") + PhoneBook.add("Ann", "89865689845");
        assertEquals(result, 2);
    }

    @Test
    public void findByNumberTest() {
        PhoneBook.add("Kate", "8585039282882");
        String result = PhoneBook.findByNumber("8585039282882");
        assertEquals(result, "Kate");
    }

    @Test
    public void findByNameTest() {
        PhoneBook.add("Kate", "8585039282882");
        String result = PhoneBook.findByName("Kate");
        assertEquals(result, "8585039282882");
    }
    @Test
    public void printAllNamesTest(){
        PhoneBook.add("Kate", "8585039282882");
        PhoneBook.add("Anna", "8585575898282");
        String result = PhoneBook.printAllNames();
        assertEquals(result, "Anna Kate ");
    }
}