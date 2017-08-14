package com.yfax.webapi;

import java.util.HashMap;
import java.util.Map;

public interface GlobalUtils {
	/**
	 * 统一访问前缀：/yfax-webapi
	 */
	public static final String URL = "/yfax-webapi";
	/**
	 * 返利达人api接口：/api/cfdb
	 */
	public static final String PROJECT_CFDB = "/api/cfdb";
	/**
	 * 有米渠道标识
	 */
	public static final int YOUMI = 5;
	/**
	 * 有米平台标识
	 */
	public static final String YOUMI_CN = "youmi";
	/**
	 * 点入渠道标识
	 */
	public static final int DIANRU = 4;
	/**
	 * 点入平台标识
	 */
	public static final String DIANRU_CN = "dianru";
	/**
	 * 格式化
	 */
	public static final String DECIMAL_FORMAT = "#0.000";
	/**
	 * app用户统一密码
	 */
	public final static String CFDB_PWD="D6Z6ek1STzQnRSNg";
	/**
	 * 内存-缓存
	 */
	public static Map<String, Object> dataCache = new HashMap<String, Object>();
	public static Map<String, Object> flagCache = new HashMap<String, Object>();
}
