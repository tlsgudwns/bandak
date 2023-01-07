package bandak1.bandak2.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "favorites"   )
@Getter
@Setter
public class Favorites {

    @Id
    @GeneratedValue
    @Column(name = "favorites_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String status;
}
