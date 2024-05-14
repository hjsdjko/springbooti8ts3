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


import com.dao.ShiyongqingkuangDao;
import com.entity.ShiyongqingkuangEntity;
import com.service.ShiyongqingkuangService;
import com.entity.vo.ShiyongqingkuangVO;
import com.entity.view.ShiyongqingkuangView;

@Service("shiyongqingkuangService")
public class ShiyongqingkuangServiceImpl extends ServiceImpl<ShiyongqingkuangDao, ShiyongqingkuangEntity> implements ShiyongqingkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyongqingkuangEntity> page = this.selectPage(
                new Query<ShiyongqingkuangEntity>(params).getPage(),
                new EntityWrapper<ShiyongqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyongqingkuangEntity> wrapper) {
		  Page<ShiyongqingkuangView> page =new Query<ShiyongqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyongqingkuangVO> selectListVO(Wrapper<ShiyongqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyongqingkuangVO selectVO(Wrapper<ShiyongqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyongqingkuangView> selectListView(Wrapper<ShiyongqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyongqingkuangView selectView(Wrapper<ShiyongqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
