package entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Contract {

    private int number;
    private Date date;
    private double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract(int number, Date date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public void addInstallments(Installment installment){
        installments.add(installment);
    }
}
