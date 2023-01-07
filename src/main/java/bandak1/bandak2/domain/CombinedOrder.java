package bandak1.bandak2.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "combined_order")
@Getter
@Setter
public class CombinedOrder {
    @Id
    @GeneratedValue
    @Column(name = "combined_order_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "findpeople_id")
    private FindTogetherRecruit findTogetherRecruit;

    @OneToOne
    @JoinColumn(name = "order_id")
    private HalfOrder halfOrder;

    private boolean acceptance;
    private String reasonForRefusal;
    private LocalDateTime estimatedTime;
    private LocalDateTime createdDate;
    private String status;
}
