package cn.tedu.web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public Map<String,List<RolePopedom>> selectBigRolePope(Integer roleId) throws Exception {
		String url = "http://popedom.oa.com/popedom/selectBigRolePope/"+roleId;
		List<RolePopedom> rpList = null;
		Map<String,List<RolePopedom>> map = null;
		try {
			String jsonData = client.doGet(url);
			JsonNode data = ObjectUtil.mapper.readTree(jsonData);
			if (data.isArray() && data.size() > 0) {
				rpList = ObjectUtil.mapper.readValue(data.traverse(),
						ObjectUtil.mapper.getTypeFactory().constructCollectionType(List.class, RolePopedom.class));
			}
			//将list集合中的对象提出来，获取角色名和大权限名，再去查询小权限添加到map集合
			map = new HashMap<>();
			for(int i=0;i<rpList.size();i++){
				RolePopedom rp = rpList.get(i);
				String url2 = "http://popedom.oa.com/popedom/selectRolePope/"+rp.getRoleName()+"/"+rp.getPopedomId();
				String jsonData2 = client.doGet(url2);
				List<RolePopedom> rpList2 = null;
				JsonNode data2 = ObjectUtil.mapper.readTree(jsonData2);
				if(data2.isArray()&&data2.size()>0){
					rpList2 = ObjectUtil.mapper.readValue(data2.traverse(), ObjectUtil.mapper.getTypeFactory()
							.constructCollectionType(List.class, RolePopedom.class));
				}
				map.put(rp.getPopedomName(), rpList2);
			}
		} catch (Exception e) {
			return map;
		}	
		return map;
	}
	
	//角色权限列表
	public List<RolePopedom> queryRolePope() throws Exception {
		String url = "http://popedom.oa.com/popedom/rolePopeList";
		List<RolePopedom> rpList = null;
		try {
			String jsonData = client.doGet(url);
			JsonNode data = ObjectUtil.mapper.readTree(jsonData);
			if(data.isArray()&&data.size()>0){
				rpList = ObjectUtil.mapper.readValue(data.traverse(), ObjectUtil.mapper.getTypeFactory()
						.constructCollectionType(List.class, RolePopedom.class));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return rpList;
		}		
		return rpList;
	}

	public String deleteRolePope(String roleName, String popedomName) throws Exception {
		String url = "http://popedom.oa.com/popedom/deleteRolePope/"+roleName+"/"+popedomName;
		String result = client.doGet(url);
		return result;
	}

	public String addRolePope(String roleName, String popedomName) throws Exception {
		String url = "http://popedom.oa.com/popedom/addRolePope/"+roleName+"/"+popedomName;
		String result = client.doGet(url);
		return result;
	}
	
}
