package bandak1.bandak2.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Store {

    @Id
    @GeneratedValue
    @Column(name = "store_id")
    private Long id;

    @OneToMany(mappedBy = "store")
    private List<Favorites> favoritesList = new ArrayList<>();
    //가게에 등록한 여러 찜하기들의 리스트?

    @OneToMany(mappedBy = "store")
    private List<Menu> menuList = new ArrayList<>();

    @OneToMany(mappedBy = "store")
    private List<HalfOrder> halfOrderList = new ArrayList<>();

    @OneToMany(mappedBy = "store")
    private List<Review> reviewList = new ArrayList<>();

    private String name;
    private int type;
    private String address;
    private String phone;
    private String content; //소개글
    private int minDeliveryPrice;
    private int deliveryTip;
    private int deliveryTime;
    private double rating;
    private int favoritesCount;
    private int reviewCount;
    private String operationHours;
    private String deliveryAddress;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String status;
}
