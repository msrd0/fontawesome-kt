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

object FA_WEIGHT_SCALE: Icon {
	
	override val name get() = "Weight scale"
	
	override val unicode get() = "f496"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M310.3 97.25c-8-3.5-17.5 .25-21 8.5L255.8 184C233.8 184.3 216 202 216 224c0 22.12 17.88 40 40 40S296 246.1 296 224c0-10.5-4.25-20-11-27.12l33.75-78.63C322.3 110.1 318.4 100.8 310.3 97.25zM448 64h-56.23C359.5 24.91 310.7 0 256 0S152.5 24.91 120.2 64H64C28.75 64 0 92.75 0 128v320c0 35.25 28.75 64 64 64h384c35.25 0 64-28.75 64-64V128C512 92.75 483.3 64 448 64zM256 304c-70.58 0-128-57.42-128-128s57.42-128 128-128c70.58 0 128 57.42 128 128S326.6 304 256 304z"/></svg>"""
		else -> null
	}
	
}

val FA_WEIGHT = FA_WEIGHT_SCALE
