package umc.studytime.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.studytime.apipayload.ApiResponse;
import umc.studytime.converter.SubjectConverter;
import umc.studytime.domain.Subject;
import umc.studytime.dto.SubjectRequestDTO;
import umc.studytime.dto.SubjectResponseDTO;
import umc.studytime.service.DetailService;

@RestController
@RequiredArgsConstructor
public class DetailController {
    private final DetailService detailService;

    @PostMapping("/{calendarId}/detail")
    public ApiResponse<SubjectResponseDTO.CreateResultDTO> join(@PathVariable Long calendarId , @RequestBody SubjectRequestDTO.createDTO request) {
        Subject subject = detailService.createSubject(request);
        return ApiResponse.onSuccess(SubjectConverter.toCreateResultDTO(subject));
    }

    @DeleteMapping("/{calendarId}/detail/{subjectId}")
    public ApiResponse<String> deleteSubject(@PathVariable Long subjectId) {
        try {
            detailService.deleteSubject(subjectId);
            return ApiResponse.onSuccess(null);
        } catch (IllegalArgumentException e) {
            return ApiResponse.onFailure("404", e.getMessage(),null);
        }
    }

}
