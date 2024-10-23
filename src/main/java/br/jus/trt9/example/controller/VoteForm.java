package br.jus.trt9.example.controller;

import br.jus.trt9.example.model.Vote;
import br.jus.trt9.example.model.VoteOption;

public record VoteForm(
		String voteOption
		) {
	
	public Vote toVote() {
		var option = VoteOption.valueOf(voteOption.toUpperCase());
		var vote = Vote.builder().option(option).build();
		return vote;
	}
	
}
