package business;

import data.api.ToDoService;

import java.util.ArrayList;
import java.util.List;

// ToDoBusinessImpl is SUT (system under test)
// ToDoService is dependency
public class ToDoBusinessImpl {

    private ToDoService toDoService;

    public ToDoBusinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = toDoService.retrieveTodos(user);
        for (String todo : todos) {
            if(todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }
}
