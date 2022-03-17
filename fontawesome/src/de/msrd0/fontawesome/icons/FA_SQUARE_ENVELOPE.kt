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

/** Square envelope */
object FA_SQUARE_ENVELOPE: Icon {
	
	override val name get() = "Square envelope"
	
	override val unicode get() = "f199"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M384 32H64C28.63 32 0 60.63 0 96v320c0 35.38 28.62 64 64 64h320c35.38 0 64-28.62 64-64V96C448 60.63 419.4 32 384 32zM384 336c0 17.67-14.33 32-32 32H96c-17.67 0-32-14.33-32-32V225.9l138.5 69.27C209.3 298.5 216.6 300.2 224 300.2s14.75-1.688 21.47-5.047L384 225.9V336zM384 190.1l-152.8 76.42c-4.5 2.25-9.812 2.25-14.31 0L64 190.1V176c0-17.67 14.33-32 32-32h256c17.67 0 32 14.33 32 32V190.1z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SQUARE_ENVELOPE]. */
val FA_ENVELOPE_SQUARE = FA_SQUARE_ENVELOPE
