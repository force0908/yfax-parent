package com.yfax.webapi.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yfax.webapi.cfdb.vo.SdkChannelConfigVo;
import com.yfax.webapi.dao.SdkChannelConfigDao;

@Component
public class SdkChannelConfigDaoImpl implements SdkChannelConfigDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<SdkChannelConfigVo> selectSdkChannelConfigList() {
		return this.sqlSessionTemplate.selectList("selectSdkChannelConfig");
	}

	@Override
	public SdkChannelConfigVo selectSdkChannelConfigByFlag(String channelFlag) {
		return this.sqlSessionTemplate.selectOne("selectSdkChannelConfigByFlag", channelFlag);
	}
}
