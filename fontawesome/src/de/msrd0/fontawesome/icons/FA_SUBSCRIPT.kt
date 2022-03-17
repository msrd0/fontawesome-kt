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

object FA_SUBSCRIPT: Icon {
	
	override val name get() = "subscript"
	
	override val unicode get() = "f12c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M480 448v-128c0-11.09-5.75-21.38-15.17-27.22c-9.422-5.875-21.25-6.344-31.14-1.406l-32 16c-15.81 7.906-22.22 27.12-14.31 42.94c5.609 11.22 16.89 17.69 28.62 17.69v80c-17.67 0-32 14.31-32 32s14.33 32 32 32h64c17.67 0 32-14.31 32-32S497.7 448 480 448zM320 128c17.67 0 32-14.31 32-32s-14.33-32-32-32l-32-.0024c-10.44 0-20.23 5.101-26.22 13.66L176 200.2L90.22 77.67C84.23 69.11 74.44 64.01 64 64.01L32 64.01c-17.67 0-32 14.32-32 32s14.33 32 32 32h15.34L136.9 256l-89.6 128H32c-17.67 0-32 14.31-32 32s14.33 31.1 32 31.1l32-.0024c10.44 0 20.23-5.086 26.22-13.65L176 311.8l85.78 122.5C267.8 442.9 277.6 448 288 448l32 .0024c17.67 0 32-14.31 32-31.1s-14.33-32-32-32h-15.34l-89.6-128l89.6-127.1H320z"/></svg>"""
		else -> null
	}
	
}
