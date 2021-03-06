package com.example.capstonewas.response;

import org.springframework.stereotype.Component;

@Component
public class ResponseMessage {
    /*
     * Set same variable name class Status's variable name
     */

    public String SUCCESS = "성공";
    public String DUPLICATED_EMAIL = "사용할 수 없는 이메일입니다.(중복)";
    public String NOT_ENTERED = "입력되지 않은 필수 항목이 있습니다.";
    public String DUPLICATED_NICKNAME = "사용할 수 없는 닉네임입니다.(중복)";
    public String INVALID_ACCOUNT = "계정 정보를 불러올 수 없습니다."; // accountId validation
    public String NO_DIARIES = "해당 강아지에대한 다이어리가 없습니다.";
    public String NO_DIARY = "해당 다이어리가 없습니다.";
    public String NO_COMMENT = "아직 댓글이 없습니다.";
    public String NO_FAMILY = "아직 가족이 없습니다. 가족을 추가해 보세요 !";
    public String NO_DOG = "반려견을 등록하시지 않으셨네요. 반려견을 추가해 보세요 !";
    public String EXPIRED_TOKEN = "REFRESH TOKEN이 만료되었습니다. 새롭게 로그인 해주세요.";
    public String EXISTED_NICKNAME = "이미 닉네임이 존재합니다. 다른 닉네임을 작성해 주세요.";
    public String NO_ALARMS = "알림이 없습니다.";
    public String INVALID_USER = "유효하지 않은 userId 입니다.";
    public String NO_COMMUNITY_CONTENTS = "공유다이어리에 게시된 다이어리가 없습니다.";
    public String SUCCESS_REGISTER_SCHEDULE = "schedule 등록 성공";
    public String EMPTY_VALUE = "값이 없습니다.";
}
