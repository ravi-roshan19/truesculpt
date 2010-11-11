package truesculpt.managers;

import truesculpt.utils.Utils;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

//is a local cache really necessary ? direct call to manager better?
public class OptionsManager extends BaseManager {

	SharedPreferences settings = null;

	public OptionsManager(Context baseContext) {
		super(baseContext);

		// Restore preferences
		settings = PreferenceManager.getDefaultSharedPreferences(getbaseContext()); 

	}

	public boolean getCheckUpdateAtStartup() {
		return settings.getBoolean("CheckUpdateAtStartup", true);
	}

	public boolean getDisplaySplashScreenAtStartup() {
		return settings.getBoolean("DisplaySplashScreenAtStartup", true);
	}

	public boolean getGatherUsageData() {
		return settings.getBoolean("GatherUsageData", true);
	}

	public boolean getLoadLastUsedFileAtStartup() {
		return settings.getBoolean("LoadLastUsedFileAtStartup", true);
	}

	public boolean getViewTutorialAtStartup() {
		return settings.getBoolean("ViewTutorialAtStartup", true);
	}

	public void seLoadLastUsedFileAtStartup(boolean mLoadLastUsedFileAtStartup) {
		SharedPreferences.Editor editor = settings.edit();
		editor.putBoolean("LoaLastdUsedFileAtStartup", mLoadLastUsedFileAtStartup);
		editor.commit();
	}

	public void setCheckUpdateAtStartup(boolean mCheckUpdateAtStartup) {
		SharedPreferences.Editor editor = settings.edit();
		editor.putBoolean("CheckUpdateAtStartup", mCheckUpdateAtStartup);
		editor.commit();
	}

	public void setDisplaySplashScreenAtStartup(boolean mDisplaySplashScreenAtStartup) {
		SharedPreferences.Editor editor = settings.edit();
		editor.putBoolean("DisplaySplashScreenAtStartup", mDisplaySplashScreenAtStartup);
		editor.commit();
	}

	public void setGatherUsageData(boolean mGatherUsageData) {
		SharedPreferences.Editor editor = settings.edit();
		editor.putBoolean("GatherUsageData", mGatherUsageData);
		editor.commit();
	}
	
	
	public void setViewTutorialAtStartup(boolean mViewTutorialAtStartup) {
		SharedPreferences.Editor editor = settings.edit();
		editor.putBoolean("ViewTutorialAtStartup", mViewTutorialAtStartup);
		editor.commit();
	}

	public void showOptionsPanel() {
		Utils.StartMyActivity(getbaseContext(), truesculpt.ui.panels.OptionsPanel.class);
	}

}
