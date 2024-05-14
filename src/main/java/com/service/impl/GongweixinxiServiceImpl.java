package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongweixinxiDao;
import com.entity.GongweixinxiEntity;
import com.service.GongweixinxiService;
import com.entity.vo.GongweixinxiVO;
import com.entity.view.GongweixinxiView;

@Service("gongweixinxiService")
public class GongweixinxiServiceImpl extends ServiceImpl<GongweixinxiDao, GongweixinxiEntity> implements GongweixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongweixinxiEntity> page = this.selectPage(
                new Query<GongweixinxiEntity>(params).getPage(),
                new EntityWrapper<GongweixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongweixinxiEntity> wrapper) {
		  Page<GongweixinxiView> page =new Query<GongweixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongweixinxiVO> selectListVO(Wrapper<GongweixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongweixinxiVO selectVO(Wrapper<GongweixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongweixinxiView> selectListView(Wrapper<GongweixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongweixinxiView selectView(Wrapper<GongweixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
