package ee.mj1400.kt;

import static org.junit.Assert.*;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

/**
 * Unit test for Yl1.
 */
public class Tests
{
    
   
    @Test
    public void wordTest()
    {   
        Word testwordobj = new Word("pere");
        assertThat("Pere returns one p", testwordobj.charCount('p'), IsMapContaining.hasEntry('p', 1));
        assertThat("Pere returns two e's", testwordobj.charCount('e'), IsMapContaining.hasEntry('e', 2));
        assertThat("Pere returns one r", testwordobj.charCount('r'), IsMapContaining.hasEntry('r', 1));

       
        // assertEquals("Both hashmaps are the same", testMap.keySet(), countchars.charCount("pere").keySet());
        // assertThat(countchars.charCount("pere"), IsMapContaining.hasEntry('p', 1));
        // assertThat(countchars.charCount("pere"), IsMapContaining.hasEntry('e', 2));
        // assertThat(countchars.charCount("pere"), IsMapContaining.hasEntry('r', 1));
        // assertEquals("Hashmap is with right size", 3, countchars.charCount("pere").size());
    }
}
