package com.sadhin.jobportal.jobportal.Entity;
import com.sadhin.jobportal.jobportal.Enum.UserType;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Data
@Entity
@Table(name = "user")
public class UserEntity{


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    @Column(name = "user_id", updatable = false, nullable = false)
    private UUID id;


    @Column
    private Instant cratedAt;

    @Column
    private Instant updatedAt;

    @Column
    private UserType userType;

    @Column
    private String password;

    @Column
    private String previousPassword;


}
