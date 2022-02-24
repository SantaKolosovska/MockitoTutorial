package Business;

import business.ToDoBusinessImpl;
import data.api.ToDoService;
import data.api.ToDoServiceStub;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ToDoBusinessImplStubTest {

    // check if there are as many items in list as expected
    @Test
    public void testRetrieveTodosRelatedToString_usingAStub() {
        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceStub);

        List<String> filterTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filterTodos.size());
    }

    public void testRetrieveTodosRelatedToString_usingAStub1() {
        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceStub);

        List<String> filterTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filterTodos.size());
    }


    // check if the list contains a given string
    @Test
    public void testIfTodosListContainsGivenStrings_usingAStub() {
        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceStub);

        List<String> filterTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertTrue(filterTodos.contains("Learn Spring MVC"));
    }

    // check if the given string is at the given position in list
    @Test
    public void testIfTodosListContainsGivenString_usingAStub() {
        ToDoService toDoServiceStub = new ToDoServiceStub();
        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceStub);

        List<String> filterTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals("Learn Spring MVC", filterTodos.get(0));
    }
}
