package br.jus.trt9.example.model;

public enum VoteOption {

	DOG, CAT;
	
	public static VoteOption fromString(String option) {
		return VoteOption.fromString(option.toUpperCase());
	}
}
