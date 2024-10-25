package br.jus.trt9.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.trt9.example.service.VoteService;

@CrossOrigin(origins = "http://localhost:4200")  // Permite o CORS 
@RestController
@RequestMapping("/vote")
public class VotingController {

	@Autowired
	private VoteService service;

	@PostMapping
	public ResponseEntity<?> vote(@RequestBody VoteForm form) {
		var vote = form.toVote();
		service.save(vote);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<ResultDTO> getResult() {
		var result = service.getResult();
		var resultDTO = new ResultDTO(result);
		return ResponseEntity.ok(resultDTO);
	}

}
