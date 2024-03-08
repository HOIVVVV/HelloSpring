package Seeds_Group.HelloSpring.controller;

import Seeds_Group.HelloSpring.Entity.Member;
import Seeds_Group.HelloSpring.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    @GetMapping("/member")
    public List<Member> getMemberList() {
        return memberService.findAll();
    }

    //UI: member/대상 id
    @GetMapping("/member/{id}")
    public Member getMember(@PathVariable("id") Long id) {
        return memberService.findOne(id);
    }

    //UI: member
    //Body: member 정보
    @PostMapping("/member")
    public Member saveMember(@RequestBody Member member) {
        return memberService.save(member);
    }

    //UI: member/대상 id
    //Body: 변경할 member 정보
    @PutMapping("/member/{id}")
    public Member updateMember(@RequestBody Member member, @PathVariable("id") Long id) {
        return memberService.update(id, member);
    }

    //UI: member/대상 id
    @DeleteMapping("/member/{id}")
    public void deleteMember(@PathVariable("id") Long id) {
        memberService.delete(id);
    }
}
