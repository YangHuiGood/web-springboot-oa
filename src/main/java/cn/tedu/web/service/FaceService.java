package cn.tedu.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.common.service.HttpClientService;

@Service
public class FaceService {

	@Autowired
	private HttpClientService client;
	
	
	public String regist(String image,String path,String userId) throws Exception {
		String url="http://localhost:8089/face/regist";
		image=image+","+path+","+userId;
		String doPostJson = client.doPostJson(url, image);
		return doPostJson;
	}

}
