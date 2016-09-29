package com.danielacedo.sendmessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Receive a message sent from SendMessage_Activity and displays it on screen
 * @author Daniel Acedo Calderón
 */
public class ReceiveMessage_Activity extends AppCompatActivity {

    TextView txv_ViewMessage;

    /**
     * Method that create and initialize the elements contained within the activity
     * @author Daniel Acedo Calderón
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message_);

        txv_ViewMessage = (TextView)findViewById(R.id.txv_ViewMessage);

        String message = getIntent().getStringExtra(SendMessage_Activity.MESSAGE);
        txv_ViewMessage.setText(getResources().getText(R.string.txv_ViewMessage_text)+message);
    }
}
