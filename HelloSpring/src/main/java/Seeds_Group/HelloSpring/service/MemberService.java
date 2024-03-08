package Seeds_Group.HelloSpring.service;

import Seeds_Group.HelloSpring.Repository.MemberRepository;
import Seeds_Group.HelloSpring.Entity.Member;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@AllArgsConstructor
@Service
public class MemberService {
    private MemberRepository MemberRepository;

    public List<Member> findAll() {
        return MemberRepository.findAll();
    }

    public Member findOne(Long id) {
        return MemberRepository.getReferenceById(id);
    }

    @Transactional
    public Member save(Member member) {
        return MemberRepository.save(member);
    }

    @Transactional
    public Member update(Long id, Member newMember) {
        Member member = MemberRepository.getReferenceById(id);
        member.setUserName(newMember.getUserName());
        member.setUserAge(newMember.getUserAge());
        member.setUserPhoneNumber(newMember.getUserPhoneNumber());
        return MemberRepository.save(member);
    }

    @Transactional
    public void delete(Long id) {
       Member member = MemberRepository.getReferenceById(id);
        MemberRepository.delete(member);
    }

}
