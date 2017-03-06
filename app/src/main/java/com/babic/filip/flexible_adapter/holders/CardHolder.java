package com.babic.filip.flexible_adapter.holders;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.babic.filip.flexible_adapter.R;
import com.babic.filip.flexible_adapter.model.CreditCardModel;
import com.babic.filip.flexibleadapter.FlexibleHolder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Filip Babic @cobe
 */

public class CardHolder implements FlexibleHolder {

    @BindView(R.id.card_bank_name)
    TextView cardBankName;

    @BindView(R.id.card_number)
    TextView cardNumber;

    @BindView(R.id.card_expiry)
    TextView cardExpireDate;

    @BindView(R.id.card_owner)
    TextView cardOwner;

    private final CreditCardModel creditCardModel;
    private Unbinder unbinder;

    public CardHolder(CreditCardModel creditCardModel) {
        this.creditCardModel = creditCardModel;
    }

    @Override
    public int getLayout() {
        return R.layout.credit_card_item_layout;
    }

    @Override
    public void displayView(@NonNull View rootView) {
        unbinder = ButterKnife.bind(this, rootView);

        cardBankName.setText(creditCardModel.getCardBankName());
        cardNumber.setText(creditCardModel.getCardNumber());
        cardExpireDate.setText(creditCardModel.getCardExpireDate());
        cardOwner.setText(creditCardModel.getCardOwnerName());
    }

    @Override
    public void recycle() {
        if (unbinder != null) {
            unbinder.unbind();
        }
    }
}
