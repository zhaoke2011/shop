/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.fhd.service;

import java.util.Date;
import java.util.List;

import com.fhd.Order;
import com.fhd.Page;
import com.fhd.entity.Article;
import com.fhd.entity.ArticleCategory;
import com.fhd.Filter;
import com.fhd.Pageable;
import com.fhd.entity.Tag;

/**
 * Service - 文章
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
public interface ArticleService extends BaseService<Article, Long> {

	/**
	 * 查找文章
	 * 
	 * @param articleCategory
	 *            文章分类
	 * @param tags
	 *            标签
	 * @param count
	 *            数量
	 * @param filters
	 *            筛选
	 * @param orders
	 *            排序
	 * @return 仅包含已发布文章
	 */
	List<Article> findList(ArticleCategory articleCategory, List<Tag> tags, Integer count, List<Filter> filters, List<Order> orders);

	/**
	 * 查找文章(缓存)
	 * 
	 * @param articleCategory
	 *            文章分类
	 * @param tags
	 *            标签
	 * @param count
	 *            数量
	 * @param filters
	 *            筛选
	 * @param orders
	 *            排序
	 * @param cacheRegion
	 *            缓存区域
	 * @return 仅包含已发布文章
	 */
	List<Article> findList(ArticleCategory articleCategory, List<Tag> tags, Integer count, List<Filter> filters, List<Order> orders, String cacheRegion);

	/**
	 * 查找文章
	 * 
	 * @param articleCategory
	 *            文章分类
	 * @param beginDate
	 *            起始日期
	 * @param endDate
	 *            结束日期
	 * @param first
	 *            起始记录
	 * @param count
	 *            数量
	 * @return 仅包含已发布文章
	 */
	List<Article> findList(ArticleCategory articleCategory, Date beginDate, Date endDate, Integer first, Integer count);

	/**
	 * 查找文章分页
	 * 
	 * @param articleCategory
	 *            文章分类
	 * @param tags
	 *            标签
	 * @param pageable
	 *            分页信息
	 * @return 仅包含已发布文章
	 */
	Page<Article> findPage(ArticleCategory articleCategory, List<Tag> tags, Pageable pageable);

	/**
	 * 查看并更新点击数
	 * 
	 * @param id
	 *            ID
	 * @return 点击数
	 */
	long viewHits(Long id);

}