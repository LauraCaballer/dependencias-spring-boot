package com.example.demo.contract;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public abstract class ContractVerifierBase {

    // Se inyecta el bean de MockMvc
    @Autowired
    protected MockMvc mockMvc;

    // Configuración de RestAssured para que use el MockMvc inyectado
    @BeforeEach
    public void setupRestAssuredMockMvc() {
        RestAssuredMockMvc.mockMvc(mockMvc);
    }
}
