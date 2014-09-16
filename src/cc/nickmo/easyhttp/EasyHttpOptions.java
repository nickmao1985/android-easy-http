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

public class EasyHttpOptions {

     public static final int DEFAULT_SOCKET_TIMEOUT = 10 * 1000;
     public static final int DEFAULT_MAX_CONNECTIONS = 5;
     public static final int DEFAULT_MAX_RETRIES = 3;
     public static final int DEFAULT_RETRY_SLEEP_TIME_MILLIS = 1500;
     public static final boolean DEFAULT_SUPPORT_RETRY = true;
     public static final String DEFALUT_URL = "http://127.0.0.1:9080/tjandroid/json.jsp";
     
     
     private int timeout = DEFAULT_SOCKET_TIMEOUT;
     private int maxConnection = DEFAULT_MAX_CONNECTIONS;
     private int maxRetries = 3;
     private int retrySleepTimeMillis = DEFAULT_RETRY_SLEEP_TIME_MILLIS;
     private boolean supportRetry = DEFAULT_SUPPORT_RETRY;
     private String url = DEFALUT_URL;
     
    /**
     * ��ȡ��ʱʱ��
     * @return
     */
	public int getTimeout() {
		return timeout;
	}
	/**
	 * ���ó�ʱʱ��
	 * @param timeout ��ʱʱ��(����)
	 */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	/**
	 * �������������
	 * @return
	 */
	public int getMaxConnection() {
		return maxConnection;
	}
	/**
	 * �������������
	 * @param maxConnection ���������
	 */
	public void setMaxConnection(int maxConnection) {
		this.maxConnection = maxConnection;
	}
	/**
	 * ��ȡ������Դ���
	 * @return
	 */
	public int getMaxRetries() {
		return maxRetries;
	}
	/**
	 * ����������Դ���
	 * @param maxRetries
	 */
	public void setMaxRetries(int maxRetries) {
		this.maxRetries = maxRetries;
	}
	/**
	 * ��ȡ��������ʱ����������)
	 * @return
	 */
	public int getRetrySleepTimeMillis() {
		return retrySleepTimeMillis;
	}
	/**
	 * ���÷�������ʱ����(����)
	 * @param retrySleepTimeMillis
	 */
	public void setRetrySleepTimeMillis(int retrySleepTimeMillis) {
		this.retrySleepTimeMillis = retrySleepTimeMillis;
	}
	/**
	 * ��ȡ�Ƿ�֧������
	 * @return
	 */
	public boolean isSupportRetry() {
		return supportRetry;
	}
	/**
	 * �����Ƿ�֧������
	 * @param supportRetry
	 */
	public void setSupportRetry(boolean supportRetry) {
		this.supportRetry = supportRetry;
	}
	/**
	 * ��ȡURL
	 * @return
	 */
	public String getUrl() {
		return url;
	}
    /**
     * ����URL
     * @param url
     */
	public void setUrl(String url) {
		this.url = url;
	}
     
    
     
     
}
