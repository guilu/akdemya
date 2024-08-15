package dev.diegobarrioh.akdmia.service;

import dev.diegobarrioh.akdmia.client.ApiClient;
import dev.diegobarrioh.akdmia.domain.entity.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    private static final String BEARER = "Bearer ";

    @Autowired
    private ApiClient apiClient;

    @Value("${api-bearer-token}")
    private String bearerToken;

    public List<Unit> getUnits() {
        return apiClient.getUnits(BEARER + bearerToken);
    }

    public List<Unit> getAnswers() {
        return apiClient.getAnswers(BEARER + bearerToken);
    }

}
