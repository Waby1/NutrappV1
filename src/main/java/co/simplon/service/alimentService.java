package co.simplon.service;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import co.simplon.model.alimentModel;

@Named
public interface alimentService {

	public alimentModel saveAliment (alimentModel alimentModel);
	public List<alimentModel> getAll();
	public Optional<alimentModel> findbyId(Long id);
}











