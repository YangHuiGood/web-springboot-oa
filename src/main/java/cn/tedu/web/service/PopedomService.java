package cn.tedu.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;

import cn.tedu.common.service.HttpClientService;
import cn.tedu.common.util.ObjectUtil;
import cn.tedu.web.pojo.RolePopedom;

@Service
public class PopedomService {
	
	@Autowired
	private HttpClientService client;
	
	// 查询角色权限
	public List<RolePopedom> selectRolePope(Integer roleId) throws Exception {
		String url = "http://popedom.oa.com/popedom/selectRolePope/" + roleId;
		String jsonData = client.doGet(url);
		List<RolePopedom> rpList = null;
		JsonNode data = ObjectUtil.mapper.readTree(jsonData);
		if (data.isArray() && data.size() > 0) {
			rpList = ObjectUtil.mapper.readValue(data.traverse(),
					ObjectUtil.mapper.getTypeFactory().constructCollectionType(List.class, RolePopedom.class));
		}
		return rpList;
	}
	
	//角色权限列表
	public List<RolePopedom> queryRolePope() throws Exception {
		String url = "http://popedom.oa.com/popedom/rolePopeList";
		String jsonData = client.doGet(url);
		List<RolePopedom> rpList = null;
		JsonNode data = ObjectUtil.mapper.readTree(jsonData);
		if(data.isArray()&&data.size()>0){
			rpList = ObjectUtil.mapper.readValue(data.traverse(), ObjectUtil.mapper.getTypeFactory()
					.constructCollectionType(List.class, RolePopedom.class));
		}
		return rpList;
	}

	public String deleteRolePope(String roleName, String popedomName) throws Exception {
		String url = "http://popedom.oa.com/popedom/deleteRolePope";
		String result = client.doGet(url);
		return result;
	}

	public String addRolePope(String roleName, String popedomName) throws Exception {
		String url = "http://popedom.oa.com/popedom/addRolePope";
		String result = client.doGet(url);
		return result;
	}
	
}
