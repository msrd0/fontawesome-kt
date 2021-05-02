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

object FA_MOSQUE: Icon {
	
	override val name get() = "Mosque"
	
	override val unicode get() = "f678"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M0 480c0 17.67 14.33 32 32 32h64c17.67 0 32-14.33 32-32V160H0v320zm579.16-192c17.86-17.39 28.84-37.34 28.84-58.91 0-52.86-41.79-93.79-87.92-122.9-41.94-26.47-80.63-57.77-111.96-96.22L400 0l-8.12 9.97c-31.33 38.45-70.01 69.76-111.96 96.22C233.79 135.3 192 176.23 192 229.09c0 21.57 10.98 41.52 28.84 58.91h358.32zM608 320H192c-17.67 0-32 14.33-32 32v128c0 17.67 14.33 32 32 32h32v-64c0-17.67 14.33-32 32-32s32 14.33 32 32v64h64v-72c0-48 48-72 48-72s48 24 48 72v72h64v-64c0-17.67 14.33-32 32-32s32 14.33 32 32v64h32c17.67 0 32-14.33 32-32V352c0-17.67-14.33-32-32-32zM64 0S0 32 0 96v32h128V96c0-64-64-96-64-96z"/></svg>"""
		else -> null
	}
	
}
