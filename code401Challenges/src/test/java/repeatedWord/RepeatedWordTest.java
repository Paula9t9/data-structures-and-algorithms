package repeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void testRepeatedWordBasic() {

        assertEquals("Must find the first repeated word in the string", "a",
                RepeatedWord.repeatedWord("Once upon a time, there was a brave princess who..."));
    }

    @Test
    public void testRepeatedWord_LongString() {
        assertEquals("Must find the first repeated word in the string", "it",
                RepeatedWord.repeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."));
    }

    @Test
    public void testRepeatedWord_Third() {

        assertEquals("Must find the first repeated word in the string", "summer",
                RepeatedWord.repeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."));
    }

    @Test
    public void testRepeatedWord_NoRepeat() {

        assertEquals("Must not find the first repeated word in the string", "",
                RepeatedWord.repeatedWord("A quick brown fox."));
    }


}