package fr.orionbs.transaction_manager.adapter.output.persistence.currency.mapper;

import fr.orionbs.transaction_manager.adapter.output.persistence.currency.entity.CurrencyEntity;
import fr.orionbs.transaction_manager.domain.model.Currency;
import fr.orionbs.transaction_manager.domain.model.CurrencyEnum;
import org.springframework.stereotype.Component;

@Component
public class CurrencyPersistenceMapper {

    public Currency toCurrency(CurrencyEntity currencyEntity) {
        Currency currency = new Currency();
        currency.setId(currencyEntity.getId());
        currency.setCurrencyEnum(CurrencyEnum.valueOf(currencyEntity.getValue()));
        return currency;
    }

}
