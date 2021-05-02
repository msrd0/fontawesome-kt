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

object FA_ICICLES: Icon {
	
	override val name get() = "Icicles"
	
	override val unicode get() = "f7ad"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M511.4 37.9C515.1 18.2 500 0 480 0H32C10.6 0-4.8 20.7 1.4 41.2l87.1 273.4c2.5 7.2 12.7 7.2 15.1 0L140 190.5l44.2 187.3c1.9 8.3 13.7 8.3 15.6 0l46.5-196.9 34.1 133.4c2.3 7.6 13 7.6 15.3 0l45.8-172.5 66.7 363.8c1.7 8.6 14 8.6 15.7 0l87.5-467.7z"/></svg>"""
		else -> null
	}
	
}
