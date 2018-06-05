package com.test.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.shoppingbackend.dao.CategoryDAO;
import com.test.shoppingbackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.test.shoppingbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}
/*
	@Test
	public void testAddCategory() {
		// Adding first category...
		category =  new Category ();
		//category.setId(1);
		category.setName("Mobile");
		category.setDescription("Description for Mobile!");
		category.setImageURL("CAT_3.png");
	
		assertEquals("Successfully added a category inside a table...", true, categoryDAO.add(category)) ;
	
	}*/

	/*	@Test
		public void testGetCategory() {
			category = categoryDAO.get(3);
			assertEquals("Successfully fetched a single category from table", "Mobile", category.getName());
	
		}*/

/*		@Test
		public void testUpdateCategory() {
			category = categoryDAO.get(1) ;
			category.setName("TV");
			
			assertEquals("Successfully updated the category..", true, categoryDAO.update(category));
					
		}*/

	@Test
	public void testDeleteCategory() {
		category = categoryDAO.get(4);
		assertEquals("Successfully deleted category from database", true, categoryDAO.delete(category));
	}

}
