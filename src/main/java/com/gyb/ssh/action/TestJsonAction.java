package com.gyb.ssh.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.json.annotations.JSON;
/**
 * JSON 数据测试Action
 * @author Administrator
 *
 */
public class TestJsonAction extends JsonAction{
	private static final long serialVersionUID = 1L;
	
	@Override
	@Action(value="/testjson")
	public String execute() throws Exception {
		resultMap.put("id", 1);
		resultMap.put("name", "gyb");
		
		return super.execute();
	}
	
	@JSON(name="rs")
	public Map<Object, Object> getResultMap() {
		return resultMap;
	}
	
}
