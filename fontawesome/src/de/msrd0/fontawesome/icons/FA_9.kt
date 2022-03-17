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

/** 9 */
object FA_9: Icon {
	
	override val name get() = "9"
	
	override val unicode get() = "39"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M160 32.01c-88.22 0-160 71.78-160 160c0 85.57 67.71 155.1 152.3 159.2l-64.65 76.06c-11.47 13.45-9.812 33.66 3.656 45.09c6 5.125 13.38 7.62 20.72 7.62c9.062 0 18.06-3.823 24.38-11.28C281.9 297.5 320 266.6 320 192C320 103.8 248.2 32.01 160 32.01zM160 288c-52.94 0-96-43.06-96-95.1s43.06-96 96-96s96 43.06 96 96S212.9 288 160 288z"/></svg>"""
		else -> null
	}
	
}
