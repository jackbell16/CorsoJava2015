package com.ismanettone.ilamp;

import java.util.Locale;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a {@link FragmentPagerAdapter}
	 * derivative, which will keep every loaded fragment in memory. If this
	 * becomes too memory intensive, it may be best to switch to a
	 * {@link android.support.v13.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;
	SharedPreferences prefs;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		prefs = getApplicationContext().getSharedPreferences(
				"introduzione", Context.MODE_PRIVATE);
		if(prefs.getBoolean("intro", true)){
		setContentView(R.layout.activity_main);
		// Create the adapter that will return a fragment for each of the three
		// primary sections of the activity.
		mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		}else{
			Intent i = new Intent(this,
					new HomeActivity().getClass());
			startActivity(i);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a PlaceholderFragment (defined as a static inner class
			// below).
			if (position < 3) {
				return PlaceholderFragment.newInstance(position + 1);
			} else {
				return SettingsFragment.newInstance(0);
			}

		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 4;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();

			/*
			 * switch (position) {
			 * 
			 * case 0: return getString(R.string.title_section1).toUpperCase(l);
			 * case 1: return getString(R.string.title_section2).toUpperCase(l);
			 * case 2: return getString(R.string.title_section3).toUpperCase(l);
			 * }
			 */
			return null;
		}
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */
		public static PlaceholderFragment newInstance(int sectionNumber) {
			PlaceholderFragment fragment = new PlaceholderFragment();
			Bundle args = new Bundle();
			args.putInt(ARG_SECTION_NUMBER, sectionNumber);
			fragment.setArguments(args);
			return fragment;
		}

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			rootView.setBackgroundColor(Color.YELLOW);
			int position = getArguments().getInt(ARG_SECTION_NUMBER);
			ImageView imageView = (ImageView) rootView.findViewById(R.id.imageIntro);
			TextView textView = (TextView) rootView.findViewById(R.id.textViewIntro);
			ImageView imageViewDot = (ImageView) rootView.findViewById(R.id.imageViewDots);
			switch (position) {
			case 1:
				imageView.setBackgroundResource(R.drawable.lampada);
				textView.setText(R.string.text_section1);
				imageViewDot.setBackgroundResource(R.drawable.d0);
				break;
			case 2:
				imageView.setBackgroundResource(R.drawable.arduino);
				textView.setText(R.string.text_section2);
				imageViewDot.setBackgroundResource(R.drawable.d1);
				break;
			case 3:
				imageView.setBackgroundResource(R.drawable.inernet);
				textView.setText(R.string.text_section3);
				imageViewDot.setBackgroundResource(R.drawable.d2);
				break;
			default:
				break;
			}

			return rootView;
		}
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class SettingsFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private static final String ARG_SECTION_NUMBER = "section_number";
		private Button button;
		private EditText editText;

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */
		public static SettingsFragment newInstance(int sectionNumber) {
			SettingsFragment fragment = new SettingsFragment();
			Bundle args = new Bundle();
			args.putInt(ARG_SECTION_NUMBER, sectionNumber);
			fragment.setArguments(args);
			return fragment;
		}

		public SettingsFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_settings, container, false);
			rootView.setBackgroundColor(Color.YELLOW);
			int position = getArguments().getInt(ARG_SECTION_NUMBER);
			TextView textView = (TextView) rootView.findViewById(R.id.textViewSetting);
			ImageView imageViewDot = (ImageView) rootView.findViewById(R.id.imageViewDotsSetting);
			button = (Button) rootView.findViewById(R.id.buttonIP);
			editText = (EditText) rootView.findViewById(R.id.editTextIP);
			actionButton();
			switch (position) {
			case 0:

				textView.setText(R.string.text_setting);
				imageViewDot.setBackgroundResource(R.drawable.d3);
				break;

			default:
				break;
			}

			return rootView;
		}

		private void actionButton() {
			button.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					SharedPreferences prefs = getActivity().getSharedPreferences("introduzione", Context.MODE_PRIVATE);
					String ip = editText.getText().toString();
					prefs.edit().putString("ip", ip).apply();;
					prefs.edit().putBoolean("intro", false).apply();
					Intent i = new Intent(getActivity(),
							new HomeActivity().getClass());
					startActivity(i);
				}
			});
		}
	}

}
