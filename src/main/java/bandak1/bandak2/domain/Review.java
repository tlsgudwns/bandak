package bandak1.bandak2.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "review")
@Getter
@Setter
public class Review {
    @Id
    @GeneratedValue
    @Column(name = "review_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @OneToOne
    @JoinColumn(name = "order_id")
    private HalfOrder halfOrder;

    @OneToOne
    @JoinColumn(name = "combined_order_id")
    private CombinedOrder combinedOrder;


    private int rating;  //별점 0~5

}
