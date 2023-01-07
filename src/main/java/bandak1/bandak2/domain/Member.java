package bandak1.bandak2.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;        //자동생성되는 id

    private String loginId; //실제 로그인때 사용할 id

    @OneToMany(mappedBy = "member") //Favorites클래스의 member객체에 의해서 매핑되었다는뜻 읽기전용
    private List<Favorites> favoritesList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<HalfOrder> halfOrderList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Review> reviewList = new ArrayList<>();

    private String password;
    private String phone;
    private String email;
    private String address;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String status;
    private double userRating;
}
