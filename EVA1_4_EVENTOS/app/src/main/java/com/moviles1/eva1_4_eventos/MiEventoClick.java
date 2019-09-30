package com.moviles1.eva1_4_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MiEventoClick implements View.OnClickListener {
    private Context app_context;

    @Override
    public void onClick(View view) {
        Toast.makeText(app_context,"Por clase externa",Toast.LENGTH_SHORT).show();
    }

    public void setApp_context(Context app_context) {
        this.app_context = app_context;
    }
}
