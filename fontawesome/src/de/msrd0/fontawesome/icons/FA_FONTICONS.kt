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
import de.msrd0.fontawesome.Style.BRANDS

/** Fonticons */
object FA_FONTICONS: Icon {
	
	override val name get() = "Fonticons"
	
	override val unicode get() = "f280"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M0 32v448h448V32zm187 140.9c-18.4 0-19 9.9-19 27.4v23.3c0 2.4-3.5 4.4-.6 4.4h67.4l-11.1 37.3H168v112.9c0 5.8-2 6.7 3.2 7.3l43.5 4.1v25.1H84V389l21.3-2c5.2-.6 6.7-2.3 6.7-7.9V267.7c0-2.3-2.9-2.3-5.8-2.3H84V228h28v-21c0-49.6 26.5-70 77.3-70 34.1 0 64.7 8.2 64.7 52.8l-50.7 6.1c.3-18.7-4.4-23-16.3-23zm74.3 241.8v-25.1l20.4-2.6c5.2-.6 7.6-1.7 7.6-7.3V271.8c0-4.1-2.9-6.7-6.7-7.9l-24.2-6.4 6.7-29.5h80.2v151.7c0 5.8-2.6 6.4 2.9 7.3l15.7 2.6v25.1zm80.8-255.5l9 33.2-7.3 7.3-31.2-16.6-31.2 16.6-7.3-7.3 9-33.2-21.8-24.2 3.5-9.6h27.7l15.5-28h9.3l15.5 28h27.7l3.5 9.6z"/></svg>"""
		else -> null
	}
	
}
