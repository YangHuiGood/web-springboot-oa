package cn.tedu.web.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Task implements Serializable{
	/*
<<<<<<< HEAD
<<<<<<< HEAD
	 *   `task_id` varchar(20) NOT NULL AUTO_INCREMENT COMMENT '任务id',
=======
	 *   `task_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务id',
>>>>>>> taskFinish2.0
=======
	 *   `task_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务id',
>>>>>>> 8c748335c838af34dd9df6e359b5b356fb99f385
  `task_post_id` bigint(20) NOT NULL COMMENT '任务发布者id',
  `task_get_id` bigint(20) NOT NULL COMMENT '任务接收者id',
  `task_content` text NOT NULL COMMENT '任务内容',
  `task_create_time` date NOT NULL COMMENT '任务创建时间',
  `task_end_time` date NOT NULL COMMENT '任务截止时间',
  `task_finish_time` date NOT NULL COMMENT '任务完成时间',
  `task_status` int(11) NOT NULL COMMENT '1:表示待完成，2：表示待接收，3：表示已拒绝，4：表示已完成',
	 * 
	 * */
	//taskId=1&taskPostId=2&taskGetId=123456&taskContent=嘎嘎嘎嘎嘎&taskEndTime=2028-10-10
	private String taskId;
	private String taskPostId;
	private String taskGetId;	
	private String taskContent;
	private Date taskCreateTime;
	private Date taskEndTime;
	private Date taskFinishTime;
	private int taskStatus;
	
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskPostId() {
		return taskPostId;
	}
	public void setTaskPostId(String taskPostId) {
		this.taskPostId = taskPostId;
	}
	public String getTaskGetId() {
		return taskGetId;
	}
	public void setTaskGetId(String taskGetId) {
		this.taskGetId = taskGetId;
	}
	public String getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}
	public Date getTaskCreateTime() {
		return taskCreateTime;
	}
	public void setTaskCreateTime(Date taskCreateTime) {
		this.taskCreateTime = taskCreateTime;
	}
	public Date getTaskEndTime() {
		return taskEndTime;
	}
	public void setTaskEndTime(Date taskEndTime) {
		this.taskEndTime = taskEndTime;
	}
	public Date getTaskFinishTime() {
		return taskFinishTime;
	}
	public void setTaskFinishTime(Date taskFinishTime) {
		this.taskFinishTime = taskFinishTime;
	}
	public int getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskPostId=" + taskPostId + ", taskGetId=" + taskGetId + ", taskContent="
				+ taskContent + ", taskCreateTime=" + taskCreateTime + ", taskEndTime=" + taskEndTime
				+ ", taskFinishTime=" + taskFinishTime + ", taskStatus=" + taskStatus + "]";
	}
	
}
