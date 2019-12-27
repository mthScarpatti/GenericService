package br.com.empresa.app.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public interface GenericService<T, ID> {
	
	public void save(T entity);
	
	public void delete(ID codigo);

	public Optional<T> findByCodigo(ID codigo);

	public Page<T> findAll(PageRequest page);
}
