package cn.pipilu.tensquare.gathering.response;

import cn.pipilu.tensquare.gathering.entity.GatheringEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class QueryGatheringListResp implements Serializable {
    private static final long serialVersionUID = -9139113863826973389L;
    private long total;
    private int size;
    private List<GatheringEntity> data;
}
