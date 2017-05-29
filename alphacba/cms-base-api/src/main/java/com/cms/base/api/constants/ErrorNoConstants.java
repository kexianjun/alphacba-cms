/**
 * 
 * - Copyright 2016-2017 alphacba.
 * - Licensed under the Apache License, Version 2.0 (the "License");
 * - you may not use this file except in compliance with the License.
 * - You may obtain a copy of the License at
 * -    http://www.apache.org/licenses/LICENSE-2.0
 * - Unless required by applicable law or agreed to in writing, software
 * - distributed under the License is distributed on an "AS IS" BASIS,
 * - WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * - See the License for the specific language governing permissions and
 * - limitations under the License. 
 */
package com.cms.base.api.constants;

public interface ErrorNoConstants {
	/*参数为空*/
	static final int PARAMS_EMPTY_ERROR = 1000001;
	/*用户id为空*/
	static final int USER_ID_EMPTY_ERROR = 1000002;
	/*id为{0}的用户不存在*/
	static final int USER_NOT_EXIST_ERROR = 1000003;
	/*用户名或密码错误*/
	static final int LOGIN_PASSWD_ERROR = 1000004;
	
}
