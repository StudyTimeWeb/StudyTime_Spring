package umc.studytime.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class SubjectResponseDTO {
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class TimerResultDTO{
        Long subjectId;
        String subjectName;
        String restTime;
        String dayGoal;
        String studyGoal;
        String storeName;
    }

}
