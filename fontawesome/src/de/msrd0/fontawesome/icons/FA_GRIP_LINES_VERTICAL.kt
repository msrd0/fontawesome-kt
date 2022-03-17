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

/** Grip Lines Vertical */
object FA_GRIP_LINES_VERTICAL: Icon {
	
	override val name get() = "Grip Lines Vertical"
	
	override val unicode get() = "f7a5"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 192 512"><path d="M64 448C64 465.7 49.67 480 32 480C14.33 480 0 465.7 0 448V64C0 46.33 14.33 32 32 32C49.67 32 64 46.33 64 64V448zM192 448C192 465.7 177.7 480 160 480C142.3 480 128 465.7 128 448V64C128 46.33 142.3 32 160 32C177.7 32 192 46.33 192 64V448z"/></svg>"""
		else -> null
	}
	
}
