package org.springtech.ecommerce.orderline;

import jakarta.persistence.*;
import lombok.*;
import org.springtech.ecommerce.order.Order;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class OrderLine {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer productId;
    private double quantity;

    @ManyToOne
    @JoinColumn(name = "prder_id")
    private Order order;
}
