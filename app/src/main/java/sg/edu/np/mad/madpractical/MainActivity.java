package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    User user = new User("Tom", "description", 1, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFollowBtnTxt(user);

    }

    public void onClick(View v){
        Button followBtn = findViewById(R.id.buttonFollow);
        if (followBtn.getText() == "Follow"){
            followBtn.setText("Unfollow");
        }
        else {
            followBtn.setText("Follow");
        }
        user.followed = !user.followed;
    }

    public void initFollowBtnTxt(User user) {
        Button followBtn = findViewById(R.id.buttonFollow);
        if (!user.followed){
            followBtn.setText("Follow");
        }
        else {
            followBtn.setText("Unfollow");
        }
    }
}
