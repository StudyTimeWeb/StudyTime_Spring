package umc.studytime.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.studytime.DTO.SubjectResponseDTO;
import umc.studytime.apipayload.ApiResponse;
import umc.studytime.service.TimerService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class TimerController {
    private final TimerService timerService;

    @GetMapping("/{subject_id}/timer")
    @Operation(summary = "타이머화면으로 이동 API",description = "타이머 화면을 조회하는 API이며 query String 으로 subject 번호를 주세요")
    @Parameters({
            @Parameter(name = "subject_id", description = "과목 id, path variable 입니다!")
    })
    public ApiResponse<SubjectResponseDTO.TimerResultDTO> getSubjectTimer(@PathVariable(name = "subject_id") Long subjectId){
        return ApiResponse.onSuccess(timerService.getSubjectTimer(subjectId));
    }


}
