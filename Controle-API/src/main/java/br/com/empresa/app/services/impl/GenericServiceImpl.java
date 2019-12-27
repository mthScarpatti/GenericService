package br.com.empresa.app.services.impl;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.empresa.app.repositories.GenericRepository;
import br.com.empresa.app.services.GenericService;

@Service
public class GenericServiceImpl<T, ID extends Serializable> implements GenericService<T, ID> {

	@Autowired
	private GenericRepository<T, ID> genericRepository;

	@Override
	public void save(T entity) {
		genericRepository.save(entity);
	}

	@Override
	public void delete(ID codigo) {
		genericRepository.deleteById(codigo);
	}

	@Override
	public Optional<T> findByCodigo(ID codigo) {
		return genericRepository.findById(codigo);
	}

	@Override
	public Page<T> findAll(PageRequest page) {
		return genericRepository.findAll(page);
	}

}
