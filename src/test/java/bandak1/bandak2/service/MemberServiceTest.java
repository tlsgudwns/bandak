//package bandak1.bandak2.service;
//
//import bandak1.bandak2.domain.Member;
//import bandak1.bandak2.repository.MemberRepository;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Transactional
//class MemberServiceTest {
//
//    @Autowired MemberService memberService;
//
//    @Autowired MemberRepository memberRepository;
//
//    @Test
//    public void 회원가입() throws Exception {
//        //given
//        Member member = new Member();
//        member.setLoginId("kim");
//
//        //when
//        Long savedId = memberService.join(member);
//
//        //then
//        Assert.assertEquals(member, memberRepository.findOne(savedId));
//    }
//
//    @Test
//    public void 중복회원예외() throws Exception {
//        //given
//
//        //when
//
//        //then
//    }
//}