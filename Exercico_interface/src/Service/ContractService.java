package Service;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate vencDate = contract.getDate().plusMonths(i);// O plusMonths e ultilizado para adicionar meses

            double interest = onlinePaymentService.interest(basicQuota,i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(vencDate, quota));

        }
    }
}
