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

object FA_USERS_SLASH: Icon {
	
	override val name get() = "Users Slash"
	
	override val unicode get() = "e073"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M512 160c44.18 0 80-35.82 80-80S556.2 0 512 0c-44.18 0-80 35.82-80 80S467.8 160 512 160zM490.1 192c-12.8 0-24.88 3.037-35.86 8.24C454.8 205.5 455.8 210.6 455.8 216c0 33.71-12.78 64.21-33.16 88h199.7C632.1 304 640 295.6 640 285.3C640 233.8 600.6 192 551.9 192H490.1zM396.6 285.5C413.4 267.2 423.8 242.9 423.8 216c0-57.44-46.54-104-103.1-104c-35.93 0-67.07 18.53-85.59 46.3L193.1 126.1C202.4 113.1 208 97.24 208 80C208 35.82 172.2 0 128 0C103.8 0 82.52 10.97 67.96 27.95L38.81 5.109C34.41 1.672 29.19 0 24.03 0C16.91 0 9.846 3.156 5.127 9.188C-3.061 19.62-1.248 34.72 9.189 42.89l591.1 463.1c10.5 8.203 25.56 6.328 33.69-4.078c8.188-10.44 6.375-25.53-4.062-33.7L396.6 285.5zM270.1 352C191.6 352 128 411.7 128 485.3C128 500.1 140.7 512 156.4 512h327.2c11.62 0 21.54-6.583 25.95-15.96L325.7 352H270.1zM186.1 243.2L121.6 192H88.08C39.44 192 0 233.8 0 285.3C0 295.6 7.887 304 17.62 304h199.5C202.4 286.8 191.8 266.1 186.1 243.2z"/></svg>"""
		else -> null
	}
	
}
