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


import com.dao.GongweifenpeiDao;
import com.entity.GongweifenpeiEntity;
import com.service.GongweifenpeiService;
import com.entity.vo.GongweifenpeiVO;
import com.entity.view.GongweifenpeiView;

@Service("gongweifenpeiService")
public class GongweifenpeiServiceImpl extends ServiceImpl<GongweifenpeiDao, GongweifenpeiEntity> implements GongweifenpeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongweifenpeiEntity> page = this.selectPage(
                new Query<GongweifenpeiEntity>(params).getPage(),
                new EntityWrapper<GongweifenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongweifenpeiEntity> wrapper) {
		  Page<GongweifenpeiView> page =new Query<GongweifenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongweifenpeiVO> selectListVO(Wrapper<GongweifenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongweifenpeiVO selectVO(Wrapper<GongweifenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongweifenpeiView> selectListView(Wrapper<GongweifenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongweifenpeiView selectView(Wrapper<GongweifenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
