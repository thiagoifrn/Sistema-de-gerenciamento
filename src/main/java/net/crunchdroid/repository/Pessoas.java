package net.crunchdroid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.crunchdroid.model.Pessoa;

public interface Pessoas extends JpaRepository<Pessoa, Long> {

}
