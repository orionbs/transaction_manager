package fr.orionbs.transaction_manager_server.adapter.input.api.transaction.mapper;

import fr.orionbs.transaction_manager_server.adapter.input.api.transaction.data.GetTransactionResponse;
import fr.orionbs.transaction_manager_server.adapter.input.api.transaction.data.PostTransactionResponse;
import fr.orionbs.transaction_manager_server.domain.model.Transaction;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component
public class TransactionApiMapper {

    public PostTransactionResponse toPostTransactionResponse(Transaction transaction) {
        PostTransactionResponse postTransactionResponse = new PostTransactionResponse();
        postTransactionResponse.setLabel(transaction.getLabel());
        postTransactionResponse.setDescription(transaction.getDescription());
        postTransactionResponse.setAmount(transaction.getAmount());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        postTransactionResponse.setMilestone(transaction.getMilestone().format(dateTimeFormatter));
        postTransactionResponse.setCategory(transaction.getCategory().getCategoryEnum().toString());
        postTransactionResponse.setAccount(transaction.getAccount().getName());
        postTransactionResponse.setFrequency(transaction.getFrequency().getFrequencyEnum().toString());
        return postTransactionResponse;
    }

    public GetTransactionResponse toGetTransactionResponse(Transaction transaction) {
        GetTransactionResponse getTransactionResponse = new GetTransactionResponse();
        getTransactionResponse.setLabel(transaction.getLabel());
        getTransactionResponse.setLabel(transaction.getLabel());
        getTransactionResponse.setDescription(transaction.getDescription());
        getTransactionResponse.setAmount(transaction.getAmount());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        getTransactionResponse.setMilestone(transaction.getMilestone().format(dateTimeFormatter));
        getTransactionResponse.setCategory(transaction.getCategory().getCategoryEnum().toString());
        getTransactionResponse.setAccount(transaction.getAccount().getName());
        getTransactionResponse.setFrequency(transaction.getFrequency().getFrequencyEnum().toString());
        return getTransactionResponse;
    }

}
