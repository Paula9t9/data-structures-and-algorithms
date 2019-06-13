package multiBracketValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void multiBracketValidation_simpleCurly() {

        assertTrue("These brackets are balanced, should return true",
                MultiBracketValidation.multiBracketValidation("{}"));
    }

    @Test
    public void multiBracketValidation_simpleMultiple() {
        assertTrue("These brackets are balanced, should return true",
                MultiBracketValidation.multiBracketValidation("{}(){}"));
    }

    @Test
    public void multiBracketValidation_extraCharacters() {
        assertTrue("These brackets are balanced, should return true",
                MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
    }

    @Test
    public void multiBracketValidation_trickyOrder() {
        assertTrue("These brackets are balanced, should return true",
                MultiBracketValidation.multiBracketValidation("(){}[[]]"));
    }

    @Test
    public void multiBracketValidation_trickyExtraCharacters() {
        assertTrue("These brackets are balanced, should return true",
                MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
    }

    @Test
    public void multiBracketValidation_unbalancedOddBrackets() {
        assertFalse("These brackets are unbalanced, should return false",
                MultiBracketValidation.multiBracketValidation("[({}]"));
    }

    @Test
    public void multiBracketValidation_unbalancedSimple() {
        assertFalse("These brackets are unbalanced, should return false",
                MultiBracketValidation.multiBracketValidation("(]("));
    }

    @Test
    public void multiBracketValidation_unmatchedOutOfOrder() {
        assertFalse("These brackets are unbalanced, should return false",
                MultiBracketValidation.multiBracketValidation("{(})"));
    }
}