package cn.pipilu.tensquare.gathering.entity;

import cn.pipilu.plus.common.base.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "tb_gathering")
public class GatheringEntity extends BaseEntity {

    private static final long serialVersionUID = 693201023763992119L;
    private String name;//活动名称',
    private String summary;//大会简介',
    private String detail;//详细说明',
    private String sponsor;//主办方',
    private String image;//活动图片',
    private String startTime;//开始时间',
    private String endTime;//截止时间',
    private String address;//举办地点',
    private String enrollTime;//报名截止',
    private String state;//是否可见',
    private String city;//城市',
}
