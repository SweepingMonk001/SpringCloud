package cn.sh.wang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.sh.wang.springcloud.pojo.Dept;

@Mapper
public interface DeptMapper
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}