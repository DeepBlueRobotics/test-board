package frc.robot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

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