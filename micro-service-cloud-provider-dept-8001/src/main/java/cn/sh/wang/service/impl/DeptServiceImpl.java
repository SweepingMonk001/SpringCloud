package cn.sh.wang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sh.wang.mapper.DeptMapper;
import cn.sh.wang.service.DeptService;
import cn.sh.wang.springcloud.pojo.Dept;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public boolean add(Dept dept)
	{
		return deptMapper.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return deptMapper.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return deptMapper.findAll();
	}

}
