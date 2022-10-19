package business;

import java.util.List;

import logging.Logger;


import dataAccsess.CategoryDao;
import entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;

	public CategoryManager (CategoryDao categoryDao, Logger[] loggers, List<Category> categories){
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;

	}
	
	public void add(Category category) throws Exception{
		for(Category newCategoryName:categories) {
			if(category.getCategoryName() == newCategoryName.getCategoryName()) {
				throw new Exception("Kategori adı tekrar edemez.");
			}
		}
		
		categoryDao.add(category);
		categories.add(category);
		
		for(Logger logger:loggers) {
			logger.log(category.getCategoryName());
		}
	}

}
