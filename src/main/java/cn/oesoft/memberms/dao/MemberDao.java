package cn.oesoft.memberms.dao;

import cn.oesoft.memberms.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberDao extends JpaRepository<Member,String> {
    /**
     * 根据卡号查询会员信息
     * @param sn
     * @return
     */
    List<Member> findBySn(String sn);
}
