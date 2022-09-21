package entities;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Installment {

    private Date dueDate;
    private double amount;
}
