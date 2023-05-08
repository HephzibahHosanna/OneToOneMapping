package com.example.OneToOneMapping.Service;


import java.util.List;

import com.example.OneToOneMapping.Entity.Category;

public interface CategoryService {

	boolean createCategory(Category category);

	boolean updateCategory(Category category, Integer id);
	
	List<Category>getAllCategory();
	
}

