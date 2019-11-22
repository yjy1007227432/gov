package org.competition.controller.Admin;

import org.competition.bean.Information;
import org.competition.bean.RespBean;
import org.competition.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 超级管理员专属Controller
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    InformationService informationService;

    @RequestMapping(value = "/information/all", method = RequestMethod.GET)
    public Map<String, Object> getInformationByStateByAdmin(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "count", defaultValue = "6") Integer count, String keywords) {
        List<Information> informations = informationService.getInformationByState(-2, page, count, keywords);
        Map<String, Object> map = new HashMap<>();
        map.put("informations", informations);
        map.put("totalCount", informationService.getInformationCountByState(1, null, keywords));
        return map;
    }

    @RequestMapping(value = "/information/dustbin", method = RequestMethod.PUT)
    public RespBean updateInformationState(Long[] aids, Integer state) {
        if (informationService.updateInformationState(aids, state) == aids.length) {
            return new RespBean("success", "删除成功!");
        }
        return new RespBean("error", "删除失败!");
    }
}
