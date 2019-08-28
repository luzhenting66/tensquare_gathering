package cn.pipilu.tensquare.gathering.service.impl;

import cn.pipilu.tensquare.gathering.entity.GatheringEntity;
import cn.pipilu.tensquare.gathering.mapper.GatheringMapper;
import cn.pipilu.tensquare.gathering.response.QueryGatheringListResp;
import cn.pipilu.tensquare.gathering.service.GatheringService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GatheringServiceImpl implements GatheringService {
@Autowired
private GatheringMapper gatheringMapper;
    @Override
    public QueryGatheringListResp findList(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        PageInfo<GatheringEntity> pageInfo = new PageInfo<>(gatheringMapper.selectAll());
        QueryGatheringListResp result = new QueryGatheringListResp();
        result.setData(pageInfo.getList());
        result.setTotal(pageInfo.getTotal());
        result.setSize(pageInfo.getSize());
        return result;
    }
}
