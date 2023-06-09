package com.team01.db_project_team01.controller;

import com.team01.db_project_team01.dto.ProductMypriceRequestDto;
import com.team01.db_project_team01.dto.ProductRequestDto;
import com.team01.db_project_team01.dto.ProductResponseDto;
import com.team01.db_project_team01.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    // 관심 상품 등록하기
    @PostMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto, HttpServletRequest request) {
        // 응답 보내기
        return productService.createProduct(requestDto, request);
    }

    // 관심 상품 조회하기
    @GetMapping("/products")
    public List<ProductResponseDto> getProducts(HttpServletRequest request) {
        // 응답 보내기
        return productService.getProducts(request);
    }

    // 관심 상품 최저가 등록하기
    @PutMapping("/products/{id}")
    public Long updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto, HttpServletRequest request) {
        // 응답 보내기 (업데이트된 상품 id)
        return productService.updateProduct(id, requestDto, request);
    }

}