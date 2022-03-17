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

object FA_I_BEAM_CURSOR: Icon {
	
	override val name get() = "I Beam Cursor"
	
	override val unicode get() = "f246"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 256 512"><path d="M256 480c0 17.69-14.33 31.1-32 31.1c-38.41 0-72.52-17.35-96-44.23c-23.48 26.88-57.59 44.23-96 44.23c-17.67 0-32-14.31-32-31.1s14.33-32 32-32c35.3 0 64-28.72 64-64V288H64C46.33 288 32 273.7 32 256s14.33-32 32-32h32V128c0-35.28-28.7-64-64-64C14.33 64 0 49.69 0 32s14.33-32 32-32c38.41 0 72.52 17.35 96 44.23c23.48-26.88 57.59-44.23 96-44.23c17.67 0 32 14.31 32 32s-14.33 32-32 32c-35.3 0-64 28.72-64 64v96h32c17.67 0 32 14.31 32 32s-14.33 32-32 32h-32v96c0 35.28 28.7 64 64 64C241.7 448 256 462.3 256 480z"/></svg>"""
		else -> null
	}
	
}
