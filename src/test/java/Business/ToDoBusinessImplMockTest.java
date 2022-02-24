package Business;

import business.ToDoBusinessImpl;
import data.api.ToDoService;
import data.api.ToDoServiceStub;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.*;

// Mocking is creating objects that simulate the behaviour of real objects.
// Unlike stubs, mocks can be dynamically created from code - at runtime.
// Mocks offer more fucntionality than stubbing. You can verify method calls and a lot of other things.

public class ToDoBusinessImplMockTest {

    // check if there are as many items in list as expected
    @Test
    public void testRetrieveTodosRelatedToString_usingAMock() {
        ToDoService toDoServiceMock = mock(ToDoService.class);

        // values to return with mock
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");

        // when this method is called return these values
        when(toDoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);

        List<String> filterTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filterTodos.size());
    }

    // check if the list is empty
    @Test
    public void testRetrieveEmptyTodosRelatedToString_usingAMock() {
        ToDoService toDoServiceMock = mock(ToDoService.class);

        // values to return with mock
        List<String> todos = Arrays.asList();

        // when this method is called return these values
        when(toDoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);

        List<String> filterTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0, filterTodos.size());
    }

    // mock by default returns an empty list
    @Test
    public void testRetrieveDefaultTodosRelatedToString_usingAMock() {
        ToDoService toDoServiceMock = mock(ToDoService.class);
        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);

        List<String> filterTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0, filterTodos.size());
    }

    // check if the list contains a given string
    @Test
    public void testIfTodosListContainsGivenStrings_usingAMock() {
        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceStub);

        List<String> filterTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertTrue(filterTodos.contains("Learn Spring MVC"));
    }

    // check if the given string is at the given position in list
    @Test
    public void testIfTodosListContainsGivenString_usingAMock() {
        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceStub);

        List<String> filterTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals("Learn Spring MVC", filterTodos.get(0));
    }
}
