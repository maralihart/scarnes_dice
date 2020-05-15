package com.example.scarnes_dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int user_overall = 0, user_turn = 0, computer_overall = 0, computer_turn = 0;

    public int [] faces = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
    };

    String user_score = "You: " + String.valueOf(user_overall+user_turn);
    String computer_score = "Computer: " + String.valueOf(computer_overall+computer_turn);

    Random random = new Random();

    Button roll = (Button) findViewById(R.id.roll);
    Button hold = (Button) findViewById(R.id.hold);
    Button reset = (Button) findViewById(R.id.reset);

    TextView user = (TextView) findViewById(R.id.user);
    TextView computer = (TextView) findViewById(R.id.computer);

    ImageView dice = (ImageView) findViewById(R.id.dice);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void rollClick(View view) {
        int rolled = rollDie();
        if (rolled == 1) {
            user_turn = 0;
            endTurn()
        } else {
            user_turn = user_turn + rolled;
        }
    }

    public int rollDie() {
        // TODO: Change die and add it to player's turn score
        return random.nextInt(6) + 1;
    }

    public void endTurn() {
        // TODO: Update total score
    }

    public void startOver() {
        // TODO: Set scores to zero and die face to 1
    }
}
