package truesculpt.ui;

import truesculpt.main.R;
import truesculpt.ui.ColorPickerDialog.OnColorChangedListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToolsPanel extends Activity implements OnColorChangedListener {
	private int mColor = 0;

	@Override
	public void colorChanged(int color) {
		mColor = color;
		String msg = "color is " + Integer.toString(mColor);
		Toast.makeText(ToolsPanel.this, msg, Toast.LENGTH_SHORT).show();
	}

	public int getmColor() {
		return mColor;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tools);

		final Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				new ColorPickerDialog(ToolsPanel.this, ToolsPanel.this, 0)
						.show();
			}
		});
	}

	@Override
	protected void onDestroy() {		
		super.onDestroy();
	}

	@Override
	protected void onPause() {		
		super.onPause();
	}

}