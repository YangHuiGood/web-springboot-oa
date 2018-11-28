package cn.tedu.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import cn.tedu.common.service.HttpClientService;
import cn.tedu.common.util.ObjectUtil;
import cn.tedu.web.pojo.User;

@Service
public class FaceService {

	@Autowired
	private HttpClientService client;
	
	
	public String savePic(String image,String path) throws Exception {
		String url="http://sign.oa.com/face/url";
		image=image+","+path;
		String doPostJson = client.doPostJson(url, image);
		return doPostJson;
	}


	public int regist(User user) throws Exception {
		String url="http://sign.oa.com/face/regist";
		String userStr=ObjectUtil.mapper.writeValueAsString(user);
		String doPostJson = client.doPostJson(url, userStr);
		return Integer.parseInt(doPostJson);
	}


	public boolean book(String image) throws Exception {
		String url="http://sign.oa.com/face/book";
		String imageStr=image.split(",")[1];
		String doPostJson = client.doPostJson(url, imageStr);
		int s = Integer.parseInt(doPostJson);
		if(s==1){
			return true;
		}
		return false;
	}

}
