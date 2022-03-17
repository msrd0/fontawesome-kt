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

/** Chair */
object FA_CHAIR: Icon {
	
	override val name get() = "Chair"
	
	override val unicode get() = "f6c0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M445.1 338.6l-14.77-32C425.1 295.3 413.7 288 401.2 288H46.76C34.28 288 22.94 295.3 17.7 306.6l-14.77 32c-4.563 9.906-3.766 21.47 2.109 30.66S21.09 384 31.1 384l.001 112c0 8.836 7.164 16 16 16h32c8.838 0 16-7.164 16-16V384h256v112c0 8.836 7.164 16 16 16h31.1c8.838 0 16-7.164 16-16L416 384c10.91 0 21.08-5.562 26.95-14.75S449.6 348.5 445.1 338.6zM111.1 128c0-29.48 16.2-54.1 40-68.87L151.1 256h48l.0092-208h48L247.1 256h48l.0093-196.9C319.8 73 335.1 98.52 335.1 128l-.0094 128h48.03l-.0123-128c0-70.69-57.31-128-128-128H191.1C121.3 0 63.98 57.31 63.98 128l.0158 128h47.97L111.1 128z"/></svg>"""
		else -> null
	}
	
}
