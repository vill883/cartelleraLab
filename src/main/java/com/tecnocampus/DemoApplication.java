package com.tecnocampus;

import com.tecnocampus.dabaBaseRepository.UsuariRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private UsuariRepository usuariRepository;

	@Autowired
	private NoteLabRepository noteLabRepository;

	@Autowired
	private UserUseCases userUseCases;

	@Bean
	CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				Iterable<UserLab> users = userLabRepository.findAll();
				users.forEach(u -> System.out.println(u.getUsername() + u.getName()));

				Iterable<NoteLab> notes = noteLabRepository.findAll();
				notes.forEach(n -> System.out.println( n.getTitle()));

				userUseCases.createUser("jr", "pepe", "roure", "mail");
			}
		};
	}
}
