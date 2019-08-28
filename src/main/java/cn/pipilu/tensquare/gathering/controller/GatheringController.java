package cn.pipilu.tensquare.gathering.controller;

import cn.pipilu.plus.common.response.Response;
import cn.pipilu.plus.common.util.ResponseUtil;
import cn.pipilu.tensquare.gathering.response.QueryGatheringListResp;
import cn.pipilu.tensquare.gathering.service.GatheringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/tensquare-gathering/gathering")
public class GatheringController {
    @Autowired
    private ResponseUtil responseUtil;
    @Autowired
    private GatheringService gatheringService;
    @RequestMapping(value = "/{pageNo}/{pageSize}",method = RequestMethod.GET)
    public Response<QueryGatheringListResp> findList(@PathVariable("pageNo")int pageNo, @PathVariable("pageSize")int pageSize){
        Response<QueryGatheringListResp> response = new Response<>();
        try {
            response.setRespData(gatheringService.findList(pageNo,pageSize));
            responseUtil.setRespParam(response);
        }catch (Exception e){
            responseUtil.setRespParam(response,e);
        }
        return response;
    }

}
