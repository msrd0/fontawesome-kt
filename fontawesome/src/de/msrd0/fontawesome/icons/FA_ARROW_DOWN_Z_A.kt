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

object FA_ARROW_DOWN_Z_A: Icon {
	
	override val name get() = "Arrow down z a"
	
	override val unicode get() = "f881"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M104.4 470.1c12.12 13.26 35.06 13.26 47.19 0l87.1-96.09c11.94-13.05 11.06-33.31-1.969-45.27c-13.02-11.95-33.27-11.04-45.22 1.973L160 366.1V64.03c0-17.7-14.33-32.03-32-32.03S96 46.33 96 64.03v302l-32.4-35.39c-6.312-6.883-14.94-10.39-23.61-10.39c-7.719 0-15.47 2.785-21.61 8.414c-13.03 11.95-13.9 32.22-1.969 45.27L104.4 470.1zM320 96h50.75l-73.38 73.38c-9.156 9.156-11.89 22.91-6.938 34.88s16.63 19.74 29.56 19.74h127.1C465.7 223.1 480 209.7 480 192s-14.33-32-32-32h-50.75l73.38-73.38c9.156-9.156 11.89-22.91 6.938-34.88S460.9 32 447.1 32h-127.1C302.3 32 288 46.31 288 64S302.3 96 320 96zM492.6 433.3l-79.99-160.1c-10.84-21.81-46.4-21.81-57.24 0l-79.99 160.1c-7.906 15.91-1.5 35.24 14.31 43.19c15.87 7.922 35.04 1.477 42.93-14.4l7.154-14.39h88.43l7.154 14.39c6.174 12.43 23.97 23.87 42.93 14.4C494.1 468.6 500.5 449.2 492.6 433.3zM367.8 391.4L384 358.7l16.22 32.63H367.8z"/></svg>"""
		else -> null
	}
	
}

val FA_SORT_ALPHA_DESC = FA_ARROW_DOWN_Z_A

val FA_SORT_ALPHA_DOWN_ALT = FA_ARROW_DOWN_Z_A
