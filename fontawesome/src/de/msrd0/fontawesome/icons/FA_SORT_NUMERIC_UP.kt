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

object FA_SORT_NUMERIC_UP: Icon {
	
	override val name get() = "Sort Numeric Up"
	
	override val unicode get() = "f163"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M330.17 258.91a79 79 0 0 0-55 54.17c-14.27 51.05 21.19 97.77 68.83 102.53a84.07 84.07 0 0 1-20.85 12.91c-7.57 3.4-10.8 12.47-8.18 20.34l9.9 20c2.87 8.63 12.53 13.49 20.9 9.91 58-24.76 86.25-61.61 86.25-132V336c-.02-51.21-48.4-91.34-101.85-77.09zM352 356a20 20 0 1 1 20-20 20 20 0 0 1-20 20zM304 96h16v64h-16a16 16 0 0 0-16 16v32a16 16 0 0 0 16 16h96a16 16 0 0 0 16-16v-32a16 16 0 0 0-16-16h-16V48a16 16 0 0 0-16-16h-48a16 16 0 0 0-14.29 8.83l-16 32A16 16 0 0 0 304 96zM107.31 36.69a16 16 0 0 0-22.62 0l-80 96C-5.35 142.74 1.78 160 16 160h48v304a16 16 0 0 0 16 16h32a16 16 0 0 0 16-16V160h48c14.21 0 21.38-17.24 11.31-27.31z"/></svg>"""
		else -> null
	}
	
}
