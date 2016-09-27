package com.xxl.glue.core.broadcast;

import java.util.Properties;

/**
 * 环境基类
 * @author xuxueli 2015-8-28 10:37:43
 */
public class Environment {

	/**
	 * glue topic path, consumerpath : /xxl-glue/glue01
     */
	public static final String GLUE_TOPIC_PATH = "/xxl-glue";

	/**
	 * zk config file
	 */
	private static final String ZK_ADDRESS_FILE = "/data/webapps/xxl-conf.properties";

	/**
	 * zk address
	 */
	public static final String ZK_ADDRESS;		// zk地址：格式	ip1:port,ip2:port,ip3:port
	
	static {
		Properties prop = PropertiesUtil.loadFileProperties(ZK_ADDRESS_FILE);
		ZK_ADDRESS = PropertiesUtil.getString(prop, "zkserver");
	}
	
	public static void main(String[] args) {
		System.out.println(ZK_ADDRESS);
	}

}

