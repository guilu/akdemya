package dev.diegobarrioh.akdmia.client;

import dev.diegobarrioh.akdmia.config.FeignClientConfiguration;
import dev.diegobarrioh.akdmia.domain.entity.Unit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "api", url = "localhost:8080", configuration = FeignClientConfiguration.class)
public interface ApiClient {

    @GetMapping(path ="/api/v2/units")
    List<Unit> getUnits(@RequestHeader("authorization") String authorization);

    @GetMapping(path ="/api/v2/answers")
    List<Unit> getAnswers(@RequestHeader("authorization") String authorization);

}
