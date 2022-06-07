package hellojpa;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDERS")
public class Order {


    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;



}
