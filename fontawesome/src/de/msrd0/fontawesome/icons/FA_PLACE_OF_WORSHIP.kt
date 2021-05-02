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

object FA_PLACE_OF_WORSHIP: Icon {
	
	override val name get() = "Place of Worship"
	
	override val unicode get() = "f67f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M620.61 366.55L512 320v192h112c8.84 0 16-7.16 16-16V395.96a32 32 0 0 0-19.39-29.41zM0 395.96V496c0 8.84 7.16 16 16 16h112V320L19.39 366.55A32 32 0 0 0 0 395.96zm464.46-149.28L416 217.6V102.63c0-8.49-3.37-16.62-9.38-22.63L331.31 4.69c-6.25-6.25-16.38-6.25-22.62 0L233.38 80c-6 6-9.38 14.14-9.38 22.63V217.6l-48.46 29.08A31.997 31.997 0 0 0 160 274.12V512h96v-96c0-35.35 28.66-64 64-64s64 28.65 64 64v96h96V274.12c0-11.24-5.9-21.66-15.54-27.44z"/></svg>"""
		else -> null
	}
	
}
