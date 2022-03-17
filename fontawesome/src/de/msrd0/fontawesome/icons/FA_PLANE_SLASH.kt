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

/** Plane Slash */
object FA_PLANE_SLASH: Icon {
	
	override val name get() = "Plane Slash"
	
	override val unicode get() = "e069"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M238.1 161.3L197.8 20.4C194.9 10.17 202.6-.0001 213.2-.0001H269.4C280.9-.0001 291.5 6.153 297.2 16.12L397.7 192H514.3C548.5 192 608 221 608 256C608 292 548.5 320 514.3 320H440.6L630.8 469.1C641.2 477.3 643.1 492.4 634.9 502.8C626.7 513.2 611.6 515.1 601.2 506.9L9.196 42.89C-1.236 34.71-3.065 19.63 5.112 9.196C13.29-1.237 28.37-3.065 38.81 5.112L238.1 161.3zM41.54 128.7L362.5 381.6L297.2 495.9C291.5 505.8 280.9 512 269.4 512H213.2C202.6 512 194.9 501.8 197.8 491.6L246.9 319.1H144L100.8 377.6C97.78 381.6 93.04 384 88 384H46.03C38.28 384 32 377.7 32 369.1C32 368.7 32.18 367.4 32.54 366.1L64 255.1L32.54 145.9C32.18 144.6 32 143.3 32 142C32 135.9 35.1 130.6 41.54 128.7V128.7z"/></svg>"""
		else -> null
	}
	
}
