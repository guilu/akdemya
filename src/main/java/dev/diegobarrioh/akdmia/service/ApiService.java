package dev.diegobarrioh.akdmia.service;

import dev.diegobarrioh.akdmia.client.ApiClient;
import dev.diegobarrioh.akdmia.domain.entity.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    @Autowired
    private ApiClient apiClient;

    public List<Unit> getUnits() {
        return apiClient.getUnits("Bearer soy-yo-dejame-entrar");
    }
}
