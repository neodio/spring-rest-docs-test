package com.example.springrestdocssample.ui.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SchDto {
    @NotEmpty(message = "조회 시작일을 입력해주세요.")
    @Pattern(regexp = PatternConstants.DATE_DF_FORMAT_PATTERN, message = "조회 시작일 (" + PatternConstants.DATE_DF_FORMAT + ") 형식에 맞지 않습니다.")
    private String schStartDate;

    @NotEmpty(message = "조회 종료일을 입력해주세요.")
    @Pattern(regexp = PatternConstants.DATE_DF_FORMAT_PATTERN, message = "조회 종료일 (" + PatternConstants.DATE_DF_FORMAT + ") 형식에 맞지 않습니다.")
    private String schEndDate;

    @NotEmpty(message = "상품번호 리스트를 입력해 주세요.")
    @Size(min = 1, max = CodeConstants.PRODUCT_PARAM_LIMIT, message = "상품번호 리스트는 최소1개, 최대" + CodeConstants.PRODUCT_PARAM_LIMIT + "개 입니다.")
    private List<Long> schProdNos;
}
