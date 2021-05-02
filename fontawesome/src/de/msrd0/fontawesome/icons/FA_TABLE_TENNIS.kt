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

object FA_TABLE_TENNIS: Icon {
	
	override val name get() = "Table Tennis"
	
	override val unicode get() = "f45d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M496.2 296.5C527.7 218.7 512 126.2 449 63.1 365.1-21 229-21 145.1 63.1l-56 56.1 211.5 211.5c46.1-62.1 131.5-77.4 195.6-34.2zm-217.9 79.7L57.9 155.9c-27.3 45.3-21.7 105 17.3 144.1l34.5 34.6L6.7 424c-8.6 7.5-9.1 20.7-1 28.8l53.4 53.5c8 8.1 21.2 7.6 28.7-1L177.1 402l35.7 35.7c19.7 19.7 44.6 30.5 70.3 33.3-7.1-17-11-35.6-11-55.1-.1-13.8 2.5-27 6.2-39.7zM416 320c-53 0-96 43-96 96s43 96 96 96 96-43 96-96-43-96-96-96z"/></svg>"""
		else -> null
	}
	
}
