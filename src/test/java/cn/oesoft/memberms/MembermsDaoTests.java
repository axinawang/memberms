package cn.oesoft.memberms;

import cn.oesoft.memberms.dao.MemberDao;
import cn.oesoft.memberms.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MembermsDaoTests {
@Autowired
private MemberDao dao;
    @Test
    void contextLoads() {
    }
    @Test
    void findBySntest() {
        List<Member> memberList = dao.findBySn("1001");
        System.out.println(memberList.get(0));
    }

}
