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

object FA_CRYING_FACE: Icon {
	
	override val name get() = "Crying Face"
	
	override val unicode get() = "f5b3"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512"><path d="M248 8C111 8 0 119 0 256c0 90.1 48.2 168.7 120 212.1V288c0-8.8 7.2-16 16-16s16 7.2 16 16v196.7c29.5 12.4 62 19.3 96 19.3s66.5-6.9 96-19.3V288c0-8.8 7.2-16 16-16s16 7.2 16 16v180.1C447.8 424.7 496 346 496 256 496 119 385 8 248 8zm-65.5 216.5c-14.8-13.2-46.2-13.2-61 0L112 233c-3.8 3.3-9.3 4-13.7 1.6-4.4-2.4-6.9-7.4-6.1-12.4 4-25.2 34.2-42.1 59.9-42.1S208 197 212 222.2c.8 5-1.7 10-6.1 12.4-5.8 3.1-11.2.7-13.7-1.6l-9.7-8.5zM248 416c-26.5 0-48-28.7-48-64s21.5-64 48-64 48 28.7 48 64-21.5 64-48 64zm149.8-181.5c-5.8 3.1-11.2.7-13.7-1.6l-9.5-8.5c-14.8-13.2-46.2-13.2-61 0L304 233c-3.8 3.3-9.3 4-13.7 1.6-4.4-2.4-6.9-7.4-6.1-12.4 4-25.2 34.2-42.1 59.9-42.1S400 197 404 222.2c.6 4.9-1.8 9.9-6.2 12.3z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512"><path d="M248 8C111 8 0 119 0 256s111 248 248 248 248-111 248-248S385 8 248 8zm144 386.4V280c0-13.2-10.8-24-24-24s-24 10.8-24 24v151.4C315.5 447 282.8 456 248 456s-67.5-9-96-24.6V280c0-13.2-10.8-24-24-24s-24 10.8-24 24v114.4c-34.6-36-56-84.7-56-138.4 0-110.3 89.7-200 200-200s200 89.7 200 200c0 53.7-21.4 102.5-56 138.4zM205.8 234.5c4.4-2.4 6.9-7.4 6.1-12.4-4-25.2-34.2-42.1-59.8-42.1s-55.9 16.9-59.8 42.1c-.8 5 1.7 10 6.1 12.4 4.4 2.4 9.9 1.8 13.7-1.6l9.5-8.5c14.8-13.2 46.2-13.2 61 0l9.5 8.5c2.5 2.3 7.9 4.8 13.7 1.6zM344 180c-25.7 0-55.9 16.9-59.8 42.1-.8 5 1.7 10 6.1 12.4 4.5 2.4 9.9 1.8 13.7-1.6l9.5-8.5c14.8-13.2 46.2-13.2 61 0l9.5 8.5c2.5 2.2 8 4.7 13.7 1.6 4.4-2.4 6.9-7.4 6.1-12.4-3.9-25.2-34.1-42.1-59.8-42.1zm-96 92c-30.9 0-56 28.7-56 64s25.1 64 56 64 56-28.7 56-64-25.1-64-56-64z"/></svg>"""
		else -> null
	}
	
}
