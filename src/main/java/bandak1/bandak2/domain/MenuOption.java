//package bandak1.bandak2.domain;
//
//          //나중에 json으로 넣는다?
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "menu_option")
//@Getter
//@Setter
//public class MenuOption {
//
//
//    @Id
//    @GeneratedValue
//    @Column(name = "menu_option_id")
//    private Long menuOptionId;
//
//    @OneToOne
//    @JoinColumn(name = "menu_id")
//    private Menu menu;
//
//    private String option;
//    private String content;
//    private String price;
//    private LocalDateTime created_date;
//    private LocalDateTime modified_date;
//    private String status;
//}
