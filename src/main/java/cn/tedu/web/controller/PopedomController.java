package cn.tedu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.web.pojo.RolePopedom;
import cn.tedu.web.service.PopedomService;

@Controller
public class PopedomController {
	
	@Autowired
	private PopedomService popedomService;
	
	//角色权限列表
	@RequestMapping("/popedom/rolePopeList")
	public String selectPope(Model model) throws Exception{
		List<RolePopedom> rpList = popedomService.queryRolePope();
		model.addAttribute("rpList", rpList);
		return "popedom-table";		
	}
	
	//角色权限删除
	@RequestMapping("/popedom/deleteRolePope")
	@ResponseBody
	public String deleteRolePope(String roleName,String popedomName) throws Exception{
		return popedomService.deleteRolePope(roleName,popedomName);
	}
	
	//角色权限添加
	@RequestMapping("/popedom/addRolePope")
	@ResponseBody
	public String addRolePope(String roleName,String popedomName) throws Exception{
		return popedomService.addRolePope(roleName,popedomName);
	}
}
