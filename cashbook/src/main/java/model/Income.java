package model;

import lombok.*;

import java.sql.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Income {
    //id, date, time, amount, remarks, category, paymentMode, userId

    private int id;
    private Date date;
    private Time time;
    private int amount;
    private String remarks;
    private String category;
    private String paymentMode;

    @ToString.Exclude
    private int userId;

}
