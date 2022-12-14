package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.println("Enter contract data: ");

        try{
            System.out.print("Number: ");
            int number = key.nextInt();
            System.out.print("Date (dd/MM/yyyy): ");
            Date date = sdf.parse(key.next());
            System.out.print("Contract value: ");
            double contractValue = key.nextDouble();

            Contract contract = new Contract(number, date, contractValue);

            System.out.print("Enter number of installments: ");
            int n = key.nextInt();

            ContractService contractService = new ContractService(new PaypalService());

            contractService.processContract(contract, n);

            System.out.println();
            System.out.println("Installments");
            for(Installment x: contract.getInstallments()){
                System.out.println(x);
            }


        }catch (ParseException e){
            e.printStackTrace();
        }



    }

}
