package bandak1.bandak2.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "find_together_recruit")
@Getter
@Setter
public class FindTogetherRecruit {
    @Id
    @GeneratedValue
    @Column(name = "findpeople_id")
    private long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private HalfOrder halfOrder;

    @OneToOne(mappedBy = "findTogetherRecruit")
    private CombinedOrder combinedOrder;

    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
}
