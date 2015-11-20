/* Copyright 2015 CINCHEO SAS
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jsweet.test.transpiler.source.structural.globalclasses.d;

import static jsweet.util.Globals.$export;
import static org.jsweet.test.transpiler.source.structural.globalclasses.Globals.test;
import static org.jsweet.test.transpiler.source.structural.globalclasses.e.Globals.Static;
import static org.jsweet.test.transpiler.source.structural.globalclasses.e.Globals.test2;

public class GlobalFunctionAccessFromMain {

	public static void main(String[] args) {
		$export("mainInvoked", true);
		test();
		test2(1, new String[] { "2", "3" });
		Static(1, "2", "3");
	}
}