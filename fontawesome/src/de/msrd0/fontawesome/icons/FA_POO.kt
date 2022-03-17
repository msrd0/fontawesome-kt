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

/** Poo */
object FA_POO: Icon {
	
	override val name get() = "Poo"
	
	override val unicode get() = "f2fe"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M451.4 369.1C468.8 356 480 335.4 480 312c0-39.75-32.25-72-72-72h-14.12C407.3 228.2 416 211.2 416 191.1c0-35.25-28.75-63.1-64-63.1h-5.875C349.8 117.9 352 107.2 352 95.1c0-53-43-96-96-96c-5.25 0-10.25 .75-15.12 1.5C250.3 14.62 256 30.62 256 47.1c0 44.25-35.75 80-80 80H160c-35.25 0-64 28.75-64 63.1c0 19.25 8.75 36.25 22.12 48H104C64.25 239.1 32 272.3 32 312c0 23.38 11.25 44 28.62 57.13C26.25 374.6 0 404.1 0 440C0 479.8 32.25 512 72 512h368c39.75 0 72-32.25 72-72C512 404.1 485.8 374.6 451.4 369.1zM192 256c17.75 0 32 14.25 32 32s-14.25 32-32 32S160 305.8 160 288S174.3 256 192 256zM351.5 395C340.1 422.9 292.1 448 256 448c-36.99 0-84.98-25.12-95.48-53C158.5 389.8 162.5 384 168.3 384h175.5C349.5 384 353.5 389.8 351.5 395zM320 320c-17.75 0-32-14.25-32-32s14.25-32 32-32s32 14.25 32 32S337.8 320 320 320z"/></svg>"""
		else -> null
	}
	
}
