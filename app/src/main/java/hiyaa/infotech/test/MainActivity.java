package hiyaa.infotech.test;

import android.app.Dialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import hiyaa.infotech.test.SQlite2.MainActivity_2;

public class MainActivity extends AppCompatActivity {

    Button bluetooth,wifi,audio,email,call,sms,switchdata,notification,practical1, practical2, practical3, practical4, practical5, practical6, practical7, practical8, practical9,
            practical10, practical11, practical12, practical13, list_button, webview, navigationdrawer,imageick ,sqlite_recycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        practical1 = findViewById(R.id.practical1);
        practical2 = findViewById(R.id.practical2);
        practical3 = findViewById(R.id.practical3);
        practical4 = findViewById(R.id.practical4);
        practical5 = findViewById(R.id.practical5);
        practical6 = findViewById(R.id.practical6);
        practical7 = findViewById(R.id.practical7);
        practical9 = findViewById(R.id.practical9);
        practical10 = findViewById(R.id.practical10);
        practical11 = findViewById(R.id.practical11);
        practical12 = findViewById(R.id.practical12);
        practical13 = findViewById(R.id.practical13);
        bluetooth = findViewById(R.id.bluetooth);
        wifi = findViewById(R.id.wifi);
        email = findViewById(R.id.email);
        call = findViewById(R.id.phone);
        sms = findViewById(R.id.sms);
        notification = findViewById(R.id.notification);
        switchdata = findViewById(R.id.switchdata);
        audio = findViewById(R.id.audio);

        webview = findViewById(R.id.webview);
        navigationdrawer = findViewById(R.id.drawer);
        imageick = findViewById(R.id.imageick);
        list_button = findViewById(R.id.list_button);
        sqlite_recycle = findViewById(R.id.sqlite_recycle);

        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Webview.class);
                startActivity(i);
            }
        });

        sqlite_recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity_2.class);
                startActivity(i);
            }
        });

        imageick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Imagepick.class);
                startActivity(i);
            }
        });

        navigationdrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Navigationdrawer.class);
                startActivity(i);
            }
        });

        list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Listview_prac.class);
                startActivity(i);
            }
        });

        practical1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Signup.class);
                startActivity(i);
            }
        });

        practical2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Signup.class);
                startActivity(i);
            }
        });

        practical3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Homepage.class);
                startActivity(i);
            }
        });
        practical4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Signup.class);
                startActivity(i);
            }
        });
        practical5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Sqlite.class);
                startActivity(i);
            }
        });
        practical7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Animation.class);
                startActivity(i);
            }
        });
        practical9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
            }
        });
        practical10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
            }
        });
        practical11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Fragmentt.class);
                startActivity(i);
            }
        });
        practical12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Tabhost.class);
                startActivity(i);
            }
        });
        practical13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Viewpager.class);
                startActivity(i);
            }
        });
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Bluetooth.class);
                startActivity(i);
            }
        });

        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Wifi.class);
                startActivity(i);
            }
        });

        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Wifi.class);
                startActivity(i);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone = "+917698148757";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);

            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSMS();
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Notification.class);
                startActivity(i);
            }
        });

        switchdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SwitchToggle.class);
                startActivity(i);
            }
        });

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AudioVideo.class);
                startActivity(i);
            }
        });
    }

    public void gotoLeavegroup(View view) {


        Dialog ask_dialog = new Dialog(MainActivity.this, R.style.MyAlertDialogStyle);
        ask_dialog.setContentView(R.layout.dialog_logout);

        TextView yes = ask_dialog.findViewById(R.id.yes);
        TextView no = findViewById(R.id.no);



        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
            }
        });

        ask_dialog.show();

    }

    protected void sendEmail() {
        Log.i("Send email", "");

        String[] TO = {""};
        String[] CC = {""};



        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);

        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");

        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();

        } catch (Exception ex) {
            Toast.makeText(MainActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

    protected void sendSMS() {

        Log.i("Send Notification", "");


        Intent smsIntent = new Intent(Intent.ACTION_VIEW);

        smsIntent.setData(Uri.parse("smsto:"));
        smsIntent.setType("vnd.android-dir/mms-sms");
        smsIntent.putExtra("address"  , new String ("01234"));
        smsIntent.putExtra("sms_body"  , "Test ");

        try {
            startActivity(smsIntent);
            finish();
            Log.i("Finished sending Notification...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this,
                    "Notification faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }
    private void addNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.logo) //set icon for notification
                        .setContentTitle("Notifications Example") //set title of notification
                        .setContentText("This is a notification message")//this is notification message
                        .setAutoCancel(true) // makes auto cancel of notification
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT); //set priority of notification


        Intent notificationIntent = new Intent(this, Notification.class);
        notificationIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //notification message will get at NotificationView
        notificationIntent.putExtra("message", "This is a notification message");

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}

