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

import cc.nickmo.easyhttp.EasyHttpOptions;

public abstract class EasyHttpConfiguration {
    
	/**
	 * 从数据源中获取配置信息
	 * @return
	 */
	public abstract EasyHttpOptions get();
	
	/**
	 * 将配置信息写入相应数据源中
	 * @param opts
	 */
	public abstract void save(EasyHttpOptions opts);
	
	public EasyHttpOptions getDefault(){
		return new EasyHttpOptions();
	}
}
