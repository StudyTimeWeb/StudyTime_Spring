package umc.studytime.apipayload;

import lombok.Builder;
import umc.studytime.apipayload.code.status.ErrorStatus;

import java.time.LocalDateTime;

@Builder
public record ExceptionResponse(
        LocalDateTime timestamp,

        String code,

        String message
) {
    public static ExceptionResponse of(ErrorStatus errorStatus) {
        return ExceptionResponse.builder()
                .timestamp(LocalDateTime.now())
                .code(errorStatus.getCode())
                .message(errorStatus.getMessage())
                .build();

    }

    public static ExceptionResponse of(String message) {
        return ExceptionResponse.builder()
                .timestamp(LocalDateTime.now())
                .code(ErrorStatus.INTERNAL_SERVER_ERROR.getCode())
                .message(message)
                .build();

    }
}
