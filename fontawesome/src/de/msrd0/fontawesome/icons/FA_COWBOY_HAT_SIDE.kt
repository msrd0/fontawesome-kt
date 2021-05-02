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

object FA_COWBOY_HAT_SIDE: Icon {
	
	override val name get() = "Cowboy Hat Side"
	
	override val unicode get() = "f8c1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M260.8 291.06c-28.63-22.94-62-35.06-96.4-35.06C87 256 21.47 318.72 1.43 412.06c-3.55 16.6-.43 33.83 8.57 47.3C18.75 472.47 31.83 480 45.88 480H592c-103.21 0-155-37.07-233.19-104.46zm234.65-18.29L468.4 116.2A64 64 0 0 0 392 64.41L200.85 105a64 64 0 0 0-50.35 55.79L143.61 226c6.9-.83 13.7-2 20.79-2 41.79 0 82 14.55 117.29 42.82l98 84.48C450.76 412.54 494.9 448 592 448a48 48 0 0 0 48-48c0-25.39-29.6-119.33-144.55-127.23z"/></svg>"""
		else -> null
	}
	
}
