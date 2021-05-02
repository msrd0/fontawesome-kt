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

object FA_RULER: Icon {
	
	override val name get() = "Ruler"
	
	override val unicode get() = "f545"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M635.7 167.2L556.1 31.7c-8.8-15-28.3-20.1-43.5-11.5l-69 39.1L503.3 161c2.2 3.8.9 8.5-2.9 10.7l-13.8 7.8c-3.8 2.2-8.7.9-10.9-2.9L416 75l-55.2 31.3 27.9 47.4c2.2 3.8.9 8.5-2.9 10.7l-13.8 7.8c-3.8 2.2-8.7.9-10.9-2.9L333.2 122 278 153.3 337.8 255c2.2 3.7.9 8.5-2.9 10.7l-13.8 7.8c-3.8 2.2-8.7.9-10.9-2.9l-59.7-101.7-55.2 31.3 27.9 47.4c2.2 3.8.9 8.5-2.9 10.7l-13.8 7.8c-3.8 2.2-8.7.9-10.9-2.9l-27.9-47.5-55.2 31.3 59.7 101.7c2.2 3.7.9 8.5-2.9 10.7l-13.8 7.8c-3.8 2.2-8.7.9-10.9-2.9L84.9 262.9l-69 39.1C.7 310.7-4.6 329.8 4.2 344.8l79.6 135.6c8.8 15 28.3 20.1 43.5 11.5L624.1 210c15.2-8.6 20.4-27.8 11.6-42.8z"/></svg>"""
		else -> null
	}
	
}
