package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jiangwb
 * @email 45100928@qq.com
 * @date 2020-03-17 09:11:35
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
