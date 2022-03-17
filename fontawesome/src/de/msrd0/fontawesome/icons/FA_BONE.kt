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

/** Bone */
object FA_BONE: Icon {
	
	override val name get() = "Bone"
	
	override val unicode get() = "f5d7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M534.9 267.5C560.1 280 576 305.8 576 334v4.387c0 35.55-23.49 68.35-58.24 75.88c-38.18 8.264-74.96-13.73-86.76-49.14c-.0352-.1035-.0684-.207-.1035-.3125C425.3 347.7 409.6 336 391.6 336H184.4c-17.89 0-33.63 11.57-39.23 28.56L145 365.1c-11.8 35.41-48.58 57.4-86.76 49.14C23.49 406.7 0 373.9 0 338.4v-4.387C0 305.8 15.88 280 41.13 267.5c9.375-4.75 9.375-18.25 0-23C15.88 232 0 206.3 0 178V173.6c0-35.55 23.49-68.35 58.24-75.88c38.18-8.264 74.99 13.82 86.79 49.23C150.7 164.1 166.4 176 184.4 176h207.2c17.89 0 33.63-11.57 39.23-28.56L431 146.9c11.8-35.41 48.58-57.4 86.76-49.14C552.5 105.3 576 138.1 576 173.6v4.387C576 206.3 560.1 232 534.9 244.5C525.5 249.3 525.5 262.8 534.9 267.5z"/></svg>"""
		else -> null
	}
	
}
