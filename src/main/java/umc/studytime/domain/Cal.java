package umc.studytime.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Cal extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private Integer dayGoal;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "DEFAULT 'color0'")
    private Acheived acheived;

    @OneToMany(mappedBy = "cal", cascade = CascadeType.ALL)
    private List<Subject> subject = new ArrayList<>();

    @OneToMany(mappedBy = "cal", cascade = CascadeType.ALL)
    private List<HourCount> hourCount = new ArrayList<>();


}
