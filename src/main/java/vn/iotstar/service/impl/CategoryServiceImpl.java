package vn.iotstar.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vn.iotstar.entity.Category;
import vn.iotstar.reponsitory.CategoryReponsitory;
import vn.iotstar.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	
	@Autowired
	CategoryReponsitory categoryReponsitory;

	public CategoryServiceImpl(CategoryReponsitory categoryRepository) {
		this.categoryReponsitory = categoryReponsitory;
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return categoryReponsitory.findAll(sort);
	}

	@Override
	public <S extends Category> S save(S entity) {
		return categoryReponsitory.save(entity);
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryReponsitory.findAll(pageable);
	}

	@Override
	public List<Category> findAll() {
		return categoryReponsitory.findAll();
	}

	@Override
	public List<Category> findAllById(Iterable<Long> ids) {
		return categoryReponsitory.findAllById(ids);
	}

	@Override
	public Optional<Category> findById(Long id) {
		return categoryReponsitory.findById(id);
	}

	@Override
	public long count() {
		return categoryReponsitory.count();
	}

	@Override
	public void deleteById(Long id) {
		categoryReponsitory.deleteById(id);
	}

	@Override
	public void delete(Category entity) {
		categoryReponsitory.delete(entity);
	}

	@Override
	public void deleteAll() {
		categoryReponsitory.deleteAll();
	}

	@Override
	public List<Category> findByCategorynameContaining(String name) {
		
		return categoryReponsitory.findByCategorynameContaining(name);
	}

	@Override
	public Page<Category> findByCategorynameContaining(String name, Pageable pageable) {
		return categoryReponsitory.findByCategorynameContaining(name, pageable);
	}
}
