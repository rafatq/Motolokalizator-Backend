package com.motolok.app;

import com.motolok.app.model.Offer;
import com.motolok.app.repo.OfferRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@SpringBootApplication
public class AppApplication {

	@Autowired
	private OfferRepo offerRepo;

	@PostMapping("offers")
	public ResponseEntity<Offer> create(@RequestBody Offer offer){
		Offer o = offerRepo.save(offer);
		return ResponseEntity.ok(o);
	}

	@GetMapping("offers")
	public List<Offer> getOffers(){
		return offerRepo.findAll();
	}


	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
}
