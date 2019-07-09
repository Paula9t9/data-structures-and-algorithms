package hashTable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    HashTable testTable;

    @Before
    public void setUp() throws Exception {
        testTable = new HashTable(16);
        testTable.add("Dominos", "Pizza");
    }

    @Test
    public void testAdd() {
        assertTrue("Should return true if the value was correctly added to the hashtable",
                testTable.contains("Dominos"));
    }

    @Test
    public void testGet() {
        assertEquals("Should return the correct value for the given key",
                "Pizza", testTable.get("Dominos"));
    }

    @Test
    public void testCollision() {
        testTable.add("Demetris", "Spaghetti");
        assertEquals("Should find the correct value despite collision",
                "Spaghetti", testTable.get("Demetris"));
    }

    @Test
    public void testHash() {
        assertEquals("Should return the correct index for the has function",
                10, testTable.hash("ABC"));
    }
}