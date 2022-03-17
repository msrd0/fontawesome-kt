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

/** Fill */
object FA_FILL: Icon {
	
	override val name get() = "Fill"
	
	override val unicode get() = "f575"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M168 90.74L221.1 37.66C249.2 9.539 294.8 9.539 322.9 37.66L474.3 189.1C502.5 217.2 502.5 262.8 474.3 290.9L283.9 481.4C246.4 518.9 185.6 518.9 148.1 481.4L30.63 363.9C-6.863 326.4-6.863 265.6 30.63 228.1L122.7 135.1L41.37 54.63C28.88 42.13 28.88 21.87 41.37 9.372C53.87-3.124 74.13-3.124 86.63 9.372L168 90.74zM75.88 273.4C71.69 277.6 68.9 282.6 67.52 287.1H386.7L429.1 245.7C432.2 242.5 432.2 237.5 429.1 234.3L277.7 82.91C274.5 79.79 269.5 79.79 266.3 82.91L213.3 136L262.6 185.4C275.1 197.9 275.1 218.1 262.6 230.6C250.1 243.1 229.9 243.1 217.4 230.6L168 181.3L75.88 273.4z"/></svg>"""
		else -> null
	}
	
}
