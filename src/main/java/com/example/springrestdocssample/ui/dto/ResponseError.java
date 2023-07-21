package com.example.springrestdocssample.ui.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ResponseError {
    // HttpStatus 코드의 데이터
    private String status;
    // 각각의 Application에서 사용할 별도의 코드
    private String code;
    // 에러의 제목
    private String title;
    // 에러의 상세내용
    private String detail;
}
