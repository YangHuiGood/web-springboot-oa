package cn.tedu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.web.pojo.RolePopedom;
import cn.tedu.web.service.PopedomService;

@Controller
@RequestMapping("/popedom")
public class PopedomController {
	
	@Autowired
	private PopedomService popedomService;
	
	//角色权限列表
	@RequestMapping("")
	public List<RolePopedom> selectPope() throws Exception{
		return popedomService.queryRolePope();		
	}
	
	//角色权限删除
	@RequestMapping("")
	@ResponseBody
	public String deleteRolePope(String roleName,String popedomName) throws Exception{
		return popedomService.deleteRolePope(roleName,popedomName);
	}
	
	//角色权限添加
	@RequestMapping("")
	@ResponseBody
	public String addRolePope(String roleName,String popedomName) throws Exception{
		return popedomService.addRolePope(roleName,popedomName);
	}
}
