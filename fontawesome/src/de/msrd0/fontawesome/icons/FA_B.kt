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

/** B */
object FA_B: Icon {
	
	override val name get() = "B"
	
	override val unicode get() = "42"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M257.1 242.4C276.1 220.1 288 191.6 288 160c0-70.58-57.42-128-128-128H32c-17.67 0-32 14.33-32 32v384c0 17.67 14.33 32 32 32l160-.0049c70.58 0 128-57.42 128-128C320 305.3 294.6 264.8 257.1 242.4zM64 96.01h96c35.3 0 64 28.7 64 64s-28.7 64-64 64H64V96.01zM192 416H64v-128h128c35.3 0 64 28.7 64 64S227.3 416 192 416z"/></svg>"""
		else -> null
	}
	
}
