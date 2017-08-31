package com.example.testpopupwindow;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.PopupWindow;

public class MainActivity extends Activity {

	private Button btn1 = null;
	private Button btn2 = null;
	private Button btn3 = null;
	private Button btn4 = null;
	
	private PopupWindow popupWindow = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		btn1 = (Button)findViewById(R.id.button1);
		btn2 = (Button)findViewById(R.id.button2);
		btn3 = (Button)findViewById(R.id.button3);
		btn4 = (Button)findViewById(R.id.button4);
		
	}
	
	private Button lastSelectedBtn = null;
	public void onClickButton(View view) {
		if(btn1 == view) {
			if(lastSelectedBtn != null && lastSelectedBtn == btn1 && popupWindow.isShowing()) {
				// アニメージョン効果
				popupWindow.setAnimationStyle(R.style.Animations_GrowFromTop);
				popupWindow.dismiss();
			} else {
				LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
				View popupView = layoutInflater.inflate(R.layout.popup, null);
				
				if(popupWindow != null) {
					if(popupWindow.isShowing()) popupWindow.dismiss();
					popupWindow = null;
				}
				popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
				ImageView dismissButton1 = (ImageView)popupView.findViewById(R.id.dismiss1);
				ImageView dismissButton2 = (ImageView)popupView.findViewById(R.id.dismiss2);
				dismissButton1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
					}
				});
				dismissButton2.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
					}
				});
				// アニメージョン効果
				popupWindow.setAnimationStyle(R.style.Animations_GrowFromBottom);
//				popupWindow.showAsDropDown(btn1, 50, -30);
				popupWindow.showAtLocation(btn2, Gravity.NO_GRAVITY, 60, 500);
			}
			lastSelectedBtn = btn1;
		} else if(btn2 == view) {
			if(lastSelectedBtn != null && lastSelectedBtn == btn2 && popupWindow.isShowing()) {
				// アニメージョン効果
				popupWindow.setAnimationStyle(R.style.Animations_GrowFromTop);
				popupWindow.dismiss();
			} else {
				LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
				View popupView = layoutInflater.inflate(R.layout.popup, null);

				if(popupWindow != null) {
					if(popupWindow.isShowing()) popupWindow.dismiss();
					popupWindow = null;
				}
				popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
				ImageView dismissButton1 = (ImageView)popupView.findViewById(R.id.dismiss1);
				ImageView dismissButton2 = (ImageView)popupView.findViewById(R.id.dismiss2);
				dismissButton1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
					}
				});
				dismissButton2.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
					}
				});
				// アニメージョン効果
				popupWindow.setAnimationStyle(R.style.Animations_GrowFromBottom);
//				popupWindow.showAsDropDown(btn3, 50, -30);
				popupWindow.showAtLocation(btn2, Gravity.NO_GRAVITY, 305, 500);
			}
			lastSelectedBtn = btn2;
		} else if(btn3 == view) {
			if(lastSelectedBtn != null && lastSelectedBtn == btn3 && popupWindow.isShowing()) {
				// アニメージョン効果
				popupWindow.setAnimationStyle(R.style.Animations_GrowFromTop);
				popupWindow.dismiss();
			} else {
				LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
				View popupView = layoutInflater.inflate(R.layout.popup, null);

				if(popupWindow != null) {
					if(popupWindow.isShowing()) popupWindow.dismiss();
					popupWindow = null;
				}
				popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
				ImageView dismissButton1 = (ImageView)popupView.findViewById(R.id.dismiss1);
				ImageView dismissButton2 = (ImageView)popupView.findViewById(R.id.dismiss2);
				dismissButton1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
					}
				});
				dismissButton2.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
					}
				});
				// アニメージョン効果
				popupWindow.setAnimationStyle(R.style.Animations_GrowFromBottom);
//				popupWindow.showAsDropDown(btn3, 50, -30);
				popupWindow.showAtLocation(btn2, Gravity.NO_GRAVITY, 550, 500);
			}
			lastSelectedBtn = btn3;
		} else if(btn4 == view) {
			if(lastSelectedBtn != null && lastSelectedBtn == btn4 && popupWindow.isShowing()) {
				// アニメージョン効果
				popupWindow.setAnimationStyle(R.style.Animations_GrowFromTop);
				popupWindow.dismiss();
			} else {
				LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
				View popupView = layoutInflater.inflate(R.layout.popup, null);

				if(popupWindow != null) {
					if(popupWindow.isShowing()) popupWindow.dismiss();
					popupWindow = null;
				}
				popupWindow = new PopupWindow(popupView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
				ImageView dismissButton1 = (ImageView)popupView.findViewById(R.id.dismiss1);
				ImageView dismissButton2 = (ImageView)popupView.findViewById(R.id.dismiss2);
				dismissButton1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
					}
				});
				dismissButton2.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						popupWindow.dismiss();
					}
				});
				// アニメージョン効果
				popupWindow.setAnimationStyle(R.style.Animations_GrowFromBottom);
//				popupWindow.showAsDropDown(btn3, 50, -30);
				popupWindow.showAtLocation(btn2, Gravity.NO_GRAVITY, 800, 500);
			}
			lastSelectedBtn = btn4;
		}
	}
}
