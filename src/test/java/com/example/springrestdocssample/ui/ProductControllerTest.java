package com.example.springrestdocssample.ui;

import com.example.springrestdocssample.ui.dto.SchDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureRestDocs
class ProductControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void sample() throws Exception {
        mockMvc.perform(post("/test/prods")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(
                                SchDto.builder()
                                        .schStartDate("2022-02-22")
                                        .schEndDate("2022-03-22")
                                        .schProdNos(Lists.list(1L, 2L))
                                        .build()
                        ))
                )
                .andExpect(status().isOk())
                .andDo(document("test-post",
                        requestFields(
                                fieldWithPath("schStartDate").description("조회 시작일"),
                                fieldWithPath("schEndDate").description("조회 종료일"),
                                fieldWithPath("schProdNos").description("상품 번호 리스트")
                        ),
                        responseFields(
                                fieldWithPath("data.totalHistCount").description("상품 갯수"),
                                fieldWithPath("data.prods").description("상품들")
                        )
                ));
    }
}