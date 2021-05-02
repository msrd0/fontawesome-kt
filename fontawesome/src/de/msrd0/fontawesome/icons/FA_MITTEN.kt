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

object FA_MITTEN: Icon {
	
	override val name get() = "Mitten"
	
	override val unicode get() = "f7b5"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M368 416H48c-8.8 0-16 7.2-16 16v64c0 8.8 7.2 16 16 16h320c8.8 0 16-7.2 16-16v-64c0-8.8-7.2-16-16-16zm57-209.1c-27.2-22.6-67.5-19-90.1 8.2l-20.9 25-29.6-128.4c-18-77.5-95.4-125.9-172.8-108C34.2 21.6-14.2 98.9 3.7 176.4L51.6 384h309l72.5-87c22.7-27.2 19-67.5-8.1-90.1z"/></svg>"""
		else -> null
	}
	
}
