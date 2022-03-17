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

object FA_K: Icon {
	
	override val name get() = "K"
	
	override val unicode get() = "4b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M314.3 429.8c10.06 14.53 6.438 34.47-8.094 44.53c-5.562 3.844-11.91 5.688-18.19 5.688c-10.16 0-20.12-4.812-26.34-13.78L128.1 273.3L64 338.9v109.1c0 17.67-14.31 32-32 32s-32-14.33-32-32v-384C0 46.34 14.31 32.01 32 32.01S64 46.34 64 64.01v183.3l201.1-205.7c12.31-12.61 32.63-12.86 45.25-.5c12.62 12.34 12.88 32.61 .5 45.25l-137.2 140.3L314.3 429.8z"/></svg>"""
		else -> null
	}
	
}
