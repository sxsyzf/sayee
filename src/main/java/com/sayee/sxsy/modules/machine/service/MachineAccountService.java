/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.sayee.sxsy.modules.machine.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sayee.sxsy.common.persistence.Page;
import com.sayee.sxsy.common.service.CrudService;
import com.sayee.sxsy.modules.machine.entity.MachineAccount;
import com.sayee.sxsy.modules.machine.dao.MachineAccountDao;

/**
 * 台账信息展示Service
 * @author zhangfan
 * @version 2019-05-17
 */
@Service
@Transactional(readOnly = true)
public class MachineAccountService extends CrudService<MachineAccountDao, MachineAccount> {

	public MachineAccount get(String id) {
		return super.get(id);
	}
	
	public List<MachineAccount> findList(MachineAccount machineAccount) {
		return super.findList(machineAccount);
	}
	
	public Page<MachineAccount> findPage(Page<MachineAccount> page, MachineAccount machineAccount) {
		return super.findPage(page, machineAccount);
	}
	
	@Transactional(readOnly = false)
	public void save(MachineAccount machineAccount) {
		super.save(machineAccount);
	}
	
	@Transactional(readOnly = false)
	public void delete(MachineAccount machineAccount) {
		super.delete(machineAccount);
	}
	
}