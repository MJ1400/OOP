package ee.mj1400.kt;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

/**
 * Unit test for Yl1.
 */
public class Yl1test
{
    CountCharsClass countchars = new CountCharsClass();
   
    @Test
    public void charCountTest()
    {   
        String word = "pere";
        HashMap<Character, Integer> testMap = new HashMap<Character, Integer>();
            char[] charArray = word.toCharArray();

            for (char c : charArray) {
                if(testMap.containsKey(c)) {
                    testMap.put(c, testMap.get(c)+1);
            } else {
                testMap.put(c, 1);
            }
        }
        assertEquals("Both hashmaps are the same", testMap.keySet(), countchars.charCount("pere").keySet());
        assertThat(countchars.charCount("pere"), IsMapContaining.hasEntry('p', 1));
        assertThat(countchars.charCount("pere"), IsMapContaining.hasEntry('e', 2));
        assertThat(countchars.charCount("pere"), IsMapContaining.hasEntry('r', 1));
        assertEquals("Hashmap is with right size", 3, countchars.charCount("pere").size());
    }
}
