/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.sayee.sxsy.modules.sys.dao;

import com.sayee.sxsy.modules.sys.entity.Area;
import com.sayee.sxsy.common.persistence.TreeDao;
import com.sayee.sxsy.common.persistence.annotation.MyBatisDao;

/**
 * 区域DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
