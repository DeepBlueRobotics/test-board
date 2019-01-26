package frc.robot;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.List;

/**
 * MyTest
 */
public class ExampleTest {
    @Test
    public void junitTest() {
        assertEquals(2, 1+1);
    }
    
    @Test
    public void mockitoTest() {
        List mockedList = mock(List.class);

        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();
    }
}