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

object FA_DOWN_LONG: Icon {
	
	override val name get() = "Down long"
	
	override val unicode get() = "f309"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M281.6 392.3l-104 112.1c-9.498 10.24-25.69 10.24-35.19 0l-104-112.1c-6.484-6.992-8.219-17.18-4.404-25.94c3.811-8.758 12.45-14.42 21.1-14.42H128V32c0-17.69 14.33-32 32-32S192 14.31 192 32v319.9h72c9.547 0 18.19 5.66 22 14.42C289.8 375.1 288.1 385.3 281.6 392.3z"/></svg>"""
		else -> null
	}
	
}

val FA_LONG_ARROW_ALT_DOWN = FA_DOWN_LONG
