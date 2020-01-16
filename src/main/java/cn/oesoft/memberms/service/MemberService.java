package cn.oesoft.memberms.service;

import cn.oesoft.memberms.domain.Member;

import java.util.List;

public interface MemberService {
    /**
     * 根据卡号查询会员信息
     * @param sn
     * @return
     */
    List<Member> findBySn(String sn);
}
