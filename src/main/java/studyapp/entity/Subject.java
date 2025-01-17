package studyapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;
import lombok.Data;

@Entity
@Data
public class Subject {

    @Id
    private UUID id;
    private String name;
}
