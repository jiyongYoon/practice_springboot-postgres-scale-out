package com.example.dbreplication;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @GetMapping("/{id}")
    public TestEntity get(@PathVariable Long id) {
        return testRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public TestEntity save(@RequestBody TestEntity testEntity) {
        return testRepository.save(testEntity);
    }
}
