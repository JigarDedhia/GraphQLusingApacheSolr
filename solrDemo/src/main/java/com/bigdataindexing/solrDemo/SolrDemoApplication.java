package com.bigdataindexing.solrDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication
public class SolrDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolrDemoApplication.class, args);
	}

}
