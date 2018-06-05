package com.test.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.shoppingbackend.dao.CategoryDAO;
import com.test.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// Adding first category...
		category.setId(1);
		category.setName("Television");
		category.setDescription("Description for television!");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// Second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// Third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for laptop");
		category.setImageURL("CAT_3.png");

		categories.add(category);

		// for (Category c : categories) {
		// System.out.println(c.getId());
		// }

	}

	// Gettign the category to the database table
	@Override
	public Category get(int id) {
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public List<Category> list() {

		return categories;
	}

	// Adding a single category to the database table
	@Override
	// @Transactional
	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	// Updating a category single records in database
	@Override
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// Deleting the category to the database table - setting active flag as false instead of actually deleting 
	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

}
