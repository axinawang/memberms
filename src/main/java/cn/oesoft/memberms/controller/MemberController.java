package cn.oesoft.memberms.controller;

import cn.oesoft.memberms.domain.Member;
import cn.oesoft.memberms.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    private MemberService memberService;

    @RequestMapping("/sn/{sn}")
    public List<Member> findBySn(@PathVariable String sn){
        return memberService.findBySn(sn);
    }

}
