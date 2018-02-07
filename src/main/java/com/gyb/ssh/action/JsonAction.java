package com.gyb.ssh.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 返回JSON数据抽象Action。
 * <P>需要返回JSON数据的Action只需继承该类，并覆盖getResultMap()方法</p>
 * @author GengYB 
 *
 */

@ParentPackage("json-default")
@Result(type="json")
public abstract class JsonAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	protected Map<Object,Object> resultMap;
	{
		resultMap = new HashMap<>();
	}
	public Map<Object, Object> getResultMap() {
		return resultMap;
	}
	public void setResultMap(Map<Object, Object> resultMap) {
		this.resultMap = resultMap;
	}
	
}
