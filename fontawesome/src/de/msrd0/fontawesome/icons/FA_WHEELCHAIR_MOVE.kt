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

object FA_WHEELCHAIR_MOVE: Icon {
	
	override val name get() = "Wheelchair Move"
	
	override val unicode get() = "e2ce"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M416 48C416 74.51 394.5 96 368 96C341.5 96 320 74.51 320 48C320 21.49 341.5 0 368 0C394.5 0 416 21.49 416 48zM172.8 54.4C182.3 47.29 194.9 46 205.6 51.05L322.1 105.9C351.3 119.6 358.9 157.5 337.4 181.4L299.1 224H416C425.6 224 434.7 228.3 440.7 235.7C446.8 243.1 449.3 252.9 447.4 262.3L415.4 422.3C411.9 439.6 395.1 450.8 377.7 447.4C360.4 443.9 349.2 427.1 352.6 409.7L376.1 288H306.7C315.3 307.6 320 329.2 320 352C320 440.4 248.4 512 160 512C71.63 512 0 440.4 0 352C0 263.6 71.63 192 160 192C171.1 192 181.1 193.1 192.4 195.3L246.6 141.1L195.8 117.2L147.2 153.6C133.1 164.2 113 161.3 102.4 147.2C91.8 133.1 94.66 113 108.8 102.4L172.8 54.4zM160 448C213 448 256 405 256 352C256 298.1 213 256 160 256C106.1 256 64 298.1 64 352C64 405 106.1 448 160 448z"/></svg>"""
		else -> null
	}
	
}

val FA_WHEELCHAIR_ALT = FA_WHEELCHAIR_MOVE
