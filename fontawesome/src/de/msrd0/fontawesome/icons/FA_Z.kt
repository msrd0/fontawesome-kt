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

object FA_Z: Icon {
	
	override val name get() = "Z"
	
	override val unicode get() = "5a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M384 448c0 17.67-14.31 32-32 32H32c-12.41 0-23.72-7.188-28.97-18.42c-5.281-11.25-3.562-24.53 4.375-34.06l276.3-331.5H32c-17.69 0-32-14.33-32-32s14.31-32 32-32h320c12.41 0 23.72 7.188 28.97 18.42c5.281 11.25 3.562 24.53-4.375 34.06L100.3 416H352C369.7 416 384 430.3 384 448z"/></svg>"""
		else -> null
	}
	
}
