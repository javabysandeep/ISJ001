package fileHandling;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class Product1  {
    private int productId;
    private String productName;
    transient private int productPrice;
}
