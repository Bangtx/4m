package m.com.vn.api.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    private int createdBy;
    private Timestamp modifiedAt;
    private int modifiedBy;
    private Timestamp deletedAt;
    private int deletedBy;
    private boolean active = true;
}
