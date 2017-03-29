package com.study.spr;

import org.springframework.stereotype.Component;


@Component
public class SgtPeppers implements CompactDisc {
private String artistname;
private String author;
	@Override
	public void play() {
		
System.out.println(artistname+"is playing"+",author is"+author);
	}

}
