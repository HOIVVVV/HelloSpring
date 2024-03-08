package Seeds_Group.HelloSpring.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String userName;
    private String userAge;
    private String userPhoneNumber;
}
