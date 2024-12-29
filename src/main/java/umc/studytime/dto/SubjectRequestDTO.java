package umc.studytime.dto;

import lombok.Getter;

public class SubjectRequestDTO {

    @Getter
    public static class createDTO {
        String name;
        String studyGoal;
        String restGoal;
    }
}
