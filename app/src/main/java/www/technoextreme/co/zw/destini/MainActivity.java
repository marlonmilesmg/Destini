package www.technoextreme.co.zw.destini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton1, mButton2;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       mTextView = findViewById(R.id.textQuestions);
       mButton1 = findViewById(R.id.option1);
       mButton2 = findViewById(R.id.option2);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1 || mStoryIndex == 2) {
                    mTextView.setText(R.string.T3_Story);
                    mButton1.setText(R.string.T3_Ans1);
                    mButton2.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }else if(mStoryIndex == 3){
                    mTextView.setText(R.string.T6_End);
                    mButton1.setVisibility(View.GONE);
                    mButton2.setVisibility(View.GONE);
                }
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex==1){
                    mTextView.setText(R.string.T2_Story);
                    mButton1.setText(R.string.T2_Ans1);
                    mButton2.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if(mStoryIndex == 2){
                    mTextView.setText(R.string.T4_End);
                    mButton1.setVisibility(View.GONE);
                    mButton2.setVisibility(View.GONE);
                }else if(mStoryIndex == 3){
                    mTextView.setText(R.string.T5_End);
                    mButton1.setVisibility(View.GONE);
                    mButton2.setVisibility(View.GONE);
                }

            }
        });
    }
}
