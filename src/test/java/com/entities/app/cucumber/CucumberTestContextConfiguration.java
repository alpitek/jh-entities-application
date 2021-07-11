package com.entities.app.cucumber;

import com.entities.app.JhEntitiesApplicationApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhEntitiesApplicationApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
