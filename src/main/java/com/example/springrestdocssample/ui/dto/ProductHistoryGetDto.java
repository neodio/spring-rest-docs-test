package com.example.springrestdocssample.ui.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductHistoryGetDto {

    private Long prodHistSeq;
    private String prodHistDate;

    // 기본정보
    private long prodNo;
    private String prodType;
    private String prodTypeNm;
    private String mallType;
    private String mallTypeNm;
    private String prodNm;
    private int lcateCd;
    private String lcateNm;
    private int mcateCd;
    private String mcateNm;
    private String scateNm;
    private int scateCd;
    private int dcateCd;
    private String dcateNm;
    private Long brandNo;
    private Long makerNo;
    private String dispYn;
    private String dispOnlyDealYn;

    // 판매정보
    private long salePrice;
    private String saleStatus;
    private String saleStatusNm;

    // 부가정보
    private String adultLimitYn;
    private String parallelImportYn;

    /**
     * 이미지정보
     */
    private Map<Long, ProductImgGetDto> prodImgGetDtoMap = new HashMap<>();

    /**
     * 라벨정보
     */
    private Map<Integer, ProductLabelGetDto> prodLabelGetDtoMap = new HashMap<>();
}
