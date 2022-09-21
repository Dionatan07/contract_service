package entities;

import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class Installment {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dueDate;
    private double amount;

    public Installment(Date dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    @Override
    public String toString(){
        return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
    }
}
