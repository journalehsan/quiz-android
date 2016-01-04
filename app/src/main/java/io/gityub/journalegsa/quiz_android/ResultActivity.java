package io.gityub.journalegsa.quiz_android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.TextView;
public class ResultActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		//get rating bar object
		RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingBar1);
		ratingBar.setNumStars(5);
		ratingBar.setStepSize(0.5f);
		//get text view
		TextView tvResult=(TextView)findViewById(R.id.textResult);
		//get score
		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");
		//display score
		ratingBar.setRating(score);


		switch (score)
		{
			case 0:
			case 1:
			case 2:
				tvResult.setText("Opps.. maybe you must reading more!");
				break;
			case 3:
			case 4:
				tvResult.setText("Hmmmm.. maybe you have been reading a lot!");
				break;
			case 5:
				tvResult.setText("Who are you? A student from Japan???");
				break;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_result, menu);
		return true;
	}
}
