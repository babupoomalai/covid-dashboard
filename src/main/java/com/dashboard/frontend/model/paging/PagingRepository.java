package com.dashboard.frontend.model.paging;

import org.springframework.data.repository.CrudRepository;

public interface PagingRepository<T, ID> extends CrudRepository<T, ID> {
	Iterable<T> findAll();
}