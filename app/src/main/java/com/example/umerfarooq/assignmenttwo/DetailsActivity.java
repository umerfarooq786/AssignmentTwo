package com.example.umerfarooq.assignmenttwo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.google.gson.Gson;
import org.greenrobot.eventbus.EventBus;
/**
 * Created by Umer Farooq on 10/17/2017.
 */
public class DetailsActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        Gson gs = new Gson();
        String trg = getIntent().getStringExtra("Contact");
        ContactDetailEvent contactDetailsEvent = new ContactDetailEvent(trg);
        EventBus.getDefault().post(contactDetailsEvent);
    }
}

