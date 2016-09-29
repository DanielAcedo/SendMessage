package com.danielacedo.sendmessage;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Sends a message to <b>Activity</b>
 * @author Daniel Acedo Calderón
 *
 */
public class SendMessage_Activity extends AppCompatActivity implements View.OnClickListener {
    public static final String MESSAGE = "message";

    EditText edt_Message;
    Button btn_Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        edt_Message = (EditText)findViewById(R.id.edt_Message);
        btn_Send = (Button)findViewById(R.id.btn_send);
    }

    /**
     * Handles all button click input
     * @param v The view that has been clicked
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_send:
                sendMessage();
                break;
        }
    }

    /**
     * Takes a message from the EditText and sends it to ReceiveMessage_Activity
     * @author Daniel Acedo Calderón
     */
    public void sendMessage(){
        String message = edt_Message.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString(MESSAGE ,message);

        Intent intent = new Intent(SendMessage_Activity.this, ReceiveMessage_Activity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
