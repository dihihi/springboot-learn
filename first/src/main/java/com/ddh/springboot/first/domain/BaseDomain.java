/**
 * Date:2015年11月19日上午11:29:34
 * Copyright (c) 2015, kinghanhong software Inc. All Rights Reserved.
 * <a>http://www.kinghanhong.com</a>
 */
package com.ddh.springboot.first.domain;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：2015年11月19日 上午11:29:34 
 * 类说明 
 */
@MappedSuperclass
public abstract class BaseDomain implements Serializable {
	@Id
    private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id != null? id.hashCode() : super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		
		if (!(obj instanceof BaseDomain)) {
			return false;
		}
		
		BaseDomain baseDomain = (BaseDomain) obj;
		
		return this.getId().equals(baseDomain.getId());
	}

}
