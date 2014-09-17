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
package cc.nickmo.easyhttp;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.BasicHttpParams;

public class EasyHttp {
    
	private final static String TAG = "EasyHttp";
	
	private static EasyHttpOptions httpConf;
	
	/**
	 * 用于初始化或者更新Http配置
	 * @param opts
	 */
	public static void initOrFlushOptions(EasyHttpOptions opts){
		httpConf = opts;
	}
	
	public EasyHttp(SchemeRegistry schemeRegistry){
		if(httpConf == null) httpConf = new EasyHttpOptions();
		BasicHttpParams httpParams = new BasicHttpParams();
		
		ConnManagerParams.setTimeout(httpParams, httpConf.getTimeout());
		ConnManagerParams.setMaxConnectionsPerRoute(httpParams, new ConnPerRouteBean(httpConf.getMaxConnection()));
		ConnManagerParams.setMaxTotalConnections(httpParams, 10);
	}
}
