package com.example.springrestdocssample.ui.dto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PatternConstants {

    // 날짜(YYYY-MM-DD)
    public static final String DATE_DF_FORMAT = "yyyy-MM-dd";
    public static final String DATE_DF_FORMAT_PATTERN = "(19[0-9]{2}|2[0-9]{3})-(0[1-9]|1[012])-([123]0|[012][1-9]|31)";
}
