package com.atguigu.gmall.pms.service.impl;

import com.alibaba.nacos.client.naming.utils.CollectionUtils;
import com.alibaba.nacos.client.utils.StringUtils;
import com.atguigu.gmall.pms.vo.SpuInfoVO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;

import com.atguigu.gmall.pms.dao.SpuInfoDescDao;
import com.atguigu.gmall.pms.entity.SpuInfoDescEntity;
import com.atguigu.gmall.pms.service.SpuInfoDescService;


@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity> implements SpuInfoDescService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuInfoDescEntity> page = this.page(
                new Query<SpuInfoDescEntity>().getPage(params),
                new QueryWrapper<SpuInfoDescEntity>()
        );

        return new PageVo(page);
    }

    public void saveSpuInfoDesc(SpuInfoVO spuInfoVO, Long spuId) {
        List<String> spuImages = spuInfoVO.getSpuImages();
        if (!CollectionUtils.isEmpty(spuImages)){
            SpuInfoDescEntity spuInfoDescEntity = new SpuInfoDescEntity();
            // 注意：spu_info_desc表的主键是spu_id,需要在实体类中配置该主键不是自增主键
            spuInfoDescEntity.setSpuId(spuId);
            // 把商品的图片描述，保存到spu详情中，图片地址以逗号进行分割
            spuInfoDescEntity.setDecript(StringUtils.join(spuInfoVO.getSpuImages(), ","));
            this.save(spuInfoDescEntity);
        }
    }

}