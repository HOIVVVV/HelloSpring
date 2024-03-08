package Seeds_Group.HelloSpring.Repository;

import Seeds_Group.HelloSpring.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

//Member에 대한 Jpa의 기본적인 CRUD 기능 제공
public interface MemberRepository extends JpaRepository<Member, Long> {
}

