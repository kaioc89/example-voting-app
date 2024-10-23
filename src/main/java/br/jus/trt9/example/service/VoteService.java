package br.jus.trt9.example.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.trt9.example.model.Vote;
import br.jus.trt9.example.model.VoteOption;
import br.jus.trt9.example.repository.IVoteRepository;

@Service
public class VoteService {

	@Autowired
	private IVoteRepository repository;
	
	public void save(Vote vote) {
		repository.save(vote);
	}
	
	public Map<VoteOption, Long> getResult(){
		var votes = this.repository.findAll();
		var totalVotes = votes.size();
		var catVotes = votes.stream().filter(v -> VoteOption.CAT.equals(v.getOption())).count();
		var dogVotes = totalVotes - catVotes;
		var mapResult = new HashMap<VoteOption , Long>();
		mapResult.put(VoteOption.CAT, catVotes);
		mapResult.put(VoteOption.DOG, dogVotes);
		return mapResult;
	}
	
}
