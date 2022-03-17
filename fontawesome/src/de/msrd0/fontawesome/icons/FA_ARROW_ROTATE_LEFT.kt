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

/** Arrow Rotate Left */
object FA_ARROW_ROTATE_LEFT: Icon {
	
	override val name get() = "Arrow Rotate Left"
	
	override val unicode get() = "f0e2"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M480 256c0 123.4-100.5 223.9-223.9 223.9c-48.86 0-95.19-15.58-134.2-44.86c-14.14-10.59-17-30.66-6.391-44.81c10.61-14.09 30.69-16.97 44.8-6.375c27.84 20.91 61 31.94 95.89 31.94C344.3 415.8 416 344.1 416 256s-71.67-159.8-159.8-159.8C205.9 96.22 158.6 120.3 128.6 160H192c17.67 0 32 14.31 32 32S209.7 224 192 224H48c-17.67 0-32-14.31-32-32V48c0-17.69 14.33-32 32-32s32 14.31 32 32v70.23C122.1 64.58 186.1 32.11 256.1 32.11C379.5 32.11 480 132.6 480 256z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_ARROW_ROTATE_LEFT]. */
val FA_ARROW_LEFT_ROTATE = FA_ARROW_ROTATE_LEFT

/** Alias for [FA_ARROW_ROTATE_LEFT]. */
val FA_ARROW_ROTATE_BACK = FA_ARROW_ROTATE_LEFT

/** Alias for [FA_ARROW_ROTATE_LEFT]. */
val FA_ARROW_ROTATE_BACKWARD = FA_ARROW_ROTATE_LEFT

/** Alias for [FA_ARROW_ROTATE_LEFT]. */
val FA_UNDO = FA_ARROW_ROTATE_LEFT
