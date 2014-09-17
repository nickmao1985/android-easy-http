/*
    Android Easy Http
    Copyright (c) 2014 Nick Mo <52714471@qq.com>


    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/
package cc.nickmo.easyhttp.conf;

import android.content.Context;
import android.content.SharedPreferences;
import cc.nickmo.easyhttp.EasyHttpOptions;

public class PreferenceConfiguration extends EasyHttpConfiguration {
    
	public static final String PREFS_FILE_NAME = "easy_http_prefs";
	public static final String PREFS_SCK_TIMEOUT = "prefs_timeout";
	public static final String PREFS_MAX_CONNS = "prefs_max_conns";
	public static final String PREFS_MAX_RETRIES = "prefs_max_retires";
	public static final String PREFS_RETRY_SLEEP_MILLS = "prefs_retry_sleep";
	public static final String PREFS_SUPPORT_RETRY = "prefs_support_retry";
	public static final String PREFS_SERVICE_URL = "prefs_service_url";
	
	private Context mContext;
	
	public PreferenceConfiguration(Context ctx){
		mContext = ctx;
	}
	
	@Override
	public EasyHttpOptions get() {
		// TODO Auto-generated method stub
		SharedPreferences sp = mContext.getSharedPreferences(PREFS_FILE_NAME, 0);
		EasyHttpOptions opts = new EasyHttpOptions();
		opts.setTimeout(sp.getInt(PREFS_SCK_TIMEOUT, EasyHttpOptions.DEFAULT_SOCKET_TIMEOUT));
		opts.setMaxConnection(sp.getInt(PREFS_MAX_CONNS, EasyHttpOptions.DEFAULT_MAX_CONNECTIONS));
		opts.setMaxRetries(sp.getInt(PREFS_MAX_RETRIES, EasyHttpOptions.DEFAULT_MAX_RETRIES));
		opts.setRetrySleepTimeMillis(sp.getInt(PREFS_RETRY_SLEEP_MILLS, EasyHttpOptions.DEFAULT_RETRY_SLEEP_TIME_MILLIS));
		opts.setSupportRetry(sp.getBoolean(PREFS_SUPPORT_RETRY, EasyHttpOptions.DEFAULT_SUPPORT_RETRY));
		opts.setUrl(sp.getString(PREFS_SERVICE_URL, EasyHttpOptions.DEFALUT_URL));
		return opts;
	}

	@Override
	public void save(EasyHttpOptions opts) {
		// TODO Auto-generated method stub
		SharedPreferences sp = mContext.getSharedPreferences(PREFS_FILE_NAME, 0);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(PREFS_SCK_TIMEOUT, opts.getTimeout());
        editor.putInt(PREFS_MAX_CONNS, opts.getMaxConnection());
        editor.putInt(PREFS_MAX_RETRIES, opts.getMaxRetries());
        editor.putInt(PREFS_RETRY_SLEEP_MILLS, opts.getRetrySleepTimeMillis());
        editor.putBoolean(PREFS_SUPPORT_RETRY, opts.isSupportRetry());
        editor.putString(PREFS_SERVICE_URL, opts.getUrl());
        editor.commit();
	}

}
