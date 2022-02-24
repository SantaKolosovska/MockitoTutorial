package Business;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;
//import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;


public class ListTest {

    @Test
    public void letsMockListSizeMethod() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
    }

    @Test
    public void letsMockListSizeMethod_ReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
    }

    @Test
    public void letsMockListGet() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("I'm fine");
        assertEquals("I'm fine", listMock.get(0));
        assertEquals(null, listMock.get(1));        // nice mock - returns default value if nothing is set
    }

    @Test
    public void letsMockList_usingMatchers() {
        List listMock = mock(List.class);

        // Argument matcher
        when(listMock.get(anyInt())).thenReturn("I'm fine");
        assertEquals("I'm fine", listMock.get(0));
        assertEquals("I'm fine", listMock.get(1));        // nice mock - returns default value (in this case
                                                                  // null) if nothing is set
    }

    @Test(expected = RuntimeException.class)    // - if these brackets are removed, you get java.lang.RuntimeException: Some exception
    public void letsMockList_throwAnException() {
        List listMock = mock(List.class);

        // Argument matcher
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Some exception"));
        listMock.get(0);

    }

}
