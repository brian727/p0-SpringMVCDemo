package brian.com.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
public class ToDoItem {

    // == FIELDS == //
    private int id;
    private String title;
    private String details;
    private LocalDate deadline;

    // == CONSTRUCTORS ==
    public ToDoItem(String title, String details, LocalDate deadline) {
        this.title = title;
        this.details = details;
        this.deadline = deadline;
    }
}

