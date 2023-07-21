package com.example.springrestdocssample.ui;

import com.example.springrestdocssample.ui.dto.ResponseObject;
import com.example.springrestdocssample.ui.dto.ProductResponseDto;
import com.example.springrestdocssample.ui.dto.SchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class ProductController {

    @PostMapping("/prods")
    public ResponseObject<ProductResponseDto> getProductHistory(@Valid @RequestBody SchDto schDto) {
        ResponseObject<ProductResponseDto> responseObject = new ResponseObject<>();
        responseObject.setData(ProductResponseDto.builder()
                .prods(new HashMap<>())
                .totalHistCount(0)
                .build());
        return responseObject;
    }
}
