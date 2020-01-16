package cn.oesoft.memberms.service.impl;

import cn.oesoft.memberms.dao.MemberDao;
import cn.oesoft.memberms.domain.Member;
import cn.oesoft.memberms.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao memberDao;
    @Override
    public List<Member> findBySn(String sn) {

        return memberDao.findBySn(sn);
    }
}
