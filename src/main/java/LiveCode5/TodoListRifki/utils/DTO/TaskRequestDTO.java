package LiveCode5.TodoListRifki.utils.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class TaskRequestDTO {
    private String title;
    private String description;
    private LocalDateTime dueDate;
}
