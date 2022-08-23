package brian.com.controller;

import brian.com.model.ToDoData;
import brian.com.util.Mappings;
import brian.com.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ToDoItemController {

    // == MODEL ATTRIBUTES ==
    @ModelAttribute
    public ToDoData toDoData() {
        return new ToDoData();
    }

    // == HANDLER METHODS ==
        // http://localhost:8080/todolist/items
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }
}
