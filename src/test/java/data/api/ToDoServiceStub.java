package data.api;

import java.util.Arrays;
import java.util.List;


// has to override all methods of the implemented class - can become a headache.
// Stubs can be used in very simple scenarios
public class ToDoServiceStub  implements ToDoService {

    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");
    }
}
