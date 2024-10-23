package br.jus.trt9.example.controller;

import java.util.Map;

import br.jus.trt9.example.model.VoteOption;

public record ResultDTO(
		Map<VoteOption, Long> resultMap
		) {

}
