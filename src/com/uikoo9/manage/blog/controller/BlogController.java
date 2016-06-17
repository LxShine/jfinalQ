package com.uikoo9.manage.blog.controller;

import java.util.List;

import com.uikoo9.manage.blog.model.BlogArticleModel;
import com.uikoo9.manage.blog.model.BlogTypeModel;
import com.uikoo9.util.core.annotation.QControllerUrl;
import com.uikoo9.util.plugin.json.QJsonUtil;
import com.uikoo9.z.jfinal.QController;

/**
 * BlogArticleController
 * @author qiaowenbin
 */
@QControllerUrl("/blog")
public class BlogController extends QController{
	
	
	/**
	 * 跳转博客
	 */
	public void list(){
		List<BlogArticleModel> blogs = BlogArticleModel.dao.findAll();
		List<BlogTypeModel> blogTypes = BlogTypeModel.dao.findAll();
		setAttr("blogs", blogs);
		setAttr("blogTypes", blogTypes);
		render("/WEB-INF/view/fore/blog/blog-list.html");
	}
	
	
	
}
