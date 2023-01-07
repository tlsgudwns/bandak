package bandak1.bandak2.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shopping_basket")
@Getter @Setter
public class ShoppingBasket {
    @Id
    @GeneratedValue
    @Column(name = "shopping_basket_id")
    private Long id;


    @OneToMany(mappedBy = "shoppingBasket")
    private List<Menu> menuList = new ArrayList<>();

    private int price;
}
