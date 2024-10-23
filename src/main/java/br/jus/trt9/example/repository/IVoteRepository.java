package br.jus.trt9.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.jus.trt9.example.model.Vote;

@Repository
public interface IVoteRepository extends JpaRepository<Vote, Long> {

}
