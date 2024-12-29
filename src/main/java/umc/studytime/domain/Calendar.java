package umc.studytime.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@DynamicInsert
@DynamicUpdate
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Calendar extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private Integer dayGoal;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "DEFAULT 'color0'")
    private Acheived acheived;

    @OneToMany(mappedBy = "Calendar", cascade = CascadeType.ALL)
    private List<Timer> timer = new ArrayList<>();

    @OneToMany(mappedBy = "Calendar", cascade = CascadeType.ALL)
    private List<HourCount> hourCount = new ArrayList<>();
}
