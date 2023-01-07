package bandak1.bandak2.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "menu")
@Getter
@Setter
public class Menu {

    @Id
    @GeneratedValue
    @Column(name = "menu_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @ManyToOne
    @JoinColumn(name = "shopping_basket_id")
    private ShoppingBasket shoppingBasket;
    //이걸 쓸일이 있나??  바스켓에 어떤메뉴 리스트들이 있는지는 중요할거같은데 메뉴객체에
    //어떤 바스켓소속인지의 정보가 들어가야하나?
    // 포리즌키를 지정하기위해서는 이걸 써야하는게맞나?


    private String category; //주메뉴인지 사이드 음료인지
    private String name;
    private int price;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String status;
    private String menuUrl; //메뉴사진 url
}
