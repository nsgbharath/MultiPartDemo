package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@CrossOrigin
@RestController
@RequestMapping(value="api")
public class ControllerClass {
@PostMapping(value="/post")
	public String checkMethod(@RequestParam("file") MultipartFile file, @RequestParam(value="stringfyJson",required = true) String jsonData) {
		System.out.println(jsonData);
		
	return file.getOriginalFilename();
	}
	
	
}
