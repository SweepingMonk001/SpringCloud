package cn.sh.wang.service;


import java.util.List;

import cn.sh.wang.springcloud.pojo.Dept;


public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
