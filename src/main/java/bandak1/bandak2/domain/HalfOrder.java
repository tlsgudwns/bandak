package bandak1.bandak2.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "half_order")
@Getter
@Setter
public class HalfOrder {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private long id;


    @OneToOne
    @JoinColumn(name = "shopping_basket_id")
    private ShoppingBasket shoppingBasket;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @OneToOne(mappedBy = "halfOrder")
    private CombinedOrder combinedOrder;

    @OneToOne(mappedBy = "halfOrder")
    private Pay pay;



    private String paymentMethod;
    private int halfPrice;
    private String request;
    private int maxDistance;
    private int type;
    private String addressThisOrder;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

}
