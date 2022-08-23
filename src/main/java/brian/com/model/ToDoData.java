package brian.com.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ToDoData {

    // == FIELDS ==
    private static int idValue = 1;

    private final List<ToDoItem> items = new ArrayList<>();

    // == CONSTRUCTORS ==
    public ToDoData() {

        // adding dummy data using addItem method so it sets Id field
        addItem(new ToDoItem("first","first details", LocalDate.now()));
        addItem(new ToDoItem("second","2nd details", LocalDate.now()));
        addItem(new ToDoItem("third","3rd details", LocalDate.now()));
        addItem(new ToDoItem("fourth","4th details", LocalDate.now()));
    }

    // == PUBLIC METHODS ==
    public List<ToDoItem> getItems(){
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull ToDoItem toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(int id){
        ListIterator<ToDoItem> itemIterator = items.listIterator();

        while(itemIterator.hasNext()){
            ToDoItem item = itemIterator.next();

            if(item.getId() == id) {
                itemIterator.remove();
                break;
            }
        }
    }

    public ToDoItem getItem(int id){
        for(ToDoItem item : items) {
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull ToDoItem toUpdate) {
        ListIterator<ToDoItem> itemIterator = items.listIterator();

        while(itemIterator.hasNext()){
            ToDoItem item = itemIterator.next();

            if(item.equals(toUpdate)){
                itemIterator.set(toUpdate);
                break;
            }
        }
    }
}
