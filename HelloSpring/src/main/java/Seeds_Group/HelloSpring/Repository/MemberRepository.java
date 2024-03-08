package Seeds_Group.HelloSpring.Repository;

import Seeds_Group.HelloSpring.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

