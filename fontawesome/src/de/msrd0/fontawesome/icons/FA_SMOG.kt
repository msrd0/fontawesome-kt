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

object FA_SMOG: Icon {
	
	override val name get() = "Smog"
	
	override val unicode get() = "f75f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M624 368H80c-8.8 0-16 7.2-16 16v16c0 8.8 7.2 16 16 16h544c8.8 0 16-7.2 16-16v-16c0-8.8-7.2-16-16-16zm-480 96H16c-8.8 0-16 7.2-16 16v16c0 8.8 7.2 16 16 16h128c8.8 0 16-7.2 16-16v-16c0-8.8-7.2-16-16-16zm416 0H224c-8.8 0-16 7.2-16 16v16c0 8.8 7.2 16 16 16h336c8.8 0 16-7.2 16-16v-16c0-8.8-7.2-16-16-16zM144 288h156.1c22.5 19.7 51.6 32 83.9 32s61.3-12.3 83.9-32H528c61.9 0 112-50.1 112-112S589.9 64 528 64c-18 0-34.7 4.6-49.7 12.1C454 31 406.8 0 352 0c-41 0-77.8 17.3-104 44.8C221.8 17.3 185 0 144 0 64.5 0 0 64.5 0 144s64.5 144 144 144z"/></svg>"""
		else -> null
	}
	
}
