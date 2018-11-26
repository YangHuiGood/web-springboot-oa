package cn.tedu.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.common.util.ObjectUtil;
import cn.tedu.web.pojo.DataResult;
import cn.tedu.web.pojo.User;
import cn.tedu.web.service.FaceService;

@Controller
@RequestMapping("/face")
public class FaceController {

	@Autowired
	private FaceService faceService;

	/**
	 * 人脸注册
	 * 
	 * @throws Exception
	 */
	@RequestMapping("/regist")
	@ResponseBody
	public String faceRegist(String image, HttpServletRequest request) throws Exception {
		String path = request.getServletContext().getRealPath("/upload");
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		System.out.println(user.getUserName());
		return faceService.regist(image, path,user.getUserId());
	}
	
	/**
	 * 
	 */

	/**
	 * 统计数据
	 * 
	 * @throws Exception
	 */
	@RequestMapping("/weekData")
	@ResponseBody
	public String faceData() throws Exception {
		List<DataResult> list = new ArrayList<>();
		list.add(new DataResult("2018-11-26", "9:56:12"));
		list.add(new DataResult("2018-11-27", "8:56:12"));
		list.add(new DataResult("2018-11-28", "9:12:12"));
		list.add(new DataResult("2018-11-29", "9:32:12"));
		list.add(new DataResult("2018-11-30", "8:48:12"));
//		System.out.println(ObjectUtil.mapper.writeValueAsString(list));
		String str="Day,签到时间\r\n3/9/13,5691\r\n3/10/13,5430\r\n3/11/13,15574\r\n3/12/13,16211\r\n3/13/13,16427\r\n3/14/13,5691\r\n3/15/13,5430\r\n3/16/13,15574\r\n3/17/13,16211\r\n3/18/13,16427\r\n";
		System.out.println(str);
		return ObjectUtil.mapper.writeValueAsString(str);
	}

}
