package com.yfax.webapi.dao;

import java.util.List;

import com.yfax.webapi.vo.SdkChannelConfigVo;

public interface SdkChannelConfigDao {
	public List<SdkChannelConfigVo> selectSdkChannelConfigList();
}