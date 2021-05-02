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

object FA_YEN_SIGN: Icon {
	
	override val name get() = "Yen Sign"
	
	override val unicode get() = "f157"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M351.2 32h-65.3c-4.6 0-8.8 2.6-10.8 6.7l-55.4 113.2c-14.5 34.7-27.1 71.9-27.1 71.9h-1.3s-12.6-37.2-27.1-71.9L108.8 38.7c-2-4.1-6.2-6.7-10.8-6.7H32.8c-9.1 0-14.8 9.7-10.6 17.6L102.3 200H44c-6.6 0-12 5.4-12 12v32c0 6.6 5.4 12 12 12h88.2l19.8 37.2V320H44c-6.6 0-12 5.4-12 12v32c0 6.6 5.4 12 12 12h108v92c0 6.6 5.4 12 12 12h56c6.6 0 12-5.4 12-12v-92h108c6.6 0 12-5.4 12-12v-32c0-6.6-5.4-12-12-12H232v-26.8l19.8-37.2H340c6.6 0 12-5.4 12-12v-32c0-6.6-5.4-12-12-12h-58.3l80.1-150.4c4.3-7.9-1.5-17.6-10.6-17.6z"/></svg>"""
		else -> null
	}
	
}
