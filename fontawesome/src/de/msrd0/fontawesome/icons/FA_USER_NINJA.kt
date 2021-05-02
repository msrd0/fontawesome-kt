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

object FA_USER_NINJA: Icon {
	
	override val name get() = "User Ninja"
	
	override val unicode get() = "f504"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M325.4 289.2L224 390.6 122.6 289.2C54 295.3 0 352.2 0 422.4V464c0 26.5 21.5 48 48 48h352c26.5 0 48-21.5 48-48v-41.6c0-70.2-54-127.1-122.6-133.2zM32 192c27.3 0 51.8-11.5 69.2-29.7 15.1 53.9 64 93.7 122.8 93.7 70.7 0 128-57.3 128-128S294.7 0 224 0c-50.4 0-93.6 29.4-114.5 71.8C92.1 47.8 64 32 32 32c0 33.4 17.1 62.8 43.1 80-26 17.2-43.1 46.6-43.1 80zm144-96h96c17.7 0 32 14.3 32 32H144c0-17.7 14.3-32 32-32z"/></svg>"""
		else -> null
	}
	
}
