package com.allsparkstudio.zaixiyou.controller;

import com.allsparkstudio.zaixiyou.pojo.form.CetInquireGradeForm;
import com.allsparkstudio.zaixiyou.pojo.form.CetInquireTicketForm;
import com.allsparkstudio.zaixiyou.pojo.vo.CetGradeVO;
import com.allsparkstudio.zaixiyou.pojo.vo.CetTicketVO;
import com.allsparkstudio.zaixiyou.pojo.vo.CetVerificationCodeVO;
import com.allsparkstudio.zaixiyou.service.CetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Marble
 * @Date: 2021/6/2 16:26
 * @Description: 与Cet相关的一些服务 目前有查询成绩 找回准考证功能
 *
 */
@RestController
@Api(tags = "Cet相关接口")
public class CetController {
    @Autowired
    CetService cetService;

    @GetMapping("/cet/score")
    @ApiOperation("获取四级成绩")
    public CetGradeVO getCetGrade(@RequestBody CetInquireGradeForm cetInquireGradeForm){
        CetGradeVO cetGrade = cetService.getCetGrade(cetInquireGradeForm);
        return cetGrade;
    }


    @GetMapping("/cet/verification")
    @ApiOperation("获取四级成绩验证码以及cookie信息")
    public CetVerificationCodeVO getVerificationCode(){
        CetVerificationCodeVO cetVerificationCodeVO = cetService.getVerificationCode();
        return cetVerificationCodeVO;
    }

    @GetMapping("/cet/findTicket")
    @ApiOperation("找回准考证号等信息")
    public CetTicketVO getTicket(@RequestBody CetInquireTicketForm cetInquireTicketForm){
        CetTicketVO backCetTicket = cetService.findBackCetTicket(cetInquireTicketForm);
        return backCetTicket;
    }
}
