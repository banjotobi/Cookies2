package ng.edu.oouagoiwoye.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {

        TextView textView = (TextView) findViewById(R.id.status_text_view);
        String textHung = "I'm so hungry";
        String text = (String) textView.getText();
        ImageView image = (ImageView) findViewById(R.id.android_cookie_image_view);
        if (textHung.equals(text)) {

            image.setImageResource(R.drawable.after_cookie);
            textView.setText("I'm so full");
        } else
        {
            image.setImageResource(R.drawable.before_cookie);
            textView.setText("I'm so hungry");
        }

        // TODO: Find a reference to the ImageView in the layout. Change the image.

        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
}
