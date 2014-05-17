package org.gdg.bcn.mentora.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleClassTest {
    ExampleClass exampleClass;

    @Before
    public void setUp() { exampleClass= new ExampleClass(); }

    @After
    public void tearDown() { exampleClass = null; }

    @Test
    public void testJUnitWorks(){
        assertNotNull(exampleClass);
        //assertFalse(true);
    }

    @Test
    public void hashForEmptyStringShouldBeAnEmptyString() throws ExampleClass.makeHashNullString {
        assertEquals("",exampleClass.makeHash(""));
    }

    @Test
    public void hashForAShouldBeASDF() throws ExampleClass.makeHashNullString {
        assertEquals("ASDF",exampleClass.makeHash("a"));
    }

    @Test(expected = ExampleClass.makeHashNullString.class)
    public void hashForNullShouldThrowAnException() throws ExampleClass.makeHashNullString {
        exampleClass.makeHash(null);
    }

}
