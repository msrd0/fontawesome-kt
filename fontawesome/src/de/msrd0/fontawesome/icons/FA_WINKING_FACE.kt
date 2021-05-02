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
import de.msrd0.fontawesome.Style.REGULAR

object FA_WINKING_FACE: Icon {
	
	override val name get() = "Winking Face"
	
	override val unicode get() = "f4da"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512"><path d="M0 256c0 137 111 248 248 248s248-111 248-248S385 8 248 8 0 119 0 256zm200-48c0 17.7-14.3 32-32 32s-32-14.3-32-32 14.3-32 32-32 32 14.3 32 32zm158.5 16.5c-14.8-13.2-46.2-13.2-61 0L288 233c-8.3 7.4-21.6.4-19.8-10.8 4-25.2 34.2-42.1 59.9-42.1S384 197 388 222.2c1.7 11.1-11.4 18.3-19.8 10.8l-9.7-8.5zM157.8 325.8C180.2 352.7 213 368 248 368s67.8-15.4 90.2-42.2c13.6-16.2 38.1 4.2 24.6 20.5C334.3 380.4 292.5 400 248 400s-86.3-19.6-114.8-53.8c-13.5-16.3 11.2-36.7 24.6-20.4z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512"><path d="M248 8C111 8 0 119 0 256s111 248 248 248 248-111 248-248S385 8 248 8zm0 448c-110.3 0-200-89.7-200-200S137.7 56 248 56s200 89.7 200 200-89.7 200-200 200zm117.8-146.4c-10.2-8.5-25.3-7.1-33.8 3.1-20.8 25-51.5 39.4-84 39.4s-63.2-14.3-84-39.4c-8.5-10.2-23.7-11.5-33.8-3.1-10.2 8.5-11.5 23.6-3.1 33.8 30 36 74.1 56.6 120.9 56.6s90.9-20.6 120.9-56.6c8.5-10.2 7.1-25.3-3.1-33.8zM168 240c17.7 0 32-14.3 32-32s-14.3-32-32-32-32 14.3-32 32 14.3 32 32 32zm160-60c-25.7 0-55.9 16.9-59.9 42.1-1.7 11.2 11.5 18.2 19.8 10.8l9.5-8.5c14.8-13.2 46.2-13.2 61 0l9.5 8.5c8.5 7.4 21.6.3 19.8-10.8-3.8-25.2-34-42.1-59.7-42.1z"/></svg>"""
		else -> null
	}
	
}
