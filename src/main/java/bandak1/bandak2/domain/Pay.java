package bandak1.bandak2.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pay")
@Getter
@Setter
public class Pay {
    @Id
    @GeneratedValue
    @Column(name = "pay_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private HalfOrder halfOrder;
}
