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

/** 8 */
object FA_8: Icon {
	
	override val name get() = "8"
	
	override val unicode get() = "38"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M267.5 249.2C290 226.1 304 194.7 304 160c0-70.58-57.42-128-128-128h-32c-70.58 0-128 57.42-128 128c0 34.7 13.99 66.12 36.48 89.19C20.83 272.5 0 309.8 0 352c0 70.58 57.42 128 128 128h64c70.58 0 128-57.42 128-128C320 309.8 299.2 272.5 267.5 249.2zM144 96.01h32c35.3 0 64 28.7 64 64s-28.7 64-64 64h-32c-35.3 0-64-28.7-64-64S108.7 96.01 144 96.01zM192 416H128c-35.3 0-64-28.7-64-64s28.7-64 64-64h64c35.3 0 64 28.7 64 64S227.3 416 192 416z"/></svg>"""
		else -> null
	}
	
}
