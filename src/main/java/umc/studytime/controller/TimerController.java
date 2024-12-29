package umc.studytime.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.studytime.DTO.SubjectResponseDTO;
import umc.studytime.apipayload.ApiResponse;
import umc.studytime.converter.SubjectConverter;
import umc.studytime.domain.Subject;
import umc.studytime.domain.Timer;
import umc.studytime.service.SubjectService;
import umc.studytime.service.TimerService;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class TimerController {
    private final TimerService timerService;
    private final SubjectService subjectService;

    @GetMapping("/{subject_id}/timer")
    @Operation(summary = "타이머화면으로 이동 API",description = "타이머 화면을 조회하는 API이며 query String 으로 subject 번호를 주세요")
    @Parameters({
            @Parameter(name = "subject_id", description = "과목 id, path variable 입니다!")
    })
    public ApiResponse<SubjectResponseDTO.TimerResultDTO> getSubjectTimer(@PathVariable(name = "subject_id") Long subjectId){
        Optional<Subject> subject = subjectService.findSubject(subjectId);
        return ApiResponse.onSuccess(SubjectConverter.toTimerResultDTO(subject));
    }


}
