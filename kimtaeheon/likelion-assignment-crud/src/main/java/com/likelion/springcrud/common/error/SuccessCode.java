package com.likelion.springcrud.common.error;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessCode {

    /**
     * 200 OK (성공)
     */
    GET_SUCCESS(HttpStatus.OK, "성공적으로 조회했습니다."),
    MEMBER_UPDATE_SUCCESS(HttpStatus.OK, "사용자가 성공적으로 수정되었습니다."),
    REVIEW_UPDATE_SUCCESS(HttpStatus.OK, "리뷰가 성공적으로 수정되었습니다."),
    MEMBER_DELETE_SUCCESS(HttpStatus.OK, "사용자가 성공적으로 삭제되었습니다."),
    REVIEW_DELETE_SUCCESS(HttpStatus.OK, "리뷰가 성공적으로 삭제되었습니다."),

    /**
     * 201 CREATED (생성 성공)
     */
    MEMBER_SAVE_SUCCESS(HttpStatus.CREATED, "사용자가 성공적으로 생성되었습니다."),
    REVIEW_SAVE_SUCCESS(HttpStatus.CREATED, "리뷰가 성공적으로 생성되었습니다.");

    private final HttpStatus httpStatus;   // HTTP 상태 코드 ex) 200, 201
    private final String message;          // 응답 메세지

    public int getHttpStatusCode() {       // HTTP 상태 코드에서 404와 같은 숫자 값만 반환해 주기 위한 메소드
        return httpStatus.value();
    }
}
