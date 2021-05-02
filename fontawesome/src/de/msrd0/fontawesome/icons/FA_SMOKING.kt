/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_SMOKING: Icon {
	
	override val name get() = "Smoking"
	
	override val unicode get() = "f48d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M632 352h-48c-4.4 0-8 3.6-8 8v144c0 4.4 3.6 8 8 8h48c4.4 0 8-3.6 8-8V360c0-4.4-3.6-8-8-8zM553.3 87.1c-5.7-3.8-9.3-10-9.3-16.8V8c0-4.4-3.6-8-8-8h-48c-4.4 0-8 3.6-8 8v62.3c0 22 10.2 43.4 28.6 55.4 42.2 27.3 67.4 73.8 67.4 124V280c0 4.4 3.6 8 8 8h48c4.4 0 8-3.6 8-8v-30.3c0-65.5-32.4-126.2-86.7-162.6zM432 352H48c-26.5 0-48 21.5-48 48v64c0 26.5 21.5 48 48 48h384c8.8 0 16-7.2 16-16V368c0-8.8-7.2-16-16-16zm-32 112H224v-64h176v64zm87.7-322.4C463.8 125 448 99.3 448 70.3V8c0-4.4-3.6-8-8-8h-48c-4.4 0-8 3.6-8 8v66.4c0 43.7 24.6 81.6 60.3 106.7 22.4 15.7 35.7 41.2 35.7 68.6V280c0 4.4 3.6 8 8 8h48c4.4 0 8-3.6 8-8v-30.3c0-43.3-21-83.4-56.3-108.1zM536 352h-48c-4.4 0-8 3.6-8 8v144c0 4.4 3.6 8 8 8h48c4.4 0 8-3.6 8-8V360c0-4.4-3.6-8-8-8z"/></svg>"""
		else -> null
	}
	
}
