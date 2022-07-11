package com.cg.ata.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ComCgAtaProjectApplication {

	private static final Logger LOG = LoggerFactory.getLogger(ComCgAtaProjectApplication.class);

	public static void main(String[] args) {

		LOG.info("Starting...");
		SpringApplication.run(ComCgAtaProjectApplication.class, args);
		LOG.info("Started...");

	}

}