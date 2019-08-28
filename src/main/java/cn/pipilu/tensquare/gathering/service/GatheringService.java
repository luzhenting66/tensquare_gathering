package cn.pipilu.tensquare.gathering.service;

import cn.pipilu.tensquare.gathering.entity.GatheringEntity;
import cn.pipilu.tensquare.gathering.response.QueryGatheringListResp;

import java.util.List;

public interface GatheringService {

    QueryGatheringListResp findList(int pageNo, int pageSize);
}
