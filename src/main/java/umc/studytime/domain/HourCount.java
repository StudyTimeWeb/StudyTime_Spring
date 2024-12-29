package umc.studytime.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Getter
@DynamicInsert
@DynamicUpdate
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class HourCount extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long time0;

    @Column
    private Long time1;

    @Column
    private Long time2;

    @Column
    private Long time3;

    @Column
    private Long time4;

    @Column
    private Long time5;

    @Column
    private Long time6;

    @Column
    private Long time7;

    @Column
    private Long time8;

    @Column
    private Long time9;

    @Column
    private Long time10;

    @Column
    private Long time11;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cal_id")
    private Cal cal;
}
