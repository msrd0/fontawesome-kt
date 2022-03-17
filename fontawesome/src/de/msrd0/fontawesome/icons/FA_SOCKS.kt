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

object FA_SOCKS: Icon {
	
	override val name get() = "Socks"
	
	override val unicode get() = "f696"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M319.1 32c0-11 3.125-21.25 8-30.38C325.4 .8721 322.9 0 319.1 0H192C174.4 0 159.1 14.38 159.1 32l.0042 32h160L319.1 32zM246.6 310.1l73.36-55l.0026-159.1h-160l-.0042 175.1l-86.64 64.61c-39.38 29.5-53.86 84.4-29.24 127c18.25 31.62 51.1 48.36 83.97 48.36c20 0 40.26-6.225 57.51-19.22l21.87-16.38C177.6 421 193.9 350.6 246.6 310.1zM351.1 271.1l-86.13 64.61c-39.37 29.5-53.86 84.4-29.23 127C254.9 495.3 287.2 512 320.1 512c20 0 40.25-6.25 57.5-19.25l115.2-86.38C525 382.3 544 344.2 544 303.1v-207.1h-192L351.1 271.1zM512 0h-128c-17.62 0-32 14.38-32 32l-.0003 32H544V32C544 14.38 529.6 0 512 0z"/></svg>"""
		else -> null
	}
	
}
